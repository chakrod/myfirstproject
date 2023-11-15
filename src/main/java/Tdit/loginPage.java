package Tdit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Assignment.Homepage;

public class loginPage extends TestBase {
	
	By username=By.name("username");
	By password=By.name("password");
	By LoginButton=By.tagName("button");
	
WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
		System.out.println("entered username");
	}
	public void enterPassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
		System.out.println("entered password");
		}
    public void clickLoginButton() throws InterruptedException  {
    	
    	driver.findElement(LoginButton).click();
    	System.out.println("clicked on button......");
    	
     
    	
    
    }

   
    
    public HomePage DoLogin(String user,String pass) throws InterruptedException {
    	
    	enterUserName(user);
    	enterPassword(pass);
    	clickLoginButton();
    	   return new HomePage(driver);
    }
}
