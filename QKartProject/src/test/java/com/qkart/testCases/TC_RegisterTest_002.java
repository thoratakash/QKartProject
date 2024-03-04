package com.qkart.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qkart.pageObjects.RegisterPage;

public class TC_RegisterTest_002 extends BaseClass {
	
	TC_RegisterTest_002 register=null;
	
	@Test
	public void RegisterTest() throws IOException {
	
		RegisterPage page=new RegisterPage(driver);
		
		page.clickRegisterBtn();
		page.setUsername("akashthorat");
		logger.info("Enter Username");
		page.setPassword("Akash@358");
		logger.info("Enter Password");
		page.setConfirmPassword("Akash@358");
		logger.info("Enter Confirm Password");
		
		register=new TC_RegisterTest_002();
		register.captureScreenSnap(driver, "RegisterPage");
		
		page.clickRegisterNowBtn();
		logger.info("Click on Register Now Button");
	}

}//class
