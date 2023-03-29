package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.CheckBoxDemoPageFactoryPage;

import utilities.PageUtility;

public class CheckBoxDemoPageFactoryTest extends Base {
	CategoryPage categoryPage;
	CheckBoxDemoPageFactoryPage checkBoxDemoPageFactoryPage;
	@Test
	public void verify_SingleInputCheckBox() {
	checkBoxDemoPageFactoryPage=new CheckBoxDemoPageFactoryPage (driver);
	categoryPage=new CategoryPage(driver);
	categoryPage.selectCategory("Checkbox Demo");
	checkBoxDemoPageFactoryPage.selectSingleInputCheckBox();
}
@Test 
public void verify_selectAllButtonBackgroundColor() {
	 String expectedselectAllButtonBackgroundColor="rgba(0, 123, 255, 1)";
	 categoryPage=new CategoryPage(driver);
	 categoryPage.selectCategory("Checkbox Demo");
	 checkBoxDemoPageFactoryPage =new CheckBoxDemoPageFactoryPage(driver);
	 String actualselectAllButtonBackgroundColor=PageUtility.getcssValueofElement(checkBoxDemoPageFactoryPage.selectallButtonElement(),"background-color");
	 assertEquals(actualselectAllButtonBackgroundColor, expectedselectAllButtonBackgroundColor,"Select All Button BackgroundColor is not"+expectedselectAllButtonBackgroundColor);
}
@Test
public void verify_attributevalueofSelectAllButton() {
	String expectedattributevalueofSelectAllButton="button";
	categoryPage=new CategoryPage(driver);
	categoryPage.selectCategory("Checkbox Demo");
	checkBoxDemoPageFactoryPage=new CheckBoxDemoPageFactoryPage(driver);
	String actualattributevalueofSelectAllButton=PageUtility.getAttributeofElement(checkBoxDemoPageFactoryPage.selectallButtonElement(),"type");
	assertEquals(actualattributevalueofSelectAllButton,expectedattributevalueofSelectAllButton,"Attribute value of Select All Button is not"+expectedattributevalueofSelectAllButton);
}
}
