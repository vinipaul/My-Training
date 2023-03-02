package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test
	public void commands() {
		/*
		 * WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 * searchbar.sendKeys("iphone14"); 
		 * searchbar.clear();
		 * searchbar.sendKeys("iphone14"); 
		 * WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		 * searchbutton.click();
		 */
		String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText=yourmessage.getText();
		WebElement textbox1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		String tagNameString=textbox1.getTagName();
		String placeholderValue=textbox1.getAttribute("placeholder");
		String classValue=textbox1.getAttribute("class");
		String typeValue=textbox1.getAttribute("type");
		String idValue=textbox1.getAttribute("id");
		WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessageButton.isEnabled();
		assertTrue(showMessageButtonIsEnabled, "show messagebutton is not enabled");
		String showMessageButtonBackGround=showMessageButton.getCssValue("background-color");
		assertEquals(expectedBackGroundColor,showMessageButtonBackGround,"Back ground color is not same");
		Point location=showMessageButton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		Dimension size=showMessageButton.getSize();
		int showMessageButtonHeight=size.getHeight();
		int showMessageButtonWidth=size.getWidth();
		

		
	}
}
