package locatorsAndElements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class Locators {
    
    @FindBy(id="i0116")
        public static WebElement loginid;    
    
    @FindBy(id="idSIButton9")
        public static WebElement firstbutton;  
    
    @FindBy(id="i0118")
        public static WebElement password;
    
    @FindBy(id="idSIButton9")
        public static WebElement secondbutton;
    
    @FindBy(id="idSIButton9")
        public static WebElement thirdbutton;
    
    @FindBy(id="txtSearch")
        public static WebElement searchbox;
    
    @FindBy(xpath="/html/body/ul/li/table/tbody/tr/td[1]/a")
        public static WebElement selecttext;
    
    @FindBy(xpath="//*[@id=\'mCSB_5_container\']/span[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input")
        public static WebElement sendtime;
    
    @FindBy(xpath="/html/body/main/div/div[2]/section/span/button[1]")
        public static WebElement submit;
    
    
    
    
    
        
}



