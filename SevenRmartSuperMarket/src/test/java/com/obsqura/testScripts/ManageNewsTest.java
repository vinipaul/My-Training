package com.obsqura.testScripts;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageNewsPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageNewsTest extends Base {
	ManageNewsPage manageNewsPage;

	@Test(groups = { "Regression" }, retryAnalyzer = Retry.class)
	public void verify_newsField_Is_Editable_when_Edit_Icon_Clicked() throws IOException {
		manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageNewsLink().clickOnEditIcon();
		String news = FakerUtility.fakeCityName();
		manageNewsPage.editNews(news).clickOnUpdateButton();
		assertTrue(manageNewsPage.checkForUpdates(news), "Updation In the Table Failed");
	}

	@Test(groups = { "Regression" }, retryAnalyzer = Retry.class)
	public void verify_New_News_Entered_susccessfully_In_The_Table_When_SaveButton_Clicked() throws IOException {
		manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageNewsLink().clickOnNewButton();
		String news = FakerUtility.fakeCountryName();
		manageNewsPage.enterNews(news).clickOnSaveButton();
		assertTrue(manageNewsPage.searchInTheTable(news), "New News entered failed and no successalert message");
	}

	@Test(retryAnalyzer = Retry.class)
	public void verify_searchButton_shows_ResultNotFound_When_Search_Non_ExistingNews() throws IOException {
		manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.enterUserName(ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login"))
				.enterPassword(ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login"))
				.clickOnSignInButton().clickOnManageNewsLink().clickOnSearchButton();
		String nonexistingnews = FakerUtility.fakeFirstName();
		manageNewsPage.enterNewstoSearch(nonexistingnews).clickOnSearchSubmitButton();
		assertFalse(manageNewsPage.toKnowResult(nonexistingnews), "Result found");
	}

	@Test(retryAnalyzer = Retry.class)
	public void verify_searchButton_shows_Corresponding_Result_When_search_an_ExistingNews() throws IOException {
		manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.enterUserName(ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login"))
				.enterPassword(ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login"))
				.clickOnSignInButton().clickOnManageNewsLink().clickOnSearchButton();
		String existingnews = ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "ManageNews_Page");
		manageNewsPage.enterNewstoSearch(existingnews).clickOnSearchSubmitButton();
		assertTrue(manageNewsPage.toKnowResult(existingnews), "Result found");
	}
}
