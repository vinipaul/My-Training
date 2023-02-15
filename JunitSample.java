package com.obsqura.maven.automationcourse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSample {
	public WebDriver driver;//for any web driver ,WebDriver is a an Interface.
	//public ChromeDriver driver;//specific for chrome driver
	//method for Initializing chrome browser.
	@BeforeClass
	public static void show() {
		System.out.println("this is before class");
	}
	@Before
public void initializeBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\vini java\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");//string argument ,webdriver path
	 driver=new ChromeDriver();//casting into Chromedriver
	 driver.get("https://www.amazon.ae/");//which site to be automated.
}
@Test
public void titleCommands() {
	String actualTitle="Welcome to Amazon.ae Shop Online in UAE for Electronics, Apparel, Computers, Grocery & more | Amazon.ae";
	
	String expectedtitle=driver.getTitle();
	assertEquals(expectedtitle,actualTitle);
	
}
@Test
public void getUrlCommand() {
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.amazon.ae/";
	assertEquals(expectedurl,actualurl);
}
@Test
public void pageSourceCommand() {
	String pagesource=driver.getPageSource();
	String includes="<link rel=\"dns-prefetch\" href=\"https://images-eu.ssl-images-amazon.com\">";
	System.out.println("this is pagesource");
	assertTrue(pagesource.contains(includes));
	}

public void driverClose() {
	driver.close();//automatically close current window after run
	
}
@After
public void driverQuit() {
driver.quit();// close all windows associated with url,quits the  webdriver session
}
//Navigation Commands
@AfterClass
public static void showafter() {
	System.out.println("this is after class");
}
@Test
public void navigateCommands() {
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	
	

	

}
