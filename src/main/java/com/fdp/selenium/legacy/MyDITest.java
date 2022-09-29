package com.fdp.selenium.legacy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.fdp.selenium.provider.BrowserService;
import com.fdp.selenium.provider.ChromeService;
import com.fdp.selenium.provider.FireFoxService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyDITest {

	public static void main(String[] args) {	
		
		BrowserService browser = null;

		//Chrome Browser Intilization
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver chrome = new ChromeDriver(chromeOptions);
		chrome.manage().window().maximize();

		//Firefox Browser Intilization
		FirefoxOptions fireFoxOptions = new FirefoxOptions();
		fireFoxOptions.setProfile(new FirefoxProfile());
		fireFoxOptions.addPreference("dom.webnotifications.enabled", false);
		WebDriverManager.firefoxdriver().setup();
		WebDriver ff = new FirefoxDriver(fireFoxOptions);
		ff.manage().window().maximize();

        browser = new ChromeService(chrome);

        browser.open("https://login.salesforce.com/");
		browser.type(browser.getElement("id", "username"), "hari.radhakrishnan@qeagle.com");
		browser.type(browser.getElement("id", "password"), "Qeagle@123");
		browser.click(browser.getElement("id", "Login"));
		//browser.close();

		browser = new FireFoxService(ff);

        browser.open("https://login.salesforce.com/");
		browser.type(browser.getElement("id", "username"), "hari.radhakrishnan@qeagle.com");
		browser.type(browser.getElement("id", "password"), "Qeagle@123");
		browser.click(browser.getElement("id", "Login"));
		//browser.close();

	}

}