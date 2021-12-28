package com.ccg.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4J2 Demo
 *
 * Ref:
 * [三种日志记录方式 JDKLog、Log4J、LogBack、_weixin_34033624的博客-CSDN博客](https://blog.csdn.net/weixin_34033624/article/details/91830920)
 */
public class Log4j2Log {
	public static void main(String args[]) {
		Logger logger = LogManager.getLogger(Log4j2Log.class);
		System.out.println("Logger class: " + logger.getClass());
		// DEBUG < INFO < WARN < ERROR < FATAL
		logger.debug("Debug Level");
		logger.info("Info Level");
		logger.warn("Warn Level");
		logger.error("Error Level");
	}
}