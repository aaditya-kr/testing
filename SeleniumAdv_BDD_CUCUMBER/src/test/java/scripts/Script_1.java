package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Script_1 {

	WebDriver d1;

	@Given("open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		d1=new ChromeDriver();

		d1.get("https://myhcl.com/");

		System.out.println("given done");
	}
	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		  WebDriverWait var1= new WebDriverWait(d1,10);
	      var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	      
	      d1.findElement(By.xpath("//*[@id='i0116']")).sendKeys("aditya_ku@hcl.com");
	      d1.findElement(By.id("idSIButton9")).click();
	      
	      var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	      d1.findElement(By.id("i0118")).sendKeys("AhjAytida@24");
	   

		System.out.println("when done");
	}

	@Then("Login successfull")
	public void login_successfull() {
		// Write code here that turns the phrase above into concrete actions
		  
	      d1.findElement(By.id("idSIButton9")).click();

		System.out.println("then done");
	}
	
	@When("enter invalid username and password")
	public void enter_invalid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		  WebDriverWait var1= new WebDriverWait(d1,10);
	      var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	      
	      d1.findElement(By.xpath("//*[@id='i0116']")).sendKeys("aditya_ku@hcl.com");
	      d1.findElement(By.id("idSIButton9")).click();
	      
	      var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	      d1.findElement(By.id("i0118")).sendKeys("********");
	   

		System.out.println("when done");
	}

	@Then("Login Unsuccessfull")
	public void login_Unsuccessfull() {
		// Write code here that turns the phrase above into concrete actions
		  
	      d1.findElement(By.id("idSIButton9")).click();

		System.out.println("then done");
	}

}