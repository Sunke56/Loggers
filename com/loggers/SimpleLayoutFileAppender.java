package com.loggers;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;

public class SimpleLayoutFileAppender {
    public static void main(String[] args) throws IOException {

        Logger logger=Logger.getLogger(SimpleLayoutConsoleAppender.class);

        SimpleLayout layout=new SimpleLayout();
        FileAppender appender= new FileAppender(layout,"logs.txt");
        logger.addAppender(appender);

        logger.debug("Simple debug message");
        logger.info("Simple info message");
        logger.warn("Simple warn message");
        logger.error("Simple error message");
        logger.fatal("Simple fatal message");

    }
}
