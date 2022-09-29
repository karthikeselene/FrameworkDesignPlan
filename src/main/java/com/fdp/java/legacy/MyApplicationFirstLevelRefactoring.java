package com.fdp.java.legacy;

public class MyApplicationFirstLevelRefactoring {

	private EmailService email = null;

	public MyApplicationFirstLevelRefactoring(EmailService svc) {
		this.email = svc;
	}

	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.email.sendMail(msg, rec);
	}

}