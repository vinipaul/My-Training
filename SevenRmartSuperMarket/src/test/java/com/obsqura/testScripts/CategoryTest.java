package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.CategoryPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class CategoryTest extends Base {
	public CategoryPage categoryPage;

	@Test(retryAnalyzer = Retry.class)
	public void verify_Countof_Available_Categories_InTheTable() throws IOException {
		String actualCount, expectedCount;
		categoryPage = new CategoryPage(driver);
		categoryPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnCategory();
		actualCount = categoryPage.findcountOfCategories();
		categoryPage.clickOnHomeLink();
		expectedCount = categoryPage.findHomeCategoryCount();
		assertEquals(expectedCount, actualCount, "Count Of Available Categories is not " + expectedCount);
	}
}
