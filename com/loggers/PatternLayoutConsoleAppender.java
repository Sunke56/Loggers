package com.loggers;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class PatternLayoutConsoleAppender {

    public static void main(String[] args) {
        Logger logger=Logger.getLogger(SimpleLayoutConsoleAppender.class);

        PatternLayout layout=new PatternLayout("%r[%t] %p %c %x-%m %n");
        ConsoleAppender appender=new ConsoleAppender(layout);
        logger.addAppender(appender);

        logger.debug("Simple debug message");
        logger.info("Simple info message");
        logger.warn("Simple warn message");
        logger.error("Simple error message");
        logger.fatal("Simple fatal message");
    }
}
