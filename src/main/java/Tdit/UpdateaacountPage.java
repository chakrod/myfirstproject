package Tdit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateaacountPage {
	//Search Page elements
	By SearchAccountNumber=By.xpath("//form/table/tbody/tr/td[2]/input[@name='accnumber']");
	By clickonSearchbutton=By.tagName("button");
	By myTableList=By.xpath("//table[@id='myTable']/tbody/tr/td");
	//update page element
	String xpath1="//form[2]/table/tbody/tr/td[2]";
	String xpath2="/input[@id='myInput']";
	String xpath3=xpath1+xpath2;
	By updateAccNumber=By.xpath(xpath3);
	By updateAccFund=By.xpath("//form[2]/table/tbody/tr/td[2]/input[@name='afund']");
	By updateAccButton=By.xpath("//form[2]/table/tbody/tr/td/button");
	
	
	WebDriver driver;
	 
	 public UpdateaacountPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 //searchpage actions
	 
	 public void searchAccNumber(String accnum) {
		
		driver.findElement(SearchAccountNumber).sendKeys(accnum); 
	 }
	 public void clickSearchButton() {
		 
		 driver.findElement(clickonSearchbutton).click();
	 }
	 public void Do_SearchAccount(String acnumber) {
		 searchAccNumber(acnumber);
		 clickSearchButton();
		 }
	 public String getSearchList() {
		
			 String text=driver.findElement(myTableList).getText();
			
			 System.out.println(text);
		 
		 return text;
	 }
	 
	 
	 //update page actions
	 
	 public void enterUpdateAccNum(String anumber) {
		 driver.findElement(updateAccNumber).sendKeys(anumber);
	 }
	 public void enterUpdateAccFund(String afund) {
		 driver.findElement(updateAccFund).sendKeys(afund);
	 }
	 public void clickUpdateButton() {
		 driver.findElement(updateAccButton).click();
		 
	 }
	 public void Do_UpdateAccount(String anum,String afund) {
		 System.out.println("entering update details............");
		 enterUpdateAccNum(anum);
		 enterUpdateAccFund(afund);
		 clickUpdateButton(); 
	 }

	 public String getAlertText() {
		 Alert alert1=driver.switchTo().alert();
		 String str=alert1.getText();
		 
		 alert1.accept();
		 System.out.println("test123........."+str);
		 return str;
	 }
	 //invalid
	/*public void getnumofrows(String Acnum) {
		
	 driver.findElement(updateAccNumber).sendKeys(Acnum);
	}*/ 
}
