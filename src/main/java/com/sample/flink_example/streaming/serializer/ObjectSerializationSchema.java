package com.sample.flink_example.streaming.serializer;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.streaming.connectors.kafka.KafkaSerializationSchema;
import org.apache.kafka.clients.producer.ProducerRecord;

import model.SensorEvent;

public class ObjectSerializationSchema implements KafkaSerializationSchema<SensorEvent> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5767214264592366022L;
	private String topic;
	private ObjectMapper mapper;

	public ObjectSerializationSchema(String topic) {
		super();
		this.topic = topic;
	}

	@Override
	public ProducerRecord<byte[], byte[]> serialize(SensorEvent obj, Long timestamp) {
		byte[] b = null;
		if (mapper == null) {
			mapper = new ObjectMapper();
		}
		try {
			b = mapper.writeValueAsBytes(obj);
		} catch (JsonProcessingException e) {
			// TODO
		}
		return new ProducerRecord<byte[], byte[]>(topic, b);
	}

}
