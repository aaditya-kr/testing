package com.selenium.webdriver.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.internal.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ConfigPropertiesImplementation {
	@Test

	public void f() throws IOException  {

		FileInputStream st=new FileInputStream("com\\selenium\\webdriver\\concepts\\Config.properties");
		Properties p=new Properties();
		p.load(st);
		String b_prop=p.getProperty("browser");
		String driver_prop=p.getProperty("driverPath");


		WebDriver wd;
		if(b_prop.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",driver_prop);
			wd=new ChromeDriver();

		}
		else if(b_prop.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",driver_prop);
			// wd=new FirefoxDriver();
		}

		else
			System.setProperty("webdriver.ie.driver",driver_prop);
		wd=new InternetExplorerDriver();




		wd.manage().window().maximize();
		wd.get("http://www.leafground.com/pages/download.html");
		wd.findElement(By.linkText("Download Excel")).click();
	}
}
