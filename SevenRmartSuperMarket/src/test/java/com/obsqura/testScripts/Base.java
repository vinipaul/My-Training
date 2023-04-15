package com.obsqura.testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
	public Properties prop,prop1;
    FileInputStream fs;
    public ScreenshotUtility scrshot;
	@BeforeMethod
	@Parameters("browser")
	public void toInitializeBrowser(String browser) throws Exception {
		prop=new Properties(); 		
		try
		{ 			
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.CONFIGfILE);
		}
		catch (Exception e) 
		{ 				
				
		} 		
		try
		{ 			
			prop.load(fs); 		
		} 
		catch (Exception e) 
		{ 			
				
		} 	
		 prop1=new Properties();  	
		try
		{ 		
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.TESTDATAFILE);   		
		} 
		catch (Exception e)
		{ 				
			
		} 		
		try
		{  			
		prop1.load(fs); 		
		}
		catch (Exception e) 
		{ 			
					
		}
		
		if(browser.equalsIgnoreCase("firefox")) 
		{
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+constants.Constants.geckodriverpath); 
			  driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+constants.Constants.chromedriverpath);
			 ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*"); 
			 driver=new ChromeDriver(options);
		} 
		else if(browser.equalsIgnoreCase("Edge"))
		{
			  System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+constants.Constants.edgedriverpath);
			 driver= new EdgeDriver();
		}
		else 
		{
			throw new Exception("Browser is not correct"); 
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WaitUtility.pageLoadTimeOutWait(driver);
	}
	@AfterMethod
	public void browserQuit(ITestResult iTestResult) throws IOException 
	{
		if (iTestResult.getStatus() == ITestResult.FAILURE)
		{
			scrshot = new ScreenshotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}
	driver.quit();
	}
}

