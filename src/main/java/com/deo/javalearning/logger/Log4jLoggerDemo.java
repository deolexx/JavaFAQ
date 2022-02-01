package com.deo.javalearning.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jLoggerDemo {

    private static final Logger logger = LogManager.getLogger(Log4jLoggerDemo.class);

    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.debug("debug");
        logger.fatal("fatal");
        logger.error("error");
    }
}
