package com.qkart.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qkart.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	TC_LoginTest_001 test=null;
	
	@Test
	public void loginTest() throws IOException {
		LoginPage page=new LoginPage(driver);
		page.clickOnLoginbtn();
		page.setUsername("akashthorat");
		logger.info("Enter Username");
		page.setPassword("Akash@358");
		logger.info("Enter Username");
		page.clickOnLoginQKart();
		logger.info("Login QKart Button is Clicked");
		
		if(driver.getTitle().equals("QKart")) {
			Assert.assertTrue(true);
			logger.info("TC_Login_001 Test Case Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("TC_Login_001 Test Case Failed");
		}
		 test=new TC_LoginTest_001();
		 test.captureScreenSnap(driver, "LoginPage");
	
		page.clickOnLogOutBtn();
		logger.info("User logged off");
	}

}//class
