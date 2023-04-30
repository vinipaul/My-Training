package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageSliderPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class ManageSliderTest extends Base {
	public ManageSliderPage manageSliderPage;

	@Test(retryAnalyzer = Retry.class)
	public void verify_manageSliderLink_navigatedto_ListSliderPage() throws IOException {
		manageSliderPage = new ManageSliderPage(driver);
		String expectedPageHeader = ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "MangeSlider_Page");
		manageSliderPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageSliderLink();
		String actualPageHeader = manageSliderPage.toGetNameOfTheDirectedPage();
		assertEquals(actualPageHeader, expectedPageHeader, "Not navigated to " + expectedPageHeader + " page");
	}

	@Test(retryAnalyzer = Retry.class)
	public void verify_Status_Changed_Successfully_in_The_Table() throws IOException {
		manageSliderPage = new ManageSliderPage(driver);
		manageSliderPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageSliderLink();
		String beforeChange = manageSliderPage.beforeChange();
		String afterChange = manageSliderPage.afterChange();
		assertNotEquals(beforeChange, afterChange, "Status Not Changed");
	}

	@Test(retryAnalyzer = Retry.class)
	public void verify_AlertMessage_Visible_if_chooseFileButton_uploads_imageFilewithLink_when_SaveButton_Clicked()
			throws IOException {
		manageSliderPage = new ManageSliderPage(driver);
		manageSliderPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageSliderLink().clickonNewButton().enterLink().fileUpload();
		assertTrue(manageSliderPage.checkforAlertMessage(), "File not uploaded");
	}
}
