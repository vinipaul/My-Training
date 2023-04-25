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
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
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
		String expectedBackGroundColor=ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"AdminUsers_page");
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnAdminUsersLink();
		String actualColor=adminUsersPage.togetbackGroundColorofButton();
		assertEquals(actualColor, expectedBackGroundColor,"Reset Button BackGround Color expected to be in "+expectedBackGroundColor+" but found "+actualColor);
	}
	@Test(retryAnalyzer = Retry.class)
	public void verify_searchButton_shows_Corresponding_Result_When_search_an_ExistingUser() throws IOException{
		  adminUsersPage=new AdminUsersPage(driver);
		  String searchUser=ExcelUtility.getString(2,1,constants.Constants.FILEPATH,"AdminUsers_page");
		  adminUsersPage.enterUserName(ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login"))
		  .enterPassword(ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login"))
	      .clickOnSignInButton()
		  .clickOnAdminUsersLink()
		  .clickOnSearchButton()
		  .enterUserNameToSearch(searchUser)
		  .clickOnSearchSubmitButton();
		  assertTrue(adminUsersPage.searchInTheTable(searchUser),searchUser +" is not in the Table");
		  }
	@Test(retryAnalyzer = Retry.class)
	public void verify_Resul_Not_Found_AppearsIn_The_Table_When_search_non_ExistingUser() throws IOException{
		String expectedResult=".........RESULT NOT FOUND.......";
		  adminUsersPage=new AdminUsersPage(driver);
		  String nonExistingUser=FakerUtility.fakeStateName();
		  adminUsersPage.enterUserName(ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login"))
		  .enterPassword(ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login"))
	      .clickOnSignInButton()
		  .clickOnAdminUsersLink()
		  .clickOnSearchButton()
		  .enterUserNameToSearch(nonExistingUser)
		  .clickOnSearchSubmitButton();
		  String actualResult= adminUsersPage.searchNonExistingUser(nonExistingUser);
		  assertEquals(actualResult, expectedResult,"Table Value Is not "+expectedResult);
		  }
}
