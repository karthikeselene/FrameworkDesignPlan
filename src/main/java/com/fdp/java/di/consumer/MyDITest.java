package com.fdp.java.di.consumer;

import com.fdp.java.di.service.EmailService;
import com.fdp.java.di.service.SMSService;

public class MyDITest {	
	
	public static void main(String[] args) {
		MyDIApplication app;
		app = new MyDIApplication(new EmailService());
		app.processMessage("Welcome To Dec Month Bootcamp", "karthikeyan.r@testleaf.com");
		
		app = new MyDIApplication(new SMSService());
		app.processMessage("Welcome To Dec Month Bootcamp", "9876543210");
	}

}