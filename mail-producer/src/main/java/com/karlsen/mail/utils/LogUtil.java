package com.karlsen.mail.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    private static Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void debug(String s) {
        logger.debug(s);
    }

    public static void info(String s) {
        logger.info(s);
    }

    public static void warn(String s) {
        logger.warn(s);
    }

    public static void error(String s) {
        logger.error(s);
    }

    public static void error(String s, Throwable e) {
        logger.error(s, e);
    }
}
