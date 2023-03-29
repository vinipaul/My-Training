package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NavigationCommands extends Base {
@Test
public void validate_navigateTo() {
	String expectedUrl="https://www.flipkart.com/";
	driver.navigate().to("https://www.flipkart.com/");
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Not Navigated to flipkart from amazone");
}
@Test
public void verify_navigationBack() {
	String expectedUrl="https://www.amazon.ae/";
	String currentUrl=driver.getCurrentUrl();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	assertEquals(currentUrl,expectedUrl,"Not Navigated back to amazone from flipkart");
}
@Test
public void verify_navigationForward() {
	String expectedUrl="https://www.flipkart.com/";
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Not Navigated to flipkart from amazone");
}
@Test
public void verify_navigationRefresh() {
	String expectedUrl="https://www.flipkart.com/";
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().refresh();
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Page not refreshed");
}
}
