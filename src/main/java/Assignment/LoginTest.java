package Assignment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumcode.loginpage;

public class LoginTest extends TestBase{


	
	
	@Test
	public void test() throws InterruptedException
	{
	   
	      LoginPage pg=new LoginPage(driver);
	        pg.DoLogin("Admin","admin123");
	       
	      
	  
	}   
	

}
