package com.obsqura.maven.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.PageUtility;
import utilities.WaitUtility;

public class Base {
public WebDriver driver;
@BeforeMethod
public void toInitializeBrowser() {
	//System.setProperty("webdriver.chrome.driver","F:\\vini java\\PageObjectModel\\src\\main\\java\\Resources\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","F:\\vini java\\PageObjectModel\\src\\main\\java\\Resources\\geckodriver.exe");
	//System.setProperty("webdriver.edge.driver","F:\\vini java\\PageObjectModel\\src\\main\\java\\Resources\\msedgedriver.exe");
	ChromeOptions options = new ChromeOptions();//these 3 code for new chrome version 111.533
	options.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(options);

	//driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	//driver=new EdgeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	WaitUtility.pageLoadTimeOutWait(driver);
}
@AfterMethod
public void toQuit() {
	driver.quit();
}
}
