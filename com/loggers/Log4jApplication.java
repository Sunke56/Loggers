package com.loggers;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jApplication {
    public static void main(String[] args) {

        Logger logger=Logger.getLogger(Log4jApplication.class);

        BasicConfigurator.configure();
        logger.setLevel(Level.ALL);

        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.error("This is error message");
        logger.fatal("This is fatal message");

    }
}
