package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertandPopUp extends Base{
	@Test
public void alert_acceptOk() {
 	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
 	WebElement clickmeButtonElement=driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-success')]"));
 	clickmeButtonElement.click();
 	driver.switchTo().alert().accept();
}
@Test
public void alert_cancel() {
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement clickmeButtonElement=driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-warning')]"));
	clickmeButtonElement.click();
	driver.switchTo().alert().dismiss();
}
@Test
public void alert_sendtext() throws InterruptedException {
	String name="vini";
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement clickmeButtonElement=driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-danger')]"));
	clickmeButtonElement.click();
	driver.switchTo().alert().sendKeys("name");
	}
@Test
public void alertbox_getText() {
	String name="vini";
	String expectedAlertBoxText="Please enter your name";
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement clickmeButtonElement=driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-danger')]"));
	clickmeButtonElement.click();
	driver.switchTo().alert().sendKeys(name);
	String actualalertBoxText=driver.switchTo().alert().getText();
	assertEquals(actualalertBoxText, expectedAlertBoxText,"entered value is not "+expectedAlertBoxText);
}
}
