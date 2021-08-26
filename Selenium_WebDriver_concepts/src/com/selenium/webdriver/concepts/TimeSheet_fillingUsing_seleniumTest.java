package com.selenium.webdriver.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TimeSheet_fillingUsing_seleniumTest {
  @Test
  public void f() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  

	     
	      WebDriver wd = new ChromeDriver();
	      wd.get("https://myhcl.com/");
	      
	      WebDriverWait var1= new WebDriverWait(wd,10);
	      var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	      
	      wd.findElement(By.xpath("//*[@id='i0116']")).sendKeys("aditya_ku@hcl.com");
	      wd.findElement(By.id("idSIButton9")).click();
	      
	      var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	      wd.findElement(By.id("i0118")).sendKeys("AhjAytida@24");
	      
	      var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	      wd.findElement(By.id("idSIButton9")).click();
	      
	      WebDriverWait var2= new WebDriverWait(wd,20);
	      var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	      
	      wd.findElement(By.id("idSIButton9")).click();
	      wd.findElement(By.id("txtSearch")).sendKeys("itime");
	      
	      WebElement search= wd.findElement(By.id("txtSearch"));
	      Thread.sleep(8000);
	      search.sendKeys(Keys.ARROW_DOWN);
	      search.sendKeys(Keys.ENTER);
	      Thread.sleep(8000);
	      wd.findElement(By.xpath("//*[@id='mCSB_5_container']/span/div[2]/div/div/div[2]/div/div/div[5]/div/div/div/div/input")).sendKeys("9");
	      wd.findElement(By.id("le_apply")).click();
	      
	      
	            
	      
	  }
	
	 
	  
  }

