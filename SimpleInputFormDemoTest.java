package com.obsqura.maven.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.SimpleInputFormDemoPage;

import utilities.ExcelUtility;

public class SimpleInputFormDemoTest  extends Base{
	SimpleInputFormDemoPage simpleinputformdemo;
@Test
public void verify_singleInputField() throws IOException {
	String input=ExcelUtility.getString(0,0,System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");//row,column,file path,sheetname
	ArrayList<String> fullList=new ArrayList<String>();
	fullList= ExcelUtility.getString(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");
	System.out.println(fullList);
	String expectedYourMessageText="Your Message : "+ input;
	simpleinputformdemo=new SimpleInputFormDemoPage(driver);
	simpleinputformdemo.enterDataInSingleInputField(input);
	simpleinputformdemo.clickOnShowMessageButton();
	String actualYourMessageLabelText=simpleinputformdemo.getYourMessageLabelText();
	assertEquals(expectedYourMessageText,actualYourMessageLabelText,"Your Message Result is not "+expectedYourMessageText);
}
}
