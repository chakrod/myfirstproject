package Tdit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddaccountPage extends TestBase{

	
	//page elements
	By addName=By.name("aname");
	By addNumber=By.name("anumber");
	By addFund=By.name("afund");
	By clickonAddAccountbutton=By.tagName("button");
	
	 WebDriver driver;
	 
	 public AddaccountPage(WebDriver driver)
	 {
		 this.driver=driver;
	 } 
 public void enterAccountName(String name) {
	 
	 driver.findElement(addName).sendKeys(name);
	 System.out.println("enter name");
 }
	   
public void enterAccountNumber(String number) {
	 driver.findElement(addNumber).sendKeys(number);
 }
 
 public void enterAccountFund(String fund) {
	 driver.findElement(addFund).sendKeys(fund);
 }
 public void clickOnButton() {
	 driver.findElement(clickonAddAccountbutton).click();
	 
 }
 public void Do_addAccount(String aname,String anumber,String afund) {
	 
	 enterAccountName(aname);
	 enterAccountNumber(anumber);
	 enterAccountFund(afund);
	 clickOnButton();
	
	 }
 public String getAlertText() {
	 Alert alert=driver.switchTo().alert();
	 String s=alert.getText();
	 
	 alert.accept();
	 System.out.println("test123........."+s);
	 return s;
 }
}
