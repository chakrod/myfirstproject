package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forgotpasswordtest extends testbase {

	@Test
	public void forgotPasswordtest()
	{
		//open browewr
		//launch url
		//click forgotpasswordlink
		//enter username
		//click resetbutton link
		//verify pagetitle
		loginpage lp=new loginpage(driver);
		
		//lp.clickForgotPasswordLink();
		
		forgotpasswordPage fp=lp.clickForgotPasswordLink();
		
		Assert.assertEquals(fp.getforgotPasswordPageTitle(), "Reset Password");
		fp.forgetPassworduserName("test");
		fp.clickresetButton();
		Assert.assertEquals(fp.getforgotPasswordPageTitle(),"Reset Password link sent successfully");
	}
	

}
