package com.qkart.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {
	
    WebDriver ldriver;
	
    public AddToCartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);		
	}
    
    @FindBy(name = "search")
    WebElement searchBox;
    
	public void setSearchBox(String item) {
		searchBox.sendKeys(item);	
		searchBox.sendKeys(Keys.ENTER);			
	}
	
	//@FindBy(name = "uncontrolled-native")  
	@FindBy(xpath = "//*[@id=\"uncontrolled-native\"]")
	WebElement size;
	
	public void setSize() {
		Select select=new Select(size);
		select.selectByVisibleText("9");
	}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to cart'])[1]")
	WebElement btnAddToCart;
	
	public void clickOnAddToCardBtn() {
		btnAddToCart.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='Checkout']//*[name()='svg']")
	WebElement btnCheckOut;
	
	public void clickOnCheckOutBtn() {
		btnCheckOut.click();
	}
	
	
	@FindBy(id = "add-new-btn")
	WebElement btnAddAddress;
	
	public void clickOnAddAddressBtn() {
		btnAddAddress.click();
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Enter your complete address']")
	WebElement txtAddressField;
	
	public void setAddressField(String address) {
		txtAddressField.sendKeys(address);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement btnAdd;
	
	public void clickOnAddBtn() {
		btnAdd.click();
	}
	
	@FindBy(name = "address")
	WebElement btnRadio;
	
	public void clickOnRadioBtn() {
		btnRadio.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='PLACE ORDER']")
	WebElement btnPlaceOrder;
	
	public void clickOnPlaceOrderBtn() {
		btnPlaceOrder.click();
	}
	
	@FindBy(xpath = "//button[@id='continue-btn']")
	WebElement btnContinueShopping;
	
	public void clickOnContinueShoppingBtn() {
		btnContinueShopping.click();
	}
	

	
	
	

}//class
