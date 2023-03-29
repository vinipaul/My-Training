package com.obsqura.maven.Testngnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassSample extends Base {
	@Test
public void  action_click() {
	String message="car";
	WebElement textbox1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	textbox1.sendKeys(message);
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	Actions action = new Actions(driver);
	action.moveToElement(showMessageButton).click().perform();
}
	@Test
	public void mouse_hover() {
		WebElement simpleformdemoElement=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(simpleformdemoElement).build().perform();
	}
	@Test
	public void double_click() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButtonElement=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action = new Actions(driver);
		action.doubleClick(selectAllButtonElement).perform();
	}
	@Test
	public void clickandHold() {
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement selectAllButtonElement=driver.findElement(By.xpath("//input[@id='button-two']"));
	Actions action = new Actions(driver);
	action.clickAndHold(selectAllButtonElement).perform();
	}
	@Test
	public void rightClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButtonElement=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action = new Actions(driver);
		action.contextClick(selectAllButtonElement).perform();	
		}
	@Test
	public void dragandDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement sourceElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement destinationElement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
		//action.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
	}
}

