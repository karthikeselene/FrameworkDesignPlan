package com.fdp.java.di.consumer;

import com.fdp.java.di.service.MessageService;

public class MyDIApplication {
	
	private MessageService service;
	
	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}
	
	public void processMessage(String msg, String rec) {
		this.service.sendMessage(msg, rec);
	}

}