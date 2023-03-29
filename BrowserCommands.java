package com.obsqura.maven.Testngnew;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BrowserCommands extends Base {
	@Test
public void verifyTitle() {
	String expectedtitle="Welcome to Amazon.ae Shop Online in UAE for Electronics, Apparel, Computers, Grocery & more | Amazon.ae";
	String actualtitle=driver.getTitle();
	assertEquals(expectedtitle,actualtitle,"Title is not same");
}
	@Test
	public void verify_currentpageurl() {
		String expectedurl="https://www.amazon.ae/";
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl, actualurl,"URL not same");
	}
	@Test
	public void verify_pagesource() {
		String expectedline="<link rel=\"dns-prefetch\" href=\"https://images-eu.ssl-images-amazon.com\">";
		String actualsource=driver.getPageSource();
		assertTrue(actualsource.contains(expectedline));
	}
}
