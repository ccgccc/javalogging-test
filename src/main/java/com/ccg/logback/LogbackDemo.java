package com.ccg.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback + slf4j(dependency)
 * <p>
 * Ref:
 * <p> <a href="https://blog.csdn.net/weixin_42652596/article/details/117218918">日志框架5：logback_Cape_sir-CSDN博客</a>
 * <p> <a href="https://blog.csdn.net/weixin_42652596/article/details/117222027">日志框架6：logback相较于log4j的优势_Cape_sir-CSDN博客_logback和log4j哪个好</a>
 */
public class LogbackDemo {
	private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);

	public static void main(String[] args) {
		System.out.println("Logger class: " + log.getClass());
		log.trace("======trace");
		log.debug("======debug");
		log.info("======info");
		log.warn("======warn");
		log.error("======error");
		String name = "Aub";
		String message = "3Q";
		String[] fruits = {"apple", "banana"};
		// logback提供的可以使用变量的打印方式，结果为"Hello,Aub!"
		log.info("Hello,{}!", name);
		// 可以有多个参数,结果为“Hello,Aub! 3Q!”
		log.info("Hello,{}!   {}!", name, message);
		// 可以传入一个数组，结果为"Fruit:  apple,banana"
		log.info("Fruit:  {},{}", fruits);
	}
}
