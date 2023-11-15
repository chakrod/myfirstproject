package seleniumcode;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class loginpage {

	//page element
	By username=By.name("username");
	By password=By.name("password");
	By LoginButton=By.tagName("button");
	By loginError=By.xpath("//p[contains(@class,'p oxd-alert-content-text')]");
	By user=By.xpath("//div[@class='oxd-topbar-header-userarea']//p");
	By clickforgotpasswordlink=By.xpath("//p[contains(@class,'p orangehrm-login-forgot-header')]");
	
	//forgot password page
	By getforgotPasswordPageTitle=By.xpath("//h6[contains(@class,'h6 orangehrm-forgot-password-title')]");
	By forgetPassworduserName=By.name("username");
	By clickresetbutton=By.xpath("//button[contains(@class,'forgot-password-button--reset')]");
	
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//page actions
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clicklogin()
	{
		driver.findElement(LoginButton).click();
	}
	
	public void doLogin(String user,String pass)
	{
	       enterUsername(user);   
	       enterPassword(pass); 
	          clicklogin();
	}

	
	public boolean isLoginErrordisplayed()
	{
		try {
		 driver.findElement(loginError).isDisplayed();
		 return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	public String getloginErrorMsg()
	{
		return driver.findElement(loginError).getText();
	}
	
	
	public boolean isUserdisplayed()
	{
		try {
		 driver.findElement(user).isDisplayed();
		 return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	public String getUserName()
	{
		return driver.findElement(user).getText();
	}
	
	public forgotpasswordPage clickForgotPasswordLink()
	{
		driver.findElement(clickforgotpasswordlink).click();
		return new forgotpasswordPage(driver);
	}
	

}

