package com.matovic.jmsconsumerspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@JmsListener(destination = "demo_queue")
	public void receiveMessage(String message){
		System.out.println(message);
	}
}
