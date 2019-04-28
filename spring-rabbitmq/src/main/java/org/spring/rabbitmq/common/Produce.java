package org.spring.rabbitmq.common;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class Produce {

	@Resource(name = "amqpTemplate")
	private RabbitTemplate amqpTemplate;

	public void sendMessage() {
		amqpTemplate.convertAndSend("spring-fanout-exchange", "", "hello word");
	}

}
