package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends TestBase
{
	
	@Test
	
	public void test_menuList() throws InterruptedException 
	{
		List<String> exceptedList=new ArrayList<String>();
		exceptedList.add("Admin");
		exceptedList.add("PIM");
		exceptedList.add("Leave");
		exceptedList.add("Time");
		exceptedList.add("Recruitment");
		exceptedList.add("My Info");
		exceptedList.add("Performance");
		exceptedList.add("Dashboard");
		exceptedList.add("Directory");
		exceptedList.add("Maintenance");
		exceptedList.add("Claim");
		exceptedList.add("Buzz");
		
		
		LoginPage lp=new LoginPage(driver);
		Homepage hp=lp.DoLogin("Admin", "admin123");
		
		
		Assert.assertEquals(hp.getHomepageMenuList(), 12);
		System.out.println("actual list");
		System.out.println(hp.getAllmenuitemsList());
		System.out.println("expected list");
		System.out.println(exceptedList);
		Assert.assertEquals(hp.getAllmenuitemsList(), exceptedList);
		
	}

}
