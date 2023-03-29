package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.annotation.ParametersAreNonnullByDefault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonePractice extends Base{
	@Test
	public void locators() {
		driver.navigate().to("https://www.amazon.ae/?");
		driver.findElement(By.id("nav-logo-sprites"));
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		driver.findElement(By.xpath("//a[starts-with(@class,'nav-logo-link')]"));
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']//child::span[starts-with(@class,'nav-sprite nav-logo-base')]"));
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @class='nav-logo-link nav-progressive-attribute']"));
		driver.findElement(By.xpath("//span[@id='logo-ext']//parent::a[@id='nav-logo-sprites']"));
		driver.findElement(By.xpath("//span[@id='logo-ext']//ancestor::div[@id='nav-logo']"));
	}
@Test
public void verify_enterinputtosearchbar() {
	driver.navigate().to("https://www.amazon.ae/?");
	WebElement searchbarElement=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbarElement.clear();
	searchbarElement.sendKeys("salwar");
	String searchbarTagName=searchbarElement.getTagName();
	System.out.println(searchbarTagName);
	String searchbarAttributeValue=searchbarElement.getAttribute("value");
	System.out.println(searchbarAttributeValue);
}
@Test
public void verify_searchlenseisenabled() {
	driver.navigate().to("https://www.amazon.ae/?");
	WebElement searchlenseElement=driver.findElement(By.xpath("//input[@value='Go']"));
	boolean searchlenseElementisEnabled = searchlenseElement.isEnabled();
	assertTrue(searchlenseElementisEnabled,"searchlense is disabled");
}
}
