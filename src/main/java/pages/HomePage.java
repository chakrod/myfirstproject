package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	By AddAcountButton=By.linkText("Add Account");


 WebDriver driver;
 
 public HomePage(WebDriver driver)
 {
	 this.driver=driver;
 } 
 
 public void clickAddAccount() {
	 
	 driver.findElement(AddAcountButton).click();
	 
 }
}
