package com.sample.flink_example.streaming;

import java.util.Properties;

public class CommonConfig {
	/**
	 * @return
	 */
	public static Properties getConsumerProperties(String ip, String port, String groupId) {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", ip + ":" + port);
		properties.setProperty("group.id", groupId);
		return properties;
	}

	public static Properties getProducerProperties(String ip, String port) {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", ip + ":" + port);
		return properties;
	}
}
