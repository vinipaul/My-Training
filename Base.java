package com.obsqura.maven.Testngnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;//for any web driver ,WebDriver is a an Interface.
	//method for Initializing chrome browser.
@BeforeMethod
//@BeforeClass
public void initializeBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\vini java\\Testngnew\\src\\main\\java\\Resources\\chromedriver.exe");//string argument ,webdriver path
	 driver=new ChromeDriver();//casting into Chromedriver
	 //driver.get("https://www.amazon.ae/");
	 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");//which site to be automated.
	 //driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	 driver.manage().window().maximize();//to maximise the screen
}
@AfterMethod
//@AfterClass
public void driverQuit() {
driver.quit();// close all windows associated with url,quits the  webdriver session
}
}
