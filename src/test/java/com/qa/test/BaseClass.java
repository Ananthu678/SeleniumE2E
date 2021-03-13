package com.qa.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseClass {

		public static WebDriver driver;
		String baseURL;
		
		@BeforeClass
		public void openBrowser() {
			
			System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--no-sandbox");
//WebDriver driver = new ChromeDriver(chromeOptions);
			driver = new ChromeDriver();
			chromeOptions.addArguments("--headless");

			driver = new ChromeDriver();
			
			baseURL="https://www.facebook.com/";
			driver.get(baseURL);
		}
		
		@AfterClass
		public void quitBrowser() {
			
			 driver.quit();
		}
		

	}


