package com.ccg.jdklogging;

import java.util.logging.Logger;

/**
 * 需要添加 VM 参数: -Djava.util.logging.config.file=src/main/resources/jdk-logging.properties
 * <p> 或者(在玩)先调用 System.setProperty("java.util.logging.config.file", "src/main/resources/jdk-logging.properties");
 * <p>
 * The levels in descending order are:
 * <ul>
 * <li> SEVERE (highest value)
 * <li> WARNING
 * <li> INFO
 * <li> CONFIG
 * <li> FINE
 * <li> FINER
 * <li> FINEST (lowest value)
 * </ul>
 * <p>
 * Ref: <a href="https://www.liaoxuefeng.com/wiki/1252599548343744/1264738568571776">使用JDK Logging - 廖雪峰的官方网站</a>
 */
public class JDKGlobalLogging {
	public static void main(String[] args) {
		// System.setProperty("java.util.logging.config.file", "src/main/resources/jdk-logging.properties");

		// 因为走的global配置，所以不看org.ccg.jdklogging.JDKGlobalLogging.level配置
		Logger logger = Logger.getGlobal();
//		Logger logger = Logger.getLogger("JDKGlobalLogging");

		System.out.println("Logger class: " + logger.getClass());

		logger.info("start process...");
		logger.warning("memory is running out...");
		logger.fine("ignored.");
		logger.severe("process will be terminated...");
	}
}
