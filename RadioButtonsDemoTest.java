package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.RadioButtonsDemoPage;

public class RadioButtonsDemoTest extends Base {
	@Test
public void radioButtonsDemoTest() {
	String expectedshowSelectedValueButtonText="Radio button 'Female' is checked";
	RadioButtonsDemoPage radiobuttonsdemo=new RadioButtonsDemoPage(driver);
	CategoryPage categorypage=new CategoryPage(driver);
	categorypage.selectCategory("Radio Buttons Demo");
	radiobuttonsdemo.selectFemaleRadioButton();
	boolean IsEnabled=radiobuttonsdemo.isEnabledShowSelectedValueButton();
	assertTrue(IsEnabled,"showSelectedValueButton is not enabled");
	radiobuttonsdemo.showSelectedValueButtonClick();
	String actualshowSelectedValueButtonText=radiobuttonsdemo.showSelectedValueLabelText();
	assertEquals(expectedshowSelectedValueButtonText,actualshowSelectedValueButtonText,"Show Selected Value Button Text is not"+expectedshowSelectedValueButtonText);
}
}
 