package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageExpensePage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class ManageExpenseTest  extends Base{
	ManageExpensePage manageExpensePage;
	
	@Test (groups = {"Regression","Sanity"},retryAnalyzer =Retry.class)
	public void verify_Cofirmation_AlertboxText_when_DeleteButton_Clicked() throws IOException{
		manageExpensePage=new ManageExpensePage(driver);
		String expectedText=ExcelUtility.getString(0, 0,constants.Constants.FILEPATH,"ManageExpense_Page");
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnmanageExpenseLink()
		.clickOnDeleteIcon();
		String actualText=manageExpensePage.getAlertboxText();
		assertEquals(expectedText, actualText,"Alert box Text is not "+expectedText);
		}
	@Test (groups = {"Sanity"},retryAnalyzer = Retry.class)
	public void verify_Cofirmation_Alertbox_Cancel_Click_Disallow_Deletion() throws IOException {
		manageExpensePage=new ManageExpensePage(driver);
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnmanageExpenseLink()
		.clickOnDeleteIcon()
		.ClickCancelButton();
		assertTrue(manageExpensePage.checkSupposedTitleIsDeletedOrNot_From_TheTable(),"Supposed title is not in the Table.");
	    }
	
	
}
