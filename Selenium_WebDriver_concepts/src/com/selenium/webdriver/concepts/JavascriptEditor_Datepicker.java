package com.selenium.webdriver.concepts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptEditor_Datepicker {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver wd;

		wd=new ChromeDriver();

		wd.manage().window().maximize();

		wd.get("http://demo.automationtesting.in/Datepicker.html");


		JavascriptExecutor jse=(JavascriptExecutor) wd;

		jse.executeScript("document.getElementById('datepicker2').value='29/08/2021'");

	}


}
