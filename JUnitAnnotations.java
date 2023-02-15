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




public class JUnitAnnotations 
{
	public WebDriver driver;
	@Before				//if you want to execute some statement such as preconditions before each test case.
	public void initializeBrowser() {
		System.out.println("This is @Before annotation.");
		System.setProperty("WebDriver.driver.chrome", "F:\\vini java\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
	
	}

@BeforeClass				//if you want to execute some statements before all the test cases..eg :connection
	public static void showBeforeClass() {
		System.out.println("This is JUnit @BeforeClass annotation. ");
	}
@Test               //method to which it is attached can be executed as a test Case.
public void titleChecking() {
	System.out.println("Test case 1:Title checking");
	String actualtitle=driver.getTitle();
	String expectedtitle="Welcome to Amazon.ae Shop Online in UAE for Electronics, Apparel, Computers, Grocery & more | Amazon.ae";
	assertEquals(expectedtitle,actualtitle);
}
@Test
public void urlChecking() {
	System.out.println(" test case 2:URL checking");
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.amazon.ae/";
	assertEquals( expectedurl,actualurl);
}
@Test
public void pageSourceChecking() {
	System.out.println("Test case 3:Page Source checking");
	String expectedline="<link rel=\"dns-prefetch\" href=\"https://images-eu.ssl-images-amazon.com\">";
	String actualsource=driver.getPageSource();
	assertTrue(actualsource.contains(expectedline));
}
@Test
public void navigationsCheck() {
	System.out.println("Test case 4:checking for navigations;forward,back,refresh");
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
}
@After              //if you want to execute some statements after each Test Case
public void quitSession() {
	driver.quit();
}
@AfterClass				//if you want to execute some statements after all test cases.eg:resource release
public static void showAfterClass() {
	System.out.println("This is @AfterClass annotation. ");
}
}














