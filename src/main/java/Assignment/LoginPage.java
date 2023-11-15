package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends TestBase {
	
	By username=By.name("username");
	By password=By.name("password");
	By LoginButton=By.tagName("button");
	
	//By user=By.xpath("//div[@class='oxd-topbar-header-userarea']//p");
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
		}
	public Homepage clickLoginButton() throws InterruptedException
	{
		driver.findElement(LoginButton).click();
		Thread.sleep(3000);
		return new Homepage(driver);
	}
	
	public Homepage DoLogin(String user,String pass) throws InterruptedException {
		
		enterUserName(user);
		enterPassword(pass);
		clickLoginButton();
		
	}

}
