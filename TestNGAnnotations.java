package com.obsqura.maven.Testngnew;

import java.security.PublicKey;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Base {
	@BeforeClass
public void show() {
	System.out.println("This is before class");
}
@Test         //method to which it is attached can be executed as a test Case.
public void titleChecking() {
	System.out.println("Test case 1:Title checking");
	
}
@Test
public void urlChecking() {
	System.out.println(" test case 2:URL checking");
	
}
@AfterClass
public void classAfter() {
	System.out.println("This is classafter");
}
@BeforeSuite
public void suiteBefore() {
	System.out.println("This is Beforesuite");
}
@AfterSuite
public void suiteAfter() {
	System.out.println("This is Aftersuite");
}
@BeforeTest
public void testBefore() {
	System.out.println("This is before test");

}
@AfterTest
public void testAfter() {
	System.out.println("This is after test");
}
@BeforeMethod
public void methodBefore() {
	System.out.println("This is before method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("This is after method");
}

}
