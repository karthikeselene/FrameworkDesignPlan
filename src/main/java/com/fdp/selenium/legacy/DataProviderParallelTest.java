package com.fdp.selenium.legacy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderParallelTest {
	
	@Test(dataProvider = "excel-data")
	public void tc001(String userName, String pwd, String flag) {
		//Chrome Browser
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementById("Login").click();		
	}
	
	@DataProvider(name = "excel-data", parallel = true)
	public Object[][] excelDP() {
		return DataLibrary.readExcelData("Login_Data");
	}

}