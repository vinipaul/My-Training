package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageProductPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class ManageProductTest extends Base {
	ManageProductPage manageProductPage;

	@Test(groups = { "Regression" }, retryAnalyzer = Retry.class)
	public void verify_nonVegRadioButtonIsSelectable() throws IOException {
		manageProductPage = new ManageProductPage(driver);
		manageProductPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageProductLink().clickonNewButton();
		boolean isRadioButtonSelected = manageProductPage.nonVegRadioButtonIsSelected();
		assertFalse(isRadioButtonSelected, "Found NonVeg is already selected");
		manageProductPage.clickOnNonvegRadioButton();
		assertTrue(manageProductPage.nonVegRadioButtonIsSelected(), "Failed To select");
	}

	@Test(groups = { "Regression", "Sanity" }, retryAnalyzer = Retry.class)
	public void verify_weightUnitDropdownisWorking() throws IOException {
		String expectedResult = ExcelUtility.getString(0, 0, constants.Constants.FILEPATH, "ManageProduct_Page");
		manageProductPage = new ManageProductPage(driver);
		manageProductPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageProductLink().clickonNewButton().toSelectfromDropDown();
		String actualResult = manageProductPage.getdropdownText();
		assertEquals(actualResult, expectedResult, "Result not " + expectedResult);
	}
}
