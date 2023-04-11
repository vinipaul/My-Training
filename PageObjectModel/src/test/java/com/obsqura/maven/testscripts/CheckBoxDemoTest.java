package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.CheckBoxDemoPage;

import utilities.PageUtility;

public class CheckBoxDemoTest extends Base{
	CategoryPage categorypage;
	CheckBoxDemoPage checkBoxDemo;
@Test (priority = 1)
public void verify_SingleInputCheckBox() {
	checkBoxDemo=new CheckBoxDemoPage(driver);
	categorypage=new CategoryPage(driver);
	categorypage.selectCategory("Checkbox Demo");
	checkBoxDemo.selectSingleInputCheckBox();
}
@Test (priority = 2)
public void verify_selectAllButtonBackgroundColor() {
	 String expectedselectAllButtonBackgroundColor="rgba(0, 123, 255, 1)";
	 categorypage=new CategoryPage(driver);
	 categorypage.selectCategory("Checkbox Demo");
	 checkBoxDemo=new CheckBoxDemoPage(driver);
	 String actualselectAllButtonBackgroundColor=PageUtility.getcssValueofElement(checkBoxDemo.selectallButtonElement(),"background-color");
	 assertEquals(actualselectAllButtonBackgroundColor, expectedselectAllButtonBackgroundColor,"Select All Button BackgroundColor is not"+expectedselectAllButtonBackgroundColor);
}
@Test (priority = 3)
public void verify_attributevalueofSelectAllButton() {
	String expectedattributevalueofSelectAllButton="button";
	categorypage=new CategoryPage(driver);
	categorypage.selectCategory("Checkbox Demo");
	checkBoxDemo=new CheckBoxDemoPage(driver);
	String actualattributevalueofSelectAllButton=PageUtility.getAttributeofElement(checkBoxDemo.selectallButtonElement(),"type");
	assertEquals(actualattributevalueofSelectAllButton,expectedattributevalueofSelectAllButton,"Attribute value of Select All Button is not"+expectedattributevalueofSelectAllButton);
}
}
