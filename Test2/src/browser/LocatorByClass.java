package com.test.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClass {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJUAPPU\\Desktop\\Selenium_browser_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		// driver.get("https://mets.cdc.gov/");
		driver.get("https://www.gmail.com/");
		// driver.close();
		/**
		 * Use ctrl +f to look for similar selectors in developer tools
		 */

		WebElement nextbtn = driver.findElement(By.className("span.RveJvd.snByac"));

		nextbtn.click();

	}
}
