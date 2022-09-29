package com.fdp.java.legacy;

public class MyLegacyTest {
	
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessages("Welcome To Dec Month Bootcamp", "karthikeyan.r@testleaf.com");
		MyApplicationFirstLevelRefactoring app1 = new MyApplicationFirstLevelRefactoring(new EmailService());
		app1.processMessages("Welcome To Dec Month Bootcamp", "karthikeyan.r@testleaf.com");
	}

}