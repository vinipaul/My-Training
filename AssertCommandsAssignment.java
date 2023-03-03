package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Equivalence;

public class AssertCommandsAssignment extends Base {
@Test
public void assert_equals() {
	String expectedurl="https://www.amazon.ae/";
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	String actualurl=driver.getCurrentUrl();
	assertEquals(expectedurl,actualurl,"Not navigated back to Amazon from flipkart.");
	}
@Test
public void assert_notequals() {
	String expectedurl="https://www.flipkart.com/";
	driver.navigate().to("htps://www.flipkart.com/");//incorrect url
	String actualurl=driver.getCurrentUrl();
	assertNotEquals(expectedurl, actualurl,"should not navigate to flipkart from amazon");
}
@Test
public void assert_true() {
	String include="amazon";
	String pagesource=driver.getPageSource();
	assertTrue(pagesource.contains(include),"Current pagesource of amazon   does not  contain string amazon");
	}
@Test
public void assert_false() {
	String include="flipkart";
	String pagesource=driver.getPageSource();
	assertFalse(pagesource.contains(include),"Current pagesource of amazon contains string flipkart");
	}
@Test
public void assert_null() {
	String find="amazon";
	int count=0,index=0;
	String pagsource=driver.getPageSource();
	while ((index=pagsource.indexOf(find,index))!=-1) {
		count++;
		index++;
	}	
	//System.out.println(count);
	assertNull(count,"pagesource contain string amazon");
	
	}
@Test
public void assert_notnull() {
	String find="amazon";
	int count=0,index=0;
	String pagsource=driver.getPageSource();
	while ((index=pagsource.indexOf(find,index))!=-1) {
		count++;
		index++;
	}	
		assertNotNull(count,"Amazon pagesource contains string amazon ");
}
}

