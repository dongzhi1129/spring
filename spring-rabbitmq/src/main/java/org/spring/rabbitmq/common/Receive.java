package org.spring.rabbitmq.common;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Receive implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Receive Message " + new String(message.getBody()));
		
	}
	
	

}
