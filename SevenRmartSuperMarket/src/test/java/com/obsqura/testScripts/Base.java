package com.obsqura.testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
	public Properties prop,prop1;
    FileInputStream fs;
    public ScreenshotUtility scrshot;
	@BeforeMethod (alwaysRun = true)
	@Parameters("browser")
	public void toInitializeBrowser(String browser) throws Exception {
		prop=new Properties(); 		
		try{ 			
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.CONFIGfILE);
		}catch (Exception e) 
		{ 				
		} 		
		try{ 			
			prop.load(fs); 		
		}catch (Exception e) 
		{ 			
				
		} 	
		prop1=new Properties();  	
		try{ 		
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.TESTDATAFILE);   		
		}catch (Exception e)
		{ 				
		} 		
		try{  			
			prop1.load(fs); 		
		}catch (Exception e) 
		{ 			
		}
		if(browser.equalsIgnoreCase("firefox")) 
		{
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+constants.Constants.GECKODRIVERPATH); 
			  FirefoxOptions options=new FirefoxOptions();
			  options.addArguments("--remote-allow-origins=*");
			  driver= new FirefoxDriver(options);
		}
		else if(browser.equalsIgnoreCase("Chrome")) 
		{
			  ChromeOptions chromeOptions = new ChromeOptions();
			  chromeOptions.addArguments("--remote-allow-origins=*");
			  driver = new ChromeDriver(chromeOptions);
			 
		} 
		else if(browser.equalsIgnoreCase("Edge"))
		{
			  EdgeOptions edgeOptions = new EdgeOptions();
			  edgeOptions.addArguments("--remote-allow-origins=*");
			  driver = new EdgeDriver(edgeOptions);
		}
		else 
		{
			throw new Exception("Browser is not correct"); 
		}
		driver.get(prop.getProperty("url"));	
		driver.manage().window().maximize();
		WaitUtility.pageLoadTimeOutWait(driver);
	}
	@AfterMethod (alwaysRun = true)
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

