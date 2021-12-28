package com.ccg.jdklogging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 需要添加 VM 参数: -Djava.util.logging.config.file=src/main/resources/jdk-logging.properties
 *
 * Ref:
 * [日志框架1：目前主流的日志框架_Cape_sir-CSDN博客_主流日志框架](https://blog.csdn.net/weixin_42652596/article/details/116920450)
 * [日志框架2：jdk-logging（jdk自带的logging）_Cape_sir-CSDN博客](https://blog.csdn.net/weixin_42652596/article/details/116922585)
 */
public class JDKLogging {
	// config: JDKLogging.level = FINE
	private static final Logger logger = Logger.getLogger(JDKLogging.class.getName());

	public static void main(String[] args) {
		System.out.println("Logger class: " + logger.getClass());
		// Log a FINE message
		logger.info("Main running.");
		logger.fine("doingstuff");
		try {
			Thread.currentThread().sleep(1000);// do some work
		} catch(Exception ex) {
			logger.log(Level.WARNING,"trouble sneezing", ex);
		}
		logger.fine("done");

	}
}
