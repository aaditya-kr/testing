package com.selenium.webdriver.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UnOrdered_List_example 
{
  
 /* public void f() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver wd=new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get("http://demo.automationtesting.in/AutoComplete.html");
	  wd.findElement(By.id("searchbox")).sendKeys("S");
	  Thread.sleep(3000);
	  
	  List<WebElement> we1= wd.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	  
	  for(WebElement list : we1) {
		  if (list.getText().equalsIgnoreCase("samoa")){
			  list.click();
			  break;
		  }
		  
	  }  
  }*/
  @Test
  public void a(){
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver wd=new ChromeDriver();
	  wd.get("http://demo.automationtesting.in/Selectable.html");
	  wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  
	  List<WebElement> wb1=wd.findElements(By.xpath("//*[@class='SerializeFunc']/li"));
	  
	  Actions ac1=new Actions(wd);
	  ac1.keyDown(Keys.CONTROL).click(wb1.get(0)).click(wb1.get(2)).build().perform();
	  

  }
}

