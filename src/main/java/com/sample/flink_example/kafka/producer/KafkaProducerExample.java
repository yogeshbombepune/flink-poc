package com.sample.flink_example.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerExample {

	public static void main(String[] args) throws InterruptedException {
		// Check arguments length value
		if (args.length < 3) {
			System.out.println("Enter topic name, ip and port");
			return;
		}

		// Assign topicName to string variable
		String topicName = args[2].toString();

		// create instance for properties to access producer configs
		Properties props = new Properties();

		String ip = null;
		String port = null;
		try {
			ip = args[0].toString();
			port = args[1].toString();
		} catch (Exception exp) {
			System.out.println("Enter ip and port");
			return;
		}

		if (ip != null && port != null) {
			props.put("bootstrap.servers", ip + ":" + port);
		} else {
			props.put("bootstrap.servers", "localhost:9092");
		}

		// Set acknowledgements for producer requests.
		props.put("acks", "all");

		// If the request fails, the producer can automatically retry,
		props.put("retries", 0);

		// Specify buffer size in config
		props.put("batch.size", 16384);

		// Reduce the no of requests less than 0
		props.put("linger.ms", 1);

		// The buffer.memory controls the total amount of memory available to the
		// producer for buffering.
		props.put("buffer.memory", 33554432);

		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		@SuppressWarnings("resource")
		Producer<String, String> producer = new KafkaProducer<String, String>(props);
		long i = 1;
		while (true) {
			ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>(topicName,
					Long.toString(i), Long.toString(i));
			Thread.sleep(100);
			producer.send(producerRecord);
			i++;
			System.out.println("Message " + i + " sent.");
		}
	}

}
