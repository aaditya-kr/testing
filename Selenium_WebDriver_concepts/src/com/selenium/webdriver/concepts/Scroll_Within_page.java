package com.selenium.webdriver.concepts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Within_page {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver wd=new ChromeDriver();

		wd.manage().window().maximize();

		wd.get("https://webflow.com/blog/parallax-scrolling");

		JavascriptExecutor jse=(JavascriptExecutor) wd;
		WebElement ele1=wd.findElement(By.id("search-nav"));

		jse.executeScript("arguments[0].scrollIntoView(true);",ele1);

		ele1.sendKeys("aditya_kumar");

	}


}
