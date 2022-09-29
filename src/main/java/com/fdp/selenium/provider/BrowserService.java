package com.fdp.selenium.provider;

import org.openqa.selenium.WebElement;

public interface BrowserService {
	
	public void open(String url);
	
	public WebElement getElement(String locatorType, String value);
	
	public void type(WebElement ele, String value);
	
	public void click(WebElement ele);
	
	public void close();

}