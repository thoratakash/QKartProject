package com.qkart.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	
	public static Logger logger=LogManager.getLogger(BaseClass.class);

	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void setUP(String browser) {
		
		System.out.println("Launching Browser.....");	
	    System.setProperty("log4j.configurationFile", "/QKartProject/src/main/resources/Log4j2.properties");
	  
		if(browser.equals("Chrome")) {		
		
			driver=new ChromeDriver();
		}
		else if(browser.equals("FireFox")) {		
			driver=new FirefoxDriver();		
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");	
		logger.info("URL opened..");
		
	}//method

    	//Take Screenshot
		public void captureScreenSnap(WebDriver driver,String tname)throws IOException{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
			
		  @AfterClass 
		  public void tearDown() { 
			  driver.quit();
		}
		 
		 
}//class
