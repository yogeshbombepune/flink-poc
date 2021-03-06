package com.sample.flink_example.streaming;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.utils.MultipleParameterTool;
import org.apache.flink.shaded.curator.org.apache.curator.shaded.com.google.common.base.Preconditions;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer.Semantic;
import org.apache.flink.util.Collector;

import com.sample.flink_example.streaming.serializer.ObjectSerializationSchema;

import model.SensorEvent;

public class SensorDataStreamProcessing {

	public static void main(String[] args) throws Exception {
		// Checking input parameters
		final MultipleParameterTool params = MultipleParameterTool.fromArgs(args);

		// set up the execution environment
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		// make parameters available in the web interface
		env.getConfig().setGlobalJobParameters(params);

		ObjectMapper mapper = new ObjectMapper();

		DataStream<String> text = null;
		if (params.has("input")) {
			// union all the inputs from text files
			for (String input : params.getMultiParameterRequired("input")) {
				if (text == null) {
					text = env.readTextFile(input);
				} 
			}
			Preconditions.checkNotNull(text, "Input DataStream should not be null.");
		}

		DataStream<SensorEvent> flatMap = text.flatMap(new FlatMapFunction<String, SensorEvent>() {
			private static final long serialVersionUID = 1L;

			@Override
			public void flatMap(String value, Collector<SensorEvent> out) throws Exception {
				SensorEvent sensorEvent = null;
				try {
					sensorEvent = mapper.readValue(value, SensorEvent.class);
				} catch (Exception exception) {
					System.out.println(exception);
				}
				if (null != sensorEvent) {
					out.collect(sensorEvent);
				}
			}
		});

		FlinkKafkaProducer<SensorEvent> kafkaProducer = new FlinkKafkaProducer<>("sensor-event",
				new ObjectSerializationSchema("sensor-event"), CommonConfig.getProducerProperties("192.168.0.104","9092"),
				Semantic.AT_LEAST_ONCE);
		flatMap.addSink(kafkaProducer);
		System.out.println("Printing result to stdout. ");
		// execute program
		env.execute("Streaming Kafka Record");
	}

}
