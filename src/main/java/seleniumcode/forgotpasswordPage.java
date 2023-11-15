package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgotpasswordPage {
	
	
	
	//forgot password page
	By getforgotPasswordPageTitle=By.xpath("//h6[contains(@class,'h6 orangehrm-forgot-password-title')]");
	By forgetPassworduserName=By.name("username");
	By clickresetbutton=By.xpath("//button[contains(@class,'forgot-password-button--reset')]");
	
	WebDriver driver;
	public forgotpasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public String getforgotPasswordPageTitle()
	{
		return driver.findElement(getforgotPasswordPageTitle).getText();
	}
	public void forgetPassworduserName(String user)
	{
		driver.findElement(forgetPassworduserName).sendKeys(user);
	}
	public void  clickresetButton()
	{
		driver.findElement( clickresetbutton).click();
	}
}
