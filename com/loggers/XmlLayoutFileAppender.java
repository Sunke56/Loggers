package com.loggers;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

public class XmlLayoutFileAppender {
    public static void main(String[] args) throws IOException {

        Logger logger=Logger.getLogger(SimpleLayoutConsoleAppender.class);

        XMLLayout layout = new XMLLayout();
        FileAppender appender= new FileAppender(layout,"logs.xml");
        logger.addAppender(appender);

        logger.debug("Simple debug message");
        logger.info("Simple info message");
        logger.warn("Simple warn message");
        logger.error("Simple error message");
        logger.fatal("Simple fatal message");

    }
}
