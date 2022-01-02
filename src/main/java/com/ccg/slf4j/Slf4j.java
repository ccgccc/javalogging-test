package com.ccg.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j StaticLoggerBinder加载顺序: 根据java执行命令中-classpath里jar包的顺序来加载，先加载放在前面的(通过java命令行执行调整顺序可验证)，
 * <p> maven生成执行命令时，-classpath和定义在pom文件中的顺序有一定关系(如果slf4j的实现都放在slf4j-api之后，那么查找顺序就是pom文件中定义的顺序)。
 * <p> Ref:
 * <p> <a href="https://blog.csdn.net/u012871914/article/details/84838969">java 日志总结： logging，log4j1、log4j2、logback，&& commons-logging、slf4j 的关系_冬的博客-CSDN博客</a>
 * <p> <a href="https://www.slf4j.org/codes.html#multiple_bindings">SLF4J Error Codes</a>
 * <p> <a href="https://www.slf4j.org/faq.html#changesInVersion18">SLF4J FAQ</a>
 *
 * <ul>
 * <li> 1. slf4j-nop : no operation, do nothing
 * <p> 输出到/dev/null,其实就是把日志吞了
 * <p>
 * <li> 2. slf4j-jdk14: for slf4j-jdk (org.slf4j.impl.JDK14LoggerAdapter)
 * <p> 需要添加 VM 参数: -Djava.util.logging.config.file=src/main/resources/jdk-logging.properties
 * <p>
 * <li> 3. slf4j-simple: slf4j simplelogger
 * <p>
 * <li> 4. logback-classic: for logback (ch.qos.logback.classic.Logger)
 * <p>
 * <li> 5. slf4j-log4j12: for log4j (org.slf4j.impl.Log4jLoggerAdapter)
 * <p>
 * <li> 6. log4j-slf4j-impl: for log4j2 (org.apache.logging.slf4j.Log4jLogger)
 * <p>
 * <li> 7. slf4j-jcl: for commons-logging (org.slf4j.impl.JCLLoggerAdapter)
 * <p>
 * <li> 8. 其他log方式均可转为slf4j
 * <p> jcl-over-slf4j (commons-logging to slf4j)
 * <p> log4j-over-slf4j (log4j to slf4j)
 * <p> jul-to-slf4j (java.util.logging to slf4j)
 * </ul>
 */
public class Slf4j {
	private static Logger logger = LoggerFactory.getLogger(Slf4j.class);

	public static void main(String[] args) {
		System.out.println("Logger class: " + logger.getClass());
		logger.trace("Trace Level");
		logger.debug("Debug Level");
		logger.info("Info Level");
		logger.warn("Warn Level");
		logger.error("Error Level");
	}
}
