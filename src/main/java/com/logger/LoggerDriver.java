package com.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDriver {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LoggerDriver.class);
		logger.error("THIS IS AN ERROR");
		logger.info("THIS IS AN INFO MESSAGE");
	}
}
