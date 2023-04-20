package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.pages.AdminUsersPage;
import com.obsqura.pages.DashBoardPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersTest extends Base {
	public AdminUsersPage adminUsersPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_usertypeDropdownBoxIsSelectable() throws IOException {
		String expectedResult=ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"AdminUsers_page");
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnAdminUsersLink()
		.clickonNewButton()
		.toSelectFromDropDown();
		String actualResult=adminUsersPage.dropdownvalue();
		assertTrue(actualResult.contains(expectedResult),expectedResult+" not found in drop down list.");
	}
	@Test(retryAnalyzer = Retry.class)
	public void verify_resetButtonBackgroundColor() throws IOException {
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
