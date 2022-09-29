package com.fdp.selenium.provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FireFoxService implements BrowserService {
	
	private WebDriver driver = null;
	
	public FireFoxService(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open(String url) {		
		this.driver.get(url);
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public WebElement getElement(String locatorType, String value) {
		WebElement ele = null;
		if(locatorType.equalsIgnoreCase("ID")) {
			ele = this.driver.findElement(By.id(value));
		} else if (locatorType.equalsIgnoreCase("NAME")) {
			ele = this.driver.findElement(By.name(value));
		} else if (locatorType.equalsIgnoreCase("XPATH")) {
			ele = this.driver.findElement(By.xpath(value));			
		}		
		return ele;
	}

	public void type(WebElement ele, String value) {		
		ele.sendKeys(value);
	}

	public void click(WebElement ele) {
		ele.click();		
	}

	public void close() {
		this.driver.close();		
	}

}