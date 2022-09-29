package com.fdp.java.di.injector;

import com.fdp.java.di.consumer.MyDIApplication;
import com.fdp.java.di.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector{

	public MyDIApplication getConsumer() {		
		return new MyDIApplication(new EmailService());
	}

}
