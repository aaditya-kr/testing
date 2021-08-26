package com.selenium.webdriver.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip_Handling {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      
       /* METHOD ONE -------USING GET ATTRIBUTE METHOD--------------- */
      
      /*driver.get("https://www.google.com/");
      WebElement wb=driver.findElement(By.name("q"));
      String tooltip_message=wb.getAttribute("title");
      System.out.println(tooltip_message);*/
      
      //--------------------------------------------------------------------------------------------
      
      /*METHOD TWO --------USING ACTIONS CLASS AND ITS METHODS------*/
      
     // "Expected tooltip text"					
      String expectedTooltip = "112 kB";  	
      driver.get("http://demo.guru99.com/test/tooltip.html");					
      
      
      WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
      Actions act = new Actions (driver);							

      // "USe of actions class for click and hold the tooltip"
      act.clickAndHold().moveToElement(download);					
      act.moveToElement(download).build().perform(); 	
      
      // "xpath of tooltip box"
      WebElement toolTipElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/table/tbody/tr[3]/td[2]"));							
      // "Saving the text of tooltip in actual tooltip "
      String actualTooltip = toolTipElement.getText();			
      
      System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
      if(actualTooltip.equals(expectedTooltip)) {							
          System.out.println("Test Case Passed");					
      }		
    
  }
}
