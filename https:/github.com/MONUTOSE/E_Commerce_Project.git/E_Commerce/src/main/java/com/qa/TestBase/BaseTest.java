package com.qa.TestBase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public ChromeDriver driver;

	@BeforeMethod
	public void startApplication() {

//		WebDriverManager.chromedriver().setup();
	 ChromeDriverManager.getInstance().setup();
		 
		 driver=new ChromeDriver();

		driver.get("http://toolsqa.com");
	}

	@AfterMethod
	public void closeApplication() {
		driver.close();
	}
}
