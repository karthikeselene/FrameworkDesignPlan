package com.fdp.java.di.injector;

import com.fdp.java.di.consumer.MyDIApplication;
import com.fdp.java.di.service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {

	public MyDIApplication getConsumer() {		
		return new MyDIApplication(new SMSService());
	}

}