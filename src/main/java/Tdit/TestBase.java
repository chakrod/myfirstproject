package Tdit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	protected WebDriver driver;
    protected HomePage hP;
	@BeforeMethod
	 public void before() throws InterruptedException
	    {
		
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Documents\\DIVYA TESTING\\SOFTWARE\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		        driver=new ChromeDriver();
		       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		       driver.get("https://tool2.tdittesting.in/login.php");
		   	
				loginPage lp=new loginPage(driver);
				 hP=lp.DoLogin("sump1", "Techfin@12");
				 
	    }
	@AfterMethod
	public void after() {
		//driver.quit();
	}

}
