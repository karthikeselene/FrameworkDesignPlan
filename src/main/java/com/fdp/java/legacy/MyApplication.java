package com.fdp.java.legacy;

public class MyApplication {
	
	private EmailService email = new EmailService();
	
	public void processMessages(String msg, String rec) {
		//do some msg validation, manipulation logic etc
		this.email.sendMail(msg, rec);
	}

}