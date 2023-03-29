package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetTotalButtonStyles extends Base {
@Test
public void verify_HeightAndWidth() {
	String expectedGetTotalButtonHeight="38";
	String expectedGetTotalButtonWidth="94";
	WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
	boolean getTotalButtonIsDispalyed=getTotalButton.isDisplayed();
	assertTrue(getTotalButtonIsDispalyed,"Get Total Button Is Not Enabled");
	Dimension getTotalButtonSize=getTotalButton.getSize();
	int actualheight=getTotalButtonSize.getHeight();
	int actualwidth=getTotalButtonSize.getWidth();
	assertEquals(expectedGetTotalButtonHeight,actualheight,"Get Total Button Height is not"+expectedGetTotalButtonHeight);
	assertEquals(expectedGetTotalButtonWidth, actualwidth,"Get Total Button Width is not"+expectedGetTotalButtonWidth);
	
}
@Test
public void verify_AlignedBelowValueBField() {
	WebElement valueBTextBox=driver.findElement(By.cssSelector("input#value-b"));
	boolean  valueBTextBoxIsDisplayed=valueBTextBox.isDisplayed();
	assertTrue(valueBTextBoxIsDisplayed,"Enter value B field is not displayed");
	Point textBoxLocation=valueBTextBox.getLocation();
	int valueBXCoordinate=textBoxLocation.getX();//425
	int valueBYCoordinate=textBoxLocation.getY();//625
	WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
	boolean  getTotalButtonIsDisplayed =valueBTextBox.isDisplayed();
	assertTrue(getTotalButtonIsDisplayed,"Get Total Button  is not enabled");
	Point getTotalButtonLocation=getTotalButton.getLocation();
	int getTotalButtonXCoordinate=getTotalButtonLocation.getX();//425
	int getTotalButtonYCoordinate=getTotalButtonLocation.getY();//679
	assertTrue(valueBYCoordinate<getTotalButtonYCoordinate,"get total button field is above the enter value B field");
	
}
}
