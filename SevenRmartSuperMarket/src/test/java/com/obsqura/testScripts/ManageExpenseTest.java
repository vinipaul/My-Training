package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageExpensePage;

import utilities.ExcelUtility;

public class ManageExpenseTest  extends Base{
	
	ManageExpensePage manageExpensePage;
	@Test (groups = {"Regression"})
	public void verify_CofirmationAlertboxText_when_DeleteButtonClicked() throws IOException{
		manageExpensePage=new ManageExpensePage(driver);
		String expectedText=ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"ManageExpense_Page");
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageExpensePage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageExpensePage.clickOnSignInButton();
		manageExpensePage.clickOnmanageExpenseLink();
		manageExpensePage.clickOnDeleteIcon();
		String actualText=manageExpensePage.getAlertboxText();
		assertEquals(expectedText, actualText,"Alert box Text is not "+expectedText);
		}
	@Test (groups = {"Sanity"})
	public void verify_CofirmationAlertbox_CancelClick() throws IOException {
		manageExpensePage=new ManageExpensePage(driver);
		manageExpensePage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageExpensePage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageExpensePage.clickOnSignInButton();
		manageExpensePage.clickOnmanageExpenseLink();
		manageExpensePage.clickOnDeleteIcon();
		manageExpensePage.toClickCancelButton();
	    }
	
	
}
