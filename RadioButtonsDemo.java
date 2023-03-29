package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadioButtonsDemo extends Base {
@Test
public void verify_Male_RadioButtonDemo() {
	
	/*
	 * String input="Radio Buttons Demo";
	 *  List <WebElement>items=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
	 * for(WebElement item:items) { 
	 * String itemText=item.getText();
	 * if(itemText.equals(input)) {
	 *  item.click(); 
	 *  break; 
	 *  }
	 *  }
	 */
	String input="Radio Buttons Demo"; 
	SelectCategory selectcategory=new SelectCategory(driver);
	selectcategory.selectCatogory(input);
	String expectedMaleShowMessageText="Radio button 'Male' is checked";
	WebDriverWait waitforMaleRadioButton = new WebDriverWait(driver,Duration.ofSeconds(10));
	waitforMaleRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#inlineRadio1")));
	WebElement maleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio1"));
	WebDriverWait waitforFemaleRadioButton=new WebDriverWait(driver, Duration.ofSeconds(10));
	waitforFemaleRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#inlineRadio2")));
	WebElement femaleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio2"));
	boolean maleRadoButtonISSelected=maleRadioButton.isSelected();
	boolean femaleRadoButtonISSelected=femaleRadioButton.isSelected();
	assertFalse(maleRadoButtonISSelected && femaleRadoButtonISSelected,"Initially radio button is selected");
	boolean maleRadioButtonIsDisplayed=maleRadioButton.isDisplayed();
	assertTrue(maleRadioButtonIsDisplayed,"Male radio button is not displayed");
	waitforMaleRadioButton.until(ExpectedConditions.elementToBeClickable(maleRadioButton));
	maleRadioButton.click();
	waitforMaleRadioButton.until(ExpectedConditions.elementToBeSelected(maleRadioButton));
	WebDriverWait waitforshowmessagebutton=new WebDriverWait(driver,Duration.ofSeconds(10));
	waitforshowmessagebutton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#button-one")));
	WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
	boolean showMessageButtonIsEnabled=showMessageButton.isEnabled();
	assertTrue(showMessageButtonIsEnabled,"show message button is not enabled");
	waitforshowmessagebutton.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait
	showMessageButton.click();
	waitforshowmessagebutton.until(ExpectedConditions.elementSelectionStateToBe(showMessageButton, showMessageButton.isSelected()));//explicit wait
	WebDriverWait waitforshowmessagebuttontext=new WebDriverWait(driver,Duration.ofSeconds(10));
	waitforshowmessagebuttontext.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#message-one")));//explicit wait
	WebElement showMessageButtonText=driver.findElement(By.cssSelector("div#message-one"));
	String actualMaleShowMessageButtonText=showMessageButtonText.getText();
	assertEquals(expectedMaleShowMessageText,actualMaleShowMessageButtonText,"show message button result is not"+expectedMaleShowMessageText);
	String pageTitle=driver.getTitle();
	WebDriverWait waitforpageTitle=new WebDriverWait(driver, Duration.ofSeconds(10));
	waitforpageTitle.until(ExpectedConditions.titleIs(pageTitle));//explicit wait 
	WebDriverWait waitforPageUrl=new WebDriverWait(driver,Duration.ofSeconds(10));
	String pageUrl=driver.getCurrentUrl();
	waitforPageUrl.until(ExpectedConditions.urlToBe(pageUrl));//explicit wait
	waitforMaleRadioButton.until(ExpectedConditions.attributeContains(maleRadioButton,"value","Male"));//explicit wait
}
@Test
public void verify_Female_RadioButton() {
	String input="Radio Buttons Demo"; 
	SelectCategory selectcategory=new SelectCategory(driver);
	selectcategory.selectCatogory(input);
	String expectedFemaleShowMessageText="Radio button 'Female' is checked";
	WebElement maleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio1"));
	WebElement femaleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio2"));
	boolean maleRadoButtonISSelected=maleRadioButton.isSelected();
	boolean femaleRadoButtonISSelected=femaleRadioButton.isSelected();
	assertFalse(maleRadoButtonISSelected && femaleRadoButtonISSelected,"Initially radio button is selected");
	boolean femaleRadioButtonIsDisplayed=femaleRadioButton.isDisplayed();
	assertTrue(femaleRadioButtonIsDisplayed,"Female radio button is not displayed");
	femaleRadioButton.click();
	WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
	boolean showMessageButtonIsEnabled=showMessageButton.isEnabled();
	assertTrue(showMessageButtonIsEnabled,"show message button is not enabled");
	showMessageButton.click();
	WebElement showMessageButtonText=driver.findElement(By.cssSelector("div#message-one"));
	String actualFemaleShowMessageButtonText=showMessageButtonText.getText();
	assertEquals(expectedFemaleShowMessageText, actualFemaleShowMessageButtonText,"show message button result is not"+expectedFemaleShowMessageText);
	
	}
@Test
public  void verify_group_RadioButton() {
	String input="Radio Buttons Demo"; 
	SelectCategory selectcategory=new SelectCategory(driver);
	selectcategory.selectCatogory(input);
	WebElement maleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio11"));
	WebElement femaleRadioButton=driver.findElement(By.cssSelector("input#inlineRadio21"));
	boolean maleRadoButtonISSelected=maleRadioButton.isSelected();
	boolean femaleRadoButtonISSelected=femaleRadioButton.isSelected();
	assertTrue(maleRadoButtonISSelected==false && femaleRadoButtonISSelected==false,"Initially gender radio button is selected");
	WebElement AgeGroupRadioButton1to18=driver.findElement(By.cssSelector("input#inlineRadio22"));
	WebElement AgeGroupRadioButton19to44=driver.findElement(By.cssSelector("input#inlineRadio23"));
	WebElement AgeGroupRadioButton45to60=driver.findElement(By.cssSelector("input#inlineRadio24"));
	boolean AgeGroupRadioButton1to18IsSelected=AgeGroupRadioButton1to18.isSelected();
	boolean AgeGroupRadioButton19to44IsSelected=AgeGroupRadioButton19to44.isSelected();
	boolean AgeGroupRadioButton45to60IsSelected=AgeGroupRadioButton45to60.isSelected();
	assertFalse(AgeGroupRadioButton1to18IsSelected && AgeGroupRadioButton19to44IsSelected && AgeGroupRadioButton45to60IsSelected,"Initially age group radio button is selected");
	boolean femaleRadioButtonIsDisplayed=femaleRadioButton.isDisplayed();
	assertTrue(femaleRadioButtonIsDisplayed,"Female radio button is not displayed");
	femaleRadioButton.click();
	List<WebElement> radiobuttons=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//label"));
	String inputAgeGroupRadioButtonforFemale="1 to 18";
	for(WebElement radiobutton:radiobuttons) {
		String radioButtonText=radiobutton.getText();
		if(radioButtonText.equals(inputAgeGroupRadioButtonforFemale)) {
		radiobutton.click();
		break;
		}
		}
	WebElement getResultButton=driver.findElement(By.cssSelector("button#button-two"));
	boolean getResultButtonIsEnabled=getResultButton.isEnabled();
	assertTrue(getResultButtonIsEnabled, "Get Result Button is not enabled");
	getResultButton.click();
	boolean maleRadioButtonIsDisplayed=maleRadioButton.isDisplayed();
	assertTrue(maleRadioButtonIsDisplayed,"Male radio button is not displayed");
	maleRadioButton.click();
	String inputAgeGroupRadioButtonforMale="45 to 60";
	for(WebElement radiobutton:radiobuttons) {
		String radioButtonText=radiobutton.getText();
		if(radioButtonText.equals(inputAgeGroupRadioButtonforMale)) {
		radiobutton.click();
		break;
		}
		}
	assertTrue(getResultButtonIsEnabled, "Get Result Button is not enabled");
	getResultButton.click();

}
}
