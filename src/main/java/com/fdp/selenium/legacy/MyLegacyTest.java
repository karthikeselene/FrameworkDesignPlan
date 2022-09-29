package com.fdp.selenium.legacy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyLegacyTest {
	
	public static void main(String[] args) {
		//Chrome Browser
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome = new ChromeDriver(chromeOptions);
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		chrome.get("https://login.salesforce.com/");
		chrome.findElementById("username").sendKeys("hari.radhakrishnan@qeagle.com");
		chrome.findElementById("password").sendKeys("Qeagle@123");
		chrome.findElementById("Login").click();
		//Firefox Browser
		FirefoxOptions fireFoxOptions = new FirefoxOptions();
		fireFoxOptions.setProfile(new FirefoxProfile());
		fireFoxOptions.addPreference("dom.webnotifications.enabled", false);
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver ff = new FirefoxDriver(fireFoxOptions);
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.get("https://login.salesforce.com/");
		ff.findElementById("username").sendKeys("hari.radhakrishnan@qeagle.com");
		ff.findElementById("password").sendKeys("Qeagle@123");
		ff.findElementById("Login").click();
	}

}