package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageUsersPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
public class ManageUsersTest extends Base{
	ManageUsersPage manageUsersPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_corresponding_UserDetails_shown_When_Search_An_Existing_User() throws IOException {
		manageUsersPage=new ManageUsersPage(driver);
		String username=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"ManageUsers_Page");
		manageUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnManageUsersLink()
		.clickonSearchButton()
		.enterName(username)
		.clickonSearchSubmitButton();
		assertTrue(manageUsersPage.searchInTtheTable(username),"Table does not contain "+username);
	}
}
