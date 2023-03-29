package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.SimpleInputFormDemoPage;

import utilities.ExcelUtility;
import utilities.PageUtility;

public class SimpleInputFormDemoTest  extends Base{
	SimpleInputFormDemoPage simpleinputformdemo;
@Test (priority = 1)
public void verify_singleInputField() throws IOException {
	String input=ExcelUtility.getString(0,0,System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");//row,column,file path,sheetname
	ArrayList<String> fullList=new ArrayList<String>();
	//fullList= ExcelUtility.getString(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");
	//System.out.println(fullList);
	String expectedYourMessageText="Your Message : "+ input;
	simpleinputformdemo=new SimpleInputFormDemoPage(driver);
	simpleinputformdemo.enterDataInSingleInputField(input);
	simpleinputformdemo.clickOnShowMessageButton();
	String actualYourMessageLabelText=simpleinputformdemo.getYourMessageLabelText();
	assertEquals(expectedYourMessageText,actualYourMessageLabelText,"Your Message Result is not "+expectedYourMessageText);
}
@Test (priority = 2)
public void verify_showMessageButtonText() {
String expectedshowMessageButtonText="Show Message";
simpleinputformdemo=new SimpleInputFormDemoPage(driver);
String actualshowMessageButtonText=PageUtility.getElementText(simpleinputformdemo.showMessageButtonElement());
assertEquals(actualshowMessageButtonText,expectedshowMessageButtonText,"show Message ButtonText is not"+expectedshowMessageButtonText);
}
@Test (priority = 3)
public void verify_SingleInputFieldTextBoxtagname() {
	String expectedSingleInputFieldTextBoxtagname="input";
	simpleinputformdemo=new SimpleInputFormDemoPage(driver);
	String actualSingleInputFieldTextBoxtagname=PageUtility.getTagNameofElement(simpleinputformdemo.SingleInputFieldElement());
	assertEquals(actualSingleInputFieldTextBoxtagname, expectedSingleInputFieldTextBoxtagname,"Single Input Field TextBox tagname is not"+expectedSingleInputFieldTextBoxtagname);
}
}
