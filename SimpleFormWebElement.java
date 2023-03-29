package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SimpleFormWebElement extends Base {
	@Test
	public void singleinputfield() {
		String message="car";
		String expectedValue="Your Message : "+message;
		WebDriverWait waitfortextbox1=new WebDriverWait(driver, Duration.ofSeconds(10));
		waitfortextbox1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='single-input-field']")));//explicit wait
		WebElement textbox1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean isTextBox1Displayed=textbox1.isDisplayed();//returns boolean
		assertTrue(isTextBox1Displayed,"textbox1 is not enabled");
		textbox1.sendKeys(message);
		waitfortextbox1.until(ExpectedConditions.textToBePresentInElementValue(textbox1, message));//explicit wait
		WebDriverWait waitforshowmessagebutton=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitforshowmessagebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-one']")));
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonEnabled=showMessageButton.isEnabled();
		assertTrue(isShowMessageButtonEnabled, "show message button is not enabled");
		showMessageButton.click();
		waitforshowmessagebutton.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText=yourmessage.getText();
		assertEquals(expectedValue, yourmessageText,"message not equal");
		
	}
	@Test
	public void twoinputfield() {
		int valueA=9;
		int valueB=3;
		int expectedTotal=valueA+valueB;
		String expectedResult="Total A + B : "+expectedTotal;
		WebElement textBox1=driver.findElement(By.xpath("//input[@id='value-a']"));
		boolean textBox1IsDisplayed=textBox1.isDisplayed();
		assertTrue(textBox1IsDisplayed,"Enter value A field is not displayed");
		textBox1.sendKeys(String.valueOf(valueA));
		WebElement textBox2=driver.findElement(By.cssSelector("input#value-b"));
		boolean textBox2IsDisplayed=textBox2.isDisplayed();
		assertTrue(textBox2IsDisplayed,"Enter value B field is not displayed");
		textBox2.sendKeys(String.valueOf(valueB));
		WebElement getTotal=driver.findElement(By.cssSelector("button#button-two"));
		boolean getTotalIsEnabled=getTotal.isEnabled();
		assertTrue(getTotalIsEnabled,"get total button is not enabled");
		getTotal.click();
		WebElement totalElement=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalElementText=totalElement.getText();
		assertEquals(expectedResult, totalElementText,"Answer is not correct");
		}
}
