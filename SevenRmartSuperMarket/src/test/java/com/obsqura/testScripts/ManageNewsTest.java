package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageNewsPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
import utilities.FakerUtility;
public class ManageNewsTest extends Base {
	ManageNewsPage manageNewsPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_newsField_Is_Editable_when_Edit_Icon_Clicked() throws IOException {
		manageNewsPage=new ManageNewsPage(driver);
		manageNewsPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnManageNewsLink()
		.clickOnEditIcon();
		String news= FakerUtility.fakeCityName();
		manageNewsPage.editNews(news)
		.clickOnUpdateButton();
		assertTrue(manageNewsPage.checkForUpdates(news),"Updation In the Table Failed");
	}
}
