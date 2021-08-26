package com.selenium.webdriver.concepts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_scroll {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver wd;

		wd=new ChromeDriver();

		wd.manage().window().maximize();

		wd.get("https://www.globalsqa.com/");


		JavascriptExecutor jse=(JavascriptExecutor) wd;

		jse.executeScript("scroll(0,3050)");

	}


}
