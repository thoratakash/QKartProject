package com.qkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(xpath = "//button[text()='Register']")
	WebElement btnRegister;
	
	@FindBy(id = "username")
	WebElement txtUsername;
	
	public void clickRegisterBtn() {
		btnRegister.click();
	}
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(id = "confirmPassword")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//button[text()='Register Now']")
	WebElement btnRegisterNow;
		
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
		
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
		
	public void setConfirmPassword(String confirmPassword) {
		txtConfirmPassword.sendKeys(confirmPassword);
	}
		
	public void clickRegisterNowBtn() {
		btnRegisterNow.click();
	}

}//class
