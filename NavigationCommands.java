package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NavigationCommands extends Base {
@Test
public void validate_navigateTo() {
	driver.navigate().to("https://www.flipkart.com/");
	String expectedUrl="https://www.flipkart.com/";
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Not Navigated to flipcart from amazone");
}
@Test
public void verify_navigationBack() {
	String currentUrl=driver.getCurrentUrl();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	String expectedUrl="https://www.amazon.ae/";
	assertEquals(currentUrl,expectedUrl,"Not Navigated back to amazone from flipcart");
}
@Test
public void verify_navigationForward() {
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	String expectedUrl="https://www.flipkart.com/";
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Navigated forward flipcart from amazone");
}
@Test
public void verify_navigationRefresh() {
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().refresh();
	String expectedUrl="https://www.flipkart.com/";
	String currentUrl=driver.getCurrentUrl();
	assertEquals(currentUrl,expectedUrl,"Page not refreshed");
}
}
