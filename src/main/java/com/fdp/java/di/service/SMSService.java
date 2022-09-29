package com.fdp.java.di.service;

public class SMSService implements MessageService {

	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message "+msg);				
	}

}