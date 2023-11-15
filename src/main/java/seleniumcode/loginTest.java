package seleniumcode;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest extends testbase {
	
	
	WebDriver driver;

	
	
	@Test
	public void test()
	{
	    
	       loginpage page=new loginpage(driver);
	      page.doLogin("Admin","admin123");
	       
	      Assert.assertEquals(page.isUserdisplayed(), true);
	   Assert.assertEquals(page.getUserName(), "Paul Collings");
	}   
	
	/*@Test
	public void invalidtest_login_test()
	{
		//open brower
		//launch url
		//go to login page
		//enter username and password
		//check invalid credentials displayed
		
		  loginpage page=new loginpage(driver);
	        page.doLogin("test","test");
	        
	     //element should be displayed
	       Assert.assertEquals(page.isLoginErrordisplayed(), true);
	 
	 //element text should be equal to invalid credentials
	       Assert.assertEquals(page.getloginErrorMsg(), "Invalid credentials");
	}
	
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
	}*/

}
