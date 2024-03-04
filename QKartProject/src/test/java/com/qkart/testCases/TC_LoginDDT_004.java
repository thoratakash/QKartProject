package com.qkart.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qkart.Utilities.XLUtility;
import com.qkart.pageObjects.LoginPage;

public class TC_LoginDDT_004 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String username,String password,String expected) throws InterruptedException {
				
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.clickOnLoginbtn();	
		
		logger.info("Login Button clicked");
		loginpage.setUsername(username);
		logger.info("user name provided");
		loginpage.setPassword(password);
		logger.info("password provided");
		loginpage.clickOnLoginQKart();	
		
    	if(expected.equals("Valid")) {		
				    loginpage.clickOnLogOutBtn();
				    Assert.assertTrue(true);
				    logger.info("assertTrue(true)  : "+"Data Drivern Test Case Passed");
		  }
		else if(expected.equals("Invalid")){			
			    loginpage.clickOnBackToExploreBtn();
			    Assert.assertTrue(true);
			    logger.info("assertTrue(true)  : "+"Data Drivern Test Case Passed");
	     	 }	
	         else {				 
				  Assert.assertTrue(false);
				  logger.info("assertTrue(true)  : "+"Data Drivern Test Case failed");
			  }
	
	}//loginmethod
	
	@DataProvider(name="LoginData")
	 String [][]getData() throws IOException{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/qkart/testData/QKartLoginData.xlsx";
		XLUtility xlutility=new XLUtility(path);
		
		int total_rows=xlutility.getRowCount("Sheet1");
		int total_columns=xlutility.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[total_rows][total_columns];
		
		for(int i=1;i<=total_rows;i++) {
			
			for(int j=0;j<total_columns;j++) {
			
				logindata[i-1][j]=xlutility.getCellData("Sheet1",i, j); //1  0
			
			}
		}
		return logindata;
	}

}//class
