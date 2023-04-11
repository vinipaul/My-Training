package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.RadioButtonsDemoPage;

import utilities.PageUtility;

public class RadioButtonsDemoTest extends Base {
	RadioButtonsDemoPage radiobuttonsdemopage;
	CategoryPage categorypage;
@Test (priority = 1)
public void radioButtonsDemoTest() {
	 String expectedshowSelectedValueButtonText="Radio button 'Female' is checked";
	 radiobuttonsdemopage=new RadioButtonsDemoPage(driver);
	 categorypage=new CategoryPage(driver);
	 categorypage.selectCategory("Radio Buttons Demo");
	 radiobuttonsdemopage.selectFemaleRadioButton();
	 boolean IsEnabled= radiobuttonsdemopage.isEnabledShowSelectedValueButton();
	 assertTrue(IsEnabled,"showSelectedValueButton is not enabled");
	 radiobuttonsdemopage.showSelectedValueButtonClick();
	 String actualshowSelectedValueButtonText= radiobuttonsdemopage.showSelectedValueLabelText();
	 assertEquals(expectedshowSelectedValueButtonText,actualshowSelectedValueButtonText,"Show Selected Value Button Text is not"+expectedshowSelectedValueButtonText);
}
@Test (priority = 2)
	public void verify_showSelectedValueButtonFontColor() {
		String expectedFontColorofshowSelectedValueButton="rgba(255, 255, 255, 1)";
		categorypage=new CategoryPage(driver);
		categorypage.selectCategory("Radio Buttons Demo");
	    radiobuttonsdemopage=new RadioButtonsDemoPage(driver);
		String actualfontcolorofselectedvaluebutton= PageUtility.getcssValueofElement( radiobuttonsdemopage.showSelectedValueButtonElement(), "color");
		assertEquals(actualfontcolorofselectedvaluebutton, expectedFontColorofshowSelectedValueButton,"font color of  show selected value button is not"+expectedFontColorofshowSelectedValueButton);
	}
@Test (priority = 3)
public void verify_showSelectedValueButtonTextAlignment() {
		String expectedshowSelectedValueButtonTextAlignment="center";
		categorypage=new CategoryPage(driver);
		categorypage.selectCategory("Radio Buttons Demo");
	    radiobuttonsdemopage=new RadioButtonsDemoPage(driver);
		String actualshowSelectedValueButtonTextAlignment= PageUtility.getcssValueofElement( radiobuttonsdemopage.showSelectedValueButtonElement(),"text-align");
		assertEquals(actualshowSelectedValueButtonTextAlignment, expectedshowSelectedValueButtonTextAlignment,"show selected value button text alignment is not"+expectedshowSelectedValueButtonTextAlignment);
	}
}
 