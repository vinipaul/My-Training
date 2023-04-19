package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageProductPage;

import utilities.ExcelUtility;
import utilities.PageUtility;

public class ManageProductTest extends Base {
	ManageProductPage manageProductPage;
	@Test (groups = {"Regression"})
	public void verify_nonVegRadioButtonIsSelectable() throws IOException {
		manageProductPage=new ManageProductPage(driver);
	    manageProductPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageProductPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageProductPage.clickOnSignInButton();
		manageProductPage.clickOnManageProductLink();
		manageProductPage.clickonNewButton();
		boolean isRadioButtonSelected=manageProductPage.nonVegRadioButtonIsSelected();
		assertFalse(isRadioButtonSelected,"Found NonVeg is already selected");
		manageProductPage.clickOnNonvegRadioButton();
		assertTrue(manageProductPage.nonVegRadioButtonIsSelected(),"Failed To select");
		}
	@Test(groups = {"Regression","Sanity"})
	public void verify_weightUnitDropdownisWorking() throws IOException {
		String expectedResult=ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"ManageProduct_Page");
		manageProductPage=new ManageProductPage(driver);
	    manageProductPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageProductPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		manageProductPage.clickOnSignInButton();
		manageProductPage.clickOnManageProductLink();
		manageProductPage.clickonNewButton();
		manageProductPage.toSelectfromDropDown();
		String actualResult= manageProductPage.getdropdownText();
		assertEquals(actualResult, expectedResult,"Result not "+expectedResult);
	}
}
