package Tdit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends TestBase {
   //page element
	
	private static final By UpdateAcountLink = null;
	By AddAcountLink=By.linkText("Add Account");
	By UpdateAccountLink=By.linkText("Update Account");
	By DeleteAccountLink =By.linkText("Delete Account");
			
 WebDriver driver;
 
 public HomePage(WebDriver driver)
 {
	 this.driver=driver;
 } 
 //page actions

 public AddaccountPage clickAddAccount() throws InterruptedException {
   	 System.out.println("clicking on AddAccount......");
   	 
   	 driver.findElement(AddAcountLink).click();
   	 Thread.sleep(3000);
   	 return new AddaccountPage(driver);
    }
 public UpdateaacountPage clickupdateAccount() throws InterruptedException {
   	 System.out.println("clicking on updateAccount......");
   	 
   	 driver.findElement(UpdateAccountLink).click();
   	 Thread.sleep(3000);
   	 return new UpdateaacountPage(driver);
    }
 /*public DeleteaccountPage clickdeleteAccount() throws InterruptedException {
   	 System.out.println("clicking on deleteAccount......");
   	 
   	 driver.findElement(DeleteAccountLink).click();
   	 Thread.sleep(3000);
   	 return new DeleteaccountPage(driver);
    }*/
}
