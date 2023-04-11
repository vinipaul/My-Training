package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.SimpleInputFormDemoPage;
import com.obsqura.maven.pages.SingleInputFieldPageFactoryPage;

import utilities.ExcelUtility;

public class SingleInputFieldPageFactoryTest  extends Base{
	SingleInputFieldPageFactoryPage singleInputFieldPageFactoryPage;
	@Test
public void singleInputFeildpageFactory() {
		singleInputFieldPageFactoryPage=new SingleInputFieldPageFactoryPage(driver);
		String input="car";
		String expectedYourMessageText="Your Message : "+ input;
		singleInputFieldPageFactoryPage.enterDataInSingleInputField(input);
		singleInputFieldPageFactoryPage.clickOnShowMessageButton();
		String actualYourMessageLabelText=singleInputFieldPageFactoryPage.getYourMessageLabelText();
		assertEquals(expectedYourMessageText,actualYourMessageLabelText,"Your Message Result is not "+expectedYourMessageText);

}
}
