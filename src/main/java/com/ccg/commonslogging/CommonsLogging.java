package com.ccg.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 1. org.apache.commons.logging.Log=org.apache.commons.logging.impl.Jdk14Logger
 * Commons Logging 对 JDK1.4 的日志对象封装
 * 需要添加 VM 参数: -Djava.util.logging.config.file=src/main/resources/commons-jdk14logger.properties
 * why -Djava.util.logging.config.file=commons-jdk14logger.properties can't?
 * 日志级别对应关系: trace:FINEST; debug:FINE; info:INFO; warn:WARNING; error,fatal: SEVERE
 *
 * Ref:
 * [java - Write log file using org.apache.commons.logging - Stack Overflow](https://stackoverflow.com/questions/11815642/write-log-file-using-org-apache-commons-logging)
 * [log4j - Commons logging to use java.util.logging - Stack Overflow](https://stackoverflow.com/questions/5124883/commons-logging-to-use-java-util-logging)
 *
 *
 * 2. org.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog
 * Commons Logging 自带 SimpleLog
 * 日志全打印到System.err,只有最简单的一些配置项
 *
 * Ref:
 * [java - commons-logging config: use SimpleLog & set debug level - Stack Overflow](https://stackoverflow.com/questions/1367047/commons-logging-config-use-simplelog-set-debug-level)
 *
 *
 * 3. org.apache.commons.logging.Log=org.apache.commons.logging.impl.Log4JLogger
 * Commons Logging + Log4j (不能有log4j-jcl, org.apache.commons.logging.impl.Log4JLogger)
 *
 *
 * 4. Log4j2 & SLF4J
 * Commons Logging + Log4j2 (需要log4j-jcl,并且优先log4j2而非log4j,不再看commons-logging.properties配置, org.apache.logging.log4j.jcl.Log4jLog)
 * Commons Logging + SLF4J (需要jcl-over-slf4j,不再看commons-logging.properties配置, org.apache.commons.logging.impl.SLF4JLocationAwareLog)
 * 注:
 * Commons Logging 通过 org.apache.commons.logging.LogFactory#SERVICE_ID="META-INF/services/org.apache.commons.logging.LogFactory"文件内容来定位jcl bridge
 * log4j-jcl 和 jcl-over-slf4j 同时存在时，选择顺序取决于-classpath中的位置(约等于maven中定义的位置)
 *
 * Ref:
 * [java 日志总结： logging，log4j1、log4j2、logback，&& commons-logging、slf4j 的关系_冬的博客-CSDN博客](https://blog.csdn.net/u012871914/article/details/84838969)
 */
public class CommonsLogging {
	private static Log logger = LogFactory.getLog(CommonsLogging.class);

	public static void main(String[] args) {
		System.out.println("Logger class: " + logger.getClass());
		logger.trace("Trace Level");
		logger.debug("Debug Level");
		logger.info("Info Level");
		logger.warn("Warn Level");
		logger.error("Error Level");
	}
}
