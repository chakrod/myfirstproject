package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	By menuList=By.xpath("//ul[@class='oxd-main-menu']/li/a/span");


 WebDriver driver;
 
 public Homepage(WebDriver driver)
 {
	 this.driver=driver;
 } 
 
 public int getHomepageMenuList()
 {
	 List<WebElement> lst=driver.findElements(menuList);
	 return lst.size();
	
 }
 
 public List<String> getAllmenuitemsList()
 {
	 List<WebElement> lst=driver.findElements(menuList);
	 List<String> textList=new ArrayList<String>();
	 for(WebElement e :lst)
	 {
		 String text=e.getText();
		 textList.add(text);
	 }
	 return textList;
 }
}