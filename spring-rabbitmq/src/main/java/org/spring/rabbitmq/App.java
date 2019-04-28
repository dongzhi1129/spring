package org.spring.rabbitmq;

import org.spring.rabbitmq.common.Produce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring/spring-context.xml");
		Produce produce = (Produce) applicationContext.getBean("produce");
		produce.sendMessage();
	}
}
