package com.sample.flink_example.streaming;

import java.util.Properties;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.java.utils.MultipleParameterTool;
import org.apache.flink.shaded.curator.org.apache.curator.shaded.com.google.common.base.Preconditions;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer.Semantic;

import com.sample.flink_example.streaming.serializer.ProducerStringSerializationSchema;

// --ip --port --topicin --topicout 
public class FlinkKafkaStreamProcessing {
	private static String ip;
	private static String port;
	private static String inTopic;
	private static String outTopic;

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = setupEnvironment();
		// Checking input parameters
		final MultipleParameterTool params = MultipleParameterTool.fromArgs(args);
		// make parameters available in the web interface
		env.getConfig().setGlobalJobParameters(params);
		init(params);

		DataStream<String> stream = env.addSource(new FlinkKafkaConsumer<>(inTopic, new SimpleStringSchema(),
				CommonConfig.getConsumerProperties(ip, port, inTopic)));

		DataStream<String> outputStream = stream.map(data -> Long.parseLong(data) * Long.parseLong(data))
				.map(data -> data + " Processed");

		FlinkKafkaProducer<String> kafkaProducer = new FlinkKafkaProducer<>(outTopic,
				new ProducerStringSerializationSchema(outTopic), CommonConfig.getProducerProperties(ip, port),
				Semantic.AT_LEAST_ONCE);
		outputStream.addSink(kafkaProducer);

		System.out.println("Executed job with arg -> " + ip + "-" + port + "-" + inTopic + "-" + outTopic);
		System.out.println("Printing result to stdout. ");
		// execute program
		env.execute("Streaming Kafka Record");
	}

	private static void init(MultipleParameterTool params) {
		initIp(params);
		initPort(params);
		initInTopic(params);
		initOutTopic(params);
	}

	/**
	 * @param params
	 */
	private static void initOutTopic(MultipleParameterTool params) {
		if (params.has("topicout")) {
			for (String argTopic : params.getMultiParameterRequired("topicout")) {
				if (argTopic != null) {
					outTopic = argTopic;
				} else {
					outTopic = "temp-out";
				}
			}
			Preconditions.checkNotNull(inTopic, "InTopic should not be null.");
		} else {
			outTopic = "temp-out";
		}
	}

	/**
	 * @param params
	 */
	private static void initInTopic(MultipleParameterTool params) {
		if (params.has("topicin")) {
			for (String argTopic : params.getMultiParameterRequired("topicin")) {
				if (argTopic != null) {
					inTopic = argTopic;
				} else {
					inTopic = "temp-in";
				}
			}
			Preconditions.checkNotNull(inTopic, "InTopic should not be null.");
		} else {
			inTopic = "temp-in";
		}
	}

	/**
	 * @param params
	 */
	private static void initPort(MultipleParameterTool params) {
		if (params.has("port")) {
			for (String argPort : params.getMultiParameterRequired("port")) {
				if (argPort != null) {
					port = argPort;
				} else {
					port = "9092";
				}
			}
			Preconditions.checkNotNull(port, "Port should not be null.");
		} else {
			port = "9092";
		}
	}

	/**
	 * @param params
	 */
	private static void initIp(MultipleParameterTool params) {
		if (params.has("ip")) {
			for (String argIp : params.getMultiParameterRequired("ip")) {
				if (argIp != null) {
					ip = argIp;
				} else {
					ip = "localhost";
				}
			}
			Preconditions.checkNotNull(ip, "Ip should not be null.");
		} else {
			ip = "localhost";
		}
	}

	/**
	 * @return
	 */
	private static StreamExecutionEnvironment setupEnvironment() {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		env.enableCheckpointing(5000); // checkpoint every 5000 msecs
		return env;
	}

	/**
	 * @return
	 */
	private static Properties getConsumerProperties() {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", ip + ":" + port);
		properties.setProperty("group.id", inTopic);
		return properties;
	}

	private static Properties getProducerProperties() {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", ip + ":" + port);
		return properties;
	}

}
