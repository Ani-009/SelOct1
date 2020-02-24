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
		System.out.println("Ani is updating");
		System.out.println("last change to be committed");
		System.out.println("dkakdksfkesf");
		driver.get("https://mets.cdc.gov/");

		System.out.println("Finally learned conflicts");
		System.out.println("Still a,mkhsDjadfj learning ");
		System.out.println("Hi");

		 driver.close();
		 
		 
	}
	

}
