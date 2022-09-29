package com.fdp.java.di.service;

public class EmailService implements MessageService {

	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message "+msg);
	}

}