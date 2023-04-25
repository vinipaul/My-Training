package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.AdminUsersPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	public AdminUsersPage adminUsersPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_New_AdminUser_Details_Added_In_The_Table_When_SaveButton_Clicked() throws IOException {
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnAdminUsersLink()
		.clickonNewButton();
		String newUserName=FakerUtility.fakeFirstName();
		adminUsersPage.enterNewUserName(newUserName)
		.enterAdminUsersDetails()
		.clickOnSaveButton();
		assertTrue(adminUsersPage.checkInTtheTable(newUserName),"New Admin User Details  Not Added  In The Table");
	}
	@Test(retryAnalyzer = Retry.class)
	public void verify_resetButton_BackgroundColor() throws IOException {
		String expectedBackGroundColor=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"AdminUsers_page");
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnAdminUsersLink();
		String actualColor=adminUsersPage.togetbackGroundColorofButton();
		assertEquals(actualColor, expectedBackGroundColor,"Reset Button BackGround Color expected to be in "+expectedBackGroundColor+" but found "+actualColor);
	}
}
