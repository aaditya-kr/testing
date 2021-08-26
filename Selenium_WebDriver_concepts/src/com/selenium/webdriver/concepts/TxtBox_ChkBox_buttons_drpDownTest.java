package com.selenium.webdriver.concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TxtBox_ChkBox_buttons_drpDownTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver wd=new ChromeDriver(); //Object creation for chromeDriver
	  
	  wd.get("http://leafground.com/"); //"Script to open the URL in browser"//
	  wd.manage().window().maximize(); //"Script to maximize the browser window"//
	  
	  //Scripts to do actions like enter text, click,remove text//
	  wd.findElement(By.linkText("Edit")).click();
	  wd.findElement(By.id("email")).sendKeys("aditya2409kr@gmail.com");
	  wd.findElement(By.cssSelector("input[value='Append ']")).clear();
	  wd.findElement(By.cssSelector("input[value='Append ']")).sendKeys("adityaaaaaaaa");
	  wd.findElement(By.cssSelector("input[value='Clear me!!']")).clear();
	  wd.findElement(By.cssSelector("input[value='Clear me!!']")).sendKeys("aaaaaaa");
	  
	  boolean value=wd.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']"))
	  .isEnabled();
	  
	  if(value==false){
		  System.out.println("The text box is disabled");
	  }
	  else{
		  System.out.println("The text box is enabled");
	  }
	  
	  
	/* .............SCRIPT TO HANDLE BUTTONS..................*/
	  wd.get("http://leafground.com/");
	  wd.findElement(By.linkText("Button")).click();
	  wd.findElement(By.id("position")).click();
	  
	/* .............SCRIPT TO HANDLE RADIO BUTTONS..................*/  
	  wd.get("http://leafground.com/");
	  wd.findElement(By.linkText("Radio Button")).click();
	  wd.findElement(By.xpath("//*[@id='yes' and @value='1']")).click();
	  wd.findElement(By.xpath("//*[@name='news' and @value='0']")).click();
	  wd.findElement(By.xpath("//*[@name='age' and @value='2']")).click();
	  
	  
	  //wd.close();
	  
	 /* .............SCRIPT TO HANDLE DROPDOWNS..................*/  
	  wd.get("http://leafground.com/pages/Dropdown.html");
	  Select select1=new Select(wd.findElement(By.name("dropdown2")));
	  select1.selectByVisibleText("UFT/QTP");
	  
	  Select select2=new Select(wd.findElement(By.name("dropdown3")));
	  select2.selectByValue("1");
	  
	  
	  Boolean message=select2.isMultiple();
	  System.out.println(message);
	  
	  
	  
	  /* .............SCRIPT TO ALERTS..................*/ 
      wd.get("http://www.leafground.com/pages/Alert.html");
	  
	  wd.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	  String msg=wd.switchTo().alert().getText();
	  System.out.println(msg);
	  wd.switchTo().alert().accept();
	  
	  wd.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	  wd.switchTo().alert().dismiss();
	  
	  wd.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	  wd.switchTo().alert().sendKeys("Aditya Kumar");
	  wd.switchTo().alert().accept();
	  
	  
	  
	  
	  
	  
      //wd.get("http://www.leafground.com/pages/frame.html");
	  
	  //wd.switchTo().frame(0);
	  
	  //wd.findElement(By.id("Click")).click();
	  
	  //wd.switchTo().defaultContent();// base screen
	  
	  //wd.switchTo().parentFrame();// first frame 
	  
	  
	  
      /* .............SCRIPT TO HANDLE NESTED FRAMES..................*/
	  
	  wd.get("http://www.leafground.com/pages/frame.html");
	  wd.switchTo().frame(1);
	  wd.switchTo().frame("frame2");

	  wd.findElement(By.id("Click1")).click();




	  /* .............SCRIPT TO HANDLE MULTIPLE WINDOWS..................*/  



	 /* wd.get("http://www.leafground.com/pages/Window.html");

	  wd.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button")).click();

	  Set<String> window_values=  wd.getWindowHandles();

	  Iterator<String> it1=  window_values.iterator();

	  String w1=it1.next();

	  System.out.println(w1);

	  String w2= it1.next();

	  System.out.println(w2);  

	  wd.switchTo().window(w2);

	  System.out.println(wd.getTitle());

	  String w3=it1.next();

	  wd.switchTo().window(w3);

	  System.out.println(wd.getTitle());
	  System.out.println(w3);

	  //wd.manage().window().maximize();
	  wd.switchTo().window(w2);
	  wd.manage().window().maximize();



	  wd.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a")).click();

       */
  




	  wd.get("http://leafground.com/");
	  wd.findElement(By.linkText("Edit")).click();
     wd.findElement(By.id("email")).sendKeys("aditya");
     wd.findElement(By.id("email")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
     WebElement e1=wd.findElement(By.id("email"));
     WebElement e2=wd.findElement(By.cssSelector("input[value='Append ']"));
     
     Actions a1=new Actions(wd);
     a1.dragAndDrop(e1, e2).build().perform();
     

  }}


	  
	  
	  
	  
	  
  
