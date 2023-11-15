package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testbase {
	

	protected WebDriver driver;

	@BeforeMethod
	 public void before()
	    {
		
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Documents\\DIVYA TESTING\\chromedriver.exe");
		        driver=new ChromeDriver();
		       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    }
	@AfterMethod
	public void after() {
		driver.quit();
	}

}
