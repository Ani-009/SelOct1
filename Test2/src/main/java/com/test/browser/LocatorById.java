package com.test.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_workspace\\TestSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://mets.cdc.gov/");
		driver.get("https://www.gmail.com/");
		// driver.close();
		/**
		 * Use ctrl +f to look for similar selectors in developer tools
		 */

		WebElement search = driver.findElement(By.id("identifierId"));

		search.sendKeys("testing");

	}
}
