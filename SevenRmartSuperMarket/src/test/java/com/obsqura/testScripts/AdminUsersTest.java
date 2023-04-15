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
	public DashBoardPage dashBoardPage;
	@Test
	public void verify_usertypeDropdownBoxISelectable() throws IOException {
		String expectedResult="Partner";
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		adminUsersPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	    adminUsersPage.clickOnSignInButton();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-admin");
		assertTrue(PageUtility.isElementEnabled(adminUsersPage.newButtonElement()),"NewButton Is not enabled");
		adminUsersPage.clickonNewButton();
		WaitUtility.waitForElement(driver, adminUsersPage.usertypeDropdown());
		adminUsersPage.toSelectFromDropDown();
		String actualResult=adminUsersPage.dropdownvalue();
		assertTrue(actualResult.contains(expectedResult),expectedResult+" not found");
	}
	@Test
	public void verify_resetButtonBackgroundColor() throws IOException {
		String expectedBackGroundColor="rgba(255, 193, 7, 1)";
		adminUsersPage=new AdminUsersPage(driver);
		adminUsersPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
		adminUsersPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	    adminUsersPage.clickOnSignInButton();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-admin");
		assertTrue(PageUtility.isElementDisplayed(adminUsersPage.resetButtonElement()),"Reset Button Is not displayed");
		String actualColor=adminUsersPage.togetbackGroundColorofButton();
		assertEquals(actualColor, expectedBackGroundColor,"BackGround Color is not "+expectedBackGroundColor);
		
	}
}
