package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageExpensePage;

import utilities.ExcelUtility;

public class ManageExpenseTest  extends Base{
	
	ManageExpensePage manageExpensePage;
	@Test (groups = {"Regression"},retryAnalyzer = Retry.class)
	public void verify_Cofirmation_AlertboxText_when_DeleteButton_Clicked() throws IOException{
		manageExpensePage=new ManageExpensePage(driver);
		String expectedText=ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"ManageExpense_Page");
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnmanageExpenseLink()
		.clickOnDeleteIcon();
		String actualText=manageExpensePage.getAlertboxText();
		assertEquals(expectedText, actualText,"Alert box Text is not "+expectedText);
		}
	@Test (groups = {"Sanity"},retryAnalyzer = Retry.class)
	public void verify_Cofirmation_Alertbox_Cancel_Click() throws IOException {
		manageExpensePage=new ManageExpensePage(driver);
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnmanageExpenseLink()
		.clickOnDeleteIcon()
		.toClickCancelButton();
	    }
	
	
}
