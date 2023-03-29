package com.obsqura.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.PageUtility;

public class ActionsClassPage {
public WebDriver driver;
public ActionsClassPage(WebDriver driver) {
	this.driver=driver;
}
By  textbox1=By.xpath("//input[@id='single-input-field']");
By showMessageButton=By.xpath("//button[@id='button-one']");
By simpleformdemolink=By.xpath("//a[text()='Simple Form Demo']");
By selectAllButton=By.xpath("//input[@id='button-two']");
By dragfrom=By.xpath("//span[text()='Draggable n°1']");
By dragTo=By.xpath("//div[@id='mydropzone']");



public WebElement textBoxElement() {
	WebElement textbox1Element=driver.findElement(textbox1);
	return textbox1Element;
}
public WebElement showMessageButtonElement() {
	WebElement showMessageButtonElement=driver.findElement(showMessageButton);
	return showMessageButtonElement;
}
public WebElement simpleformdemolinkElement() {
	WebElement simpleformdemolinkElement=driver.findElement(simpleformdemolink);
	return simpleformdemolinkElement;
}
public WebElement selectAllButtonElement() {
	WebElement selectAllButtonElement=driver.findElement(selectAllButton);
	return selectAllButtonElement;
}
public WebElement dragfromElement() {
	WebElement sourceElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	return sourceElement;
}
public WebElement dragToElement() {
	WebElement destinationElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	return destinationElement;
}


public void enterDataInTextBox(String message) {
	WebElement element=textBoxElement();
	PageUtility.sendKey(element,message);
}
public void showMessageButton_singleClick() {
	WebElement element=showMessageButtonElement();
	PageUtility.single_click(element, driver);
}
public void simpleformdemolink_mouseHover() {
	PageUtility.mouse_hover(simpleformdemolinkElement(), driver);
}
public void doubleclick_onCheckboxSelectAllButton() {
	PageUtility.double_click(driver,selectAllButtonElement());
}
public void rightClickon_checkboxSelectAllButton() {
	PageUtility.right_click(selectAllButtonElement(), driver);
}
public void clickandHoldOn_checkboxSelectAllButton() {
	PageUtility.clickAndHoldOnElement(selectAllButtonElement(), driver);
}
public void draganddropfieldinOthersofMagnaveBar() {
	PageUtility.dragand_drop(driver, dragfromElement(), dragToElement());
}
}
