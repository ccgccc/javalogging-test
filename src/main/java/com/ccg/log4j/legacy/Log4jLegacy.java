package com.ccg.log4j.legacy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 这是Log4j 1版本，最后更新于2012年5月
 *
 * Ref:
 * [日志框架3：log4j_Cape_sir-CSDN博客](https://blog.csdn.net/weixin_42652596/article/details/117079405)
 * [日志框架4：log4j配置_Cape_sir-CSDN博客](https://blog.csdn.net/weixin_42652596/article/details/117216317)
 */
public class Log4jLegacy {
	private static Logger logger = Logger.getLogger(Log4jLegacy.class);

	public static void main(String[] args) {
		System.out.println("Logger class: " + logger.getClass());
		// 从字面意思上看非常简单，我们使用了一个基础配置器，并调用其configure()方法，即配置方法完成了配置。
		BasicConfigurator.configure();
		logger.debug("Debug Level");
		logger.info("Info Level");
		logger.warn("Warn Level");
		logger.error("Error Level");
	}
}
