package com.test.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_workspace\\TestSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("commiting changes to this file for git");
		
		driver.get("https://mets.cdc.gov/");
		// driver.close();
	}

}
