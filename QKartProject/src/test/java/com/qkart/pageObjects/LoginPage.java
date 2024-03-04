package com.qkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnLogin;

	@FindBy(id = "username")
	WebElement txtUsername;
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[text()='Login to QKart']")
	WebElement btnLoginQKart;
	
	@FindBy(xpath = "//button[normalize-space()='Logout']")
	WebElement btnLogOut;
	
	@FindBy(xpath = "//button[text()='Back to explore']")
	WebElement btnBackToExplore;
	
	public void clickOnLoginbtn() {
		btnLogin.click();
	}
	
	public void setUsername(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);		
	}
	
	public void clickOnLoginQKart() {
		btnLoginQKart.click();	
	}
	
	public void clickOnLogOutBtn() {
		btnLogOut.click();
	}
	
	public void clickOnBackToExploreBtn() {
		btnBackToExplore.click();
	}
	
}//class
