package com.test.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJUAPPU\\Desktop\\Selenium_browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Adi");
		driver.get("https://mets.cdc.gov/");
		 driver.close();
	}

}
