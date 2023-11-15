package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Tdit.TestBase;
import Tdit.UpdateaacountPage;

public class UpdateaccountTest extends TestBase{
	
	@Test(enabled=false)
	
	
	
	public void test_ValidsearchAccnumber() throws InterruptedException {
		
		String exp="678910444";
			
		System.out.println("excepted......."+exp);
			
		UpdateaacountPage uap=hP.clickupdateAccount();
		uap.Do_SearchAccount("678910444");
		Assert.assertEquals(uap.getSearchList(), exp);
	    // uap.Do_UpdateAccount("678910444", "123");
		//Assert.assertEquals(uap.getAlertText(), "Balance updated.. ");
	}
	
	@Test(enabled=false)
	
	public void test_InvalidSearchAccnumber() throws InterruptedException {
	
		UpdateaacountPage uap=hP.clickupdateAccount();
		uap.Do_SearchAccount("-2");
	   Assert.assertEquals(uap.getSearchList(), "null");
	 
	}
	

}
