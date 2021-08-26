package functionality;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import locatorsAndElements.Locators;







public class Login_functionality {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2021-08-11T06%3a47%3a45Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&sso_reload=true");
		Thread.sleep(10000);
		PageFactory.initElements(d1,Locators.class);
		Locators.loginid.sendKeys("aditya_ku@hcl.com");
		Locators.firstbutton.click();
		Thread.sleep(10000);
		Locators.password.sendKeys("AhjAytida@24");
		Locators.secondbutton.click();
		Thread.sleep(10000);
		Locators.thirdbutton.click();
		WebElement we1=Locators.searchbox;
		Actions a1 = new Actions(d1);      
		a1.sendKeys(we1, "itime (Time Sheet Management System)");
		a1.sendKeys(Keys.ARROW_DOWN);
		a1.sendKeys(we1, Keys.ENTER).click().build().perform();
		Thread.sleep(10000);
		Locators.selecttext.click();
		Thread.sleep(15000);
		Locators.sendtime.sendKeys("09:00");
		Locators.submit.click();



	}
}




