package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Tdit.AddaccountPage;
import Tdit.TestBase;

public class Addaccount_test extends TestBase {

	
	@Test
	
	 public void test_validAddAccount() throws InterruptedException{
	
	 AddaccountPage aap= hP.clickAddAccount();
	 aap.Do_addAccount("aarvi_4", "678910444", "2000");
	 Assert.assertEquals(aap.getAlertText(), "Account Registered.. ");
}

	@Test(enabled=false)
	//invalid account
public void test_inValidAddAccount() throws InterruptedException {
	
	 AddaccountPage aap=hP.clickAddAccount();
	 aap.Do_addAccount("1234", "567891", "1000");
	 Assert.assertEquals(aap.getAlertText(), "Failed , try again ");
	 
	}
}
