package com.qa.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

		public static WebDriver driver;
		String baseURL;
		
		@BeforeClass
		public void openBrowser() {
			
			System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
			driver = new ChromeDriver();
			
			baseURL="https://www.facebook.com/";
			driver.get(baseURL);
		}
		
		@AfterClass
		public void quitBrowser() {
			
			 driver.quit();
		}
		

	}


