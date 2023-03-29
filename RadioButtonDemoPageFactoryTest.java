package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.RadiButtonDemoPageFactoryPage;
import com.obsqura.maven.pages.RadioButtonsDemoPage;

import utilities.PageUtility;

public class RadioButtonDemoPageFactoryTest extends Base {
CategoryPage categoryPage;
RadiButtonDemoPageFactoryPage radiButtonDemoPageFactoryPage;
@Test
public void radioButtonsDemoTest() {
	 String expectedshowSelectedValueButtonText="Radio button 'Female' is checked";
	 radiButtonDemoPageFactoryPage=new RadiButtonDemoPageFactoryPage (driver);
	 categoryPage=new CategoryPage(driver);
	 categoryPage.selectCategory("Radio Buttons Demo");
	 radiButtonDemoPageFactoryPage.selectFemaleRadioButton();
	 boolean IsEnabled= radiButtonDemoPageFactoryPage.isEnabledShowSelectedValueButton();
	 assertTrue(IsEnabled,"showSelectedValueButton is not enabled");
	radiButtonDemoPageFactoryPage.showSelectedValueButtonClick();
	 String actualshowSelectedValueButtonText= radiButtonDemoPageFactoryPage.showSelectedValueLabelText();
	 assertEquals(expectedshowSelectedValueButtonText,actualshowSelectedValueButtonText,"Show Selected Value Button Text is not"+expectedshowSelectedValueButtonText);
}
@Test
public void verify_showSelectedValueButtonFontColor() {
		String expectedFontColorofshowSelectedValueButton="rgba(255, 255, 255, 1)";
		categoryPage=new CategoryPage(driver);
		categoryPage.selectCategory("Radio Buttons Demo");
	    radiButtonDemoPageFactoryPage=new RadiButtonDemoPageFactoryPage(driver);
		String actualfontcolorofselectedvaluebutton= PageUtility.getcssValueofElement( radiButtonDemoPageFactoryPage.showSelectedValueButtonElement(), "color");
		assertEquals(actualfontcolorofselectedvaluebutton, expectedFontColorofshowSelectedValueButton,"font color of  show selected value button is not"+expectedFontColorofshowSelectedValueButton);
	}
@Test
public void verify_showSelectedValueButtonTextAlignment() {
		String expectedshowSelectedValueButtonTextAlignment="center";
		categoryPage=new CategoryPage(driver);
		categoryPage.selectCategory("Radio Buttons Demo");
	    radiButtonDemoPageFactoryPage=new RadiButtonDemoPageFactoryPage(driver);
		String actualshowSelectedValueButtonTextAlignment= PageUtility.getcssValueofElement(radiButtonDemoPageFactoryPage.showSelectedValueButtonElement(),"text-align");
		assertEquals(actualshowSelectedValueButtonTextAlignment, expectedshowSelectedValueButtonTextAlignment,"show selected value button text alignment is not"+expectedshowSelectedValueButtonTextAlignment);
	}
}
