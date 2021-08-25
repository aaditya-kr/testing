package cookies;

import java.io.BufferedWriter;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.FileWriter;

public class GetCookiesDetails {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://myhcl.com/");

		WebDriverWait var1= new WebDriverWait(wd,10);
		var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));

		wd.findElement(By.xpath("//*[@id='i0116']")).sendKeys("aditya_ku@hcl.com");
		wd.findElement(By.id("idSIButton9")).click();

		var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
		wd.findElement(By.id("i0118")).sendKeys("AhjAytida@24");

		File file1=new File("C:\\Users\\aditya_ku\\Documents\\cookies.data");

		try {
			file1.createNewFile();
			FileWriter fw=new FileWriter(file1);
			BufferedWriter bw=new BufferedWriter(fw);
			for(Cookie ck:wd.manage().getCookies()) {
				bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
	}
}
}
