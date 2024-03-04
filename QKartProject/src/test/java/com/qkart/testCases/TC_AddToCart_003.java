package com.qkart.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qkart.pageObjects.AddToCartPage;
import com.qkart.pageObjects.LoginPage;

public class TC_AddToCart_003 extends BaseClass {
	

	TC_AddToCart_003 addToCart=null;
	@Test
	public void AddToCartTest() throws IOException {
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnLoginbtn();
		loginpage.setUsername("akashthorat");
		loginpage.setPassword("Akash@358");
		loginpage.clickOnLoginQKart();
		
		AddToCartPage page=new AddToCartPage(driver);
		
		page.setSearchBox("Shoes");
		logger.info("Enter Shoes in Search Box");
		page.setSize();
		page.clickOnAddToCardBtn();
		logger.info("click on Add To Cart Button");
		page.clickOnCheckOutBtn();
		page.clickOnAddAddressBtn();
		page.setAddressField("Akurdi Pune-431605, Maharashtra");
		logger.info("Enter Address");
		page.clickOnAddBtn();
		page.clickOnRadioBtn();
		page.clickOnPlaceOrderBtn();
		page.clickOnContinueShoppingBtn();
		addToCart=new TC_AddToCart_003();
		addToCart.captureScreenSnap(driver, "AddToCartPage");
		loginpage.clickOnLogOutBtn();
	
	}

}//class
