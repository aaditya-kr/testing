package com.selenium.webdriver.concepts;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class UploadFile_fromLocalsystemOnwebpage {
  @Test
  public void f() throws AWTException, InterruptedException {
	  

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1=new ChromeDriver();

		d1.manage().window().maximize();

	d1.get("https://www.ilovepdf.com/word_to_pdf");
	
	d1.findElement(By.id("pickfiles")).click();
	
	String file="C:\\Users\\aditya_ku\\Downloads\\TestNG.pdf";
	
	StringSelection select1=new StringSelection(file);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
	
	Thread.sleep(4000);
	
	Robot robot1=new Robot();
	
	robot1.keyPress(KeyEvent.VK_CONTROL);
	robot1.keyPress(KeyEvent.VK_V);
	robot1.keyRelease(KeyEvent.VK_V);
	robot1.keyRelease(KeyEvent.VK_CONTROL);
	robot1.keyPress(KeyEvent.VK_ENTER);
	
	 }
}
  
