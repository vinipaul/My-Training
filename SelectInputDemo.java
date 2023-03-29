package com.obsqura.maven.Testngnew;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.SinglePass;

public class SelectInputDemo  extends Base{
	@Test
public void selectInputDemo() {
	String input="Select Input"; 
	SelectCategory selectcategory=new SelectCategory(driver);
	selectcategory.selectCatogory(input);
	WebElement dropDownElement=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(dropDownElement);
	select.selectByIndex(1);
	select.selectByVisibleText("Yellow");
	select.selectByValue("Green");
	List <WebElement> options=select.getOptions();
	int size=options.size();
	//WebElement tableElement=driver.findElement(By.xpath("//select[@class='form-control']"));//multiple values
	WebElement tableElement=driver.findElement(By.xpath("//select[@id='single-input-field']"));//Single value
	List<WebElement> dropdownOptions=tableElement.findElements(By.tagName("option"));
	WebElement redColorElement=	dropdownOptions.get(1);//select by index
	System.out.println("selected color by index is"+redColorElement.getText());
	//List <WebElement> dropdownOptions=driver.findElements(By.xpath("//select[@id='single-input-field']//option"));
	String dropDownInput="Yellow";   //select by value
	for(WebElement dropdownOption:dropdownOptions) {
	String dropDownAttributeValue=dropdownOption.getAttribute("value");
	if(dropDownAttributeValue.equals(dropDownInput)) {
		dropdownOption.click();
		break;
	}
	}
	String dropDownInputByText="Green";   //select by visibletext
	for(WebElement dropdownOption:dropdownOptions) {
		String dropDownText=dropdownOption.getText();
		if(dropDownText.equals(dropDownInputByText)) {
			dropdownOption.click();
			break;
		}
	}
	WebElement SelectedColorLabel=driver.findElement(By.cssSelector("div#message-one"));
	String SelectedColorLabelText=SelectedColorLabel.getText();
	}
	
	@Test
	public void multipleSelect() {
		String input="Select Input";
		SelectCategory selectcategory=new SelectCategory(driver);
		selectcategory.selectCatogory(input);
		WebElement multiSelectDropDown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select=new Select(multiSelectDropDown);
		boolean selectedDropDown=select.isMultiple();
		select.selectByIndex(1);
		select.selectByIndex(2);
		WebElement getFirstSelectedButton=driver.findElement(By.cssSelector("button#button-first"));
		getFirstSelectedButton.click();
		WebElement firstSelectedColorLabel=driver.findElement(By.cssSelector("div#message-two"));
		String firstSelectedColorLabelText=firstSelectedColorLabel.getText();
		WebElement getAllSelectedButton=driver.findElement(By.cssSelector("button#button-all"));
		getAllSelectedButton.click();
		WebElement allaSelcetedColorsAreLabel=driver.findElement(By.cssSelector("div#message-two"));
		String allaSelcetedColorsAreLabelText=allaSelcetedColorsAreLabel.getText();
		select.deselectAll();
	}
}
