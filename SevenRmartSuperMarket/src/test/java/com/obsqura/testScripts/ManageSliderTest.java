package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageSliderPage;

import utilities.ExcelUtility;

public class ManageSliderTest  extends Base{
	public ManageSliderPage manageSliderPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_manageSliderLink_navigatedto_ListSliderPage() throws IOException {
		manageSliderPage=new ManageSliderPage(driver);
		String expectedPageHeader=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"MangeSlider_Page");
		manageSliderPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnManageSliderLink();
		String actualPageHeader= manageSliderPage.toGetNameOfTheDirectedPage();
		assertEquals(actualPageHeader,expectedPageHeader,"Not navigated to "+expectedPageHeader+" page");
	}
	@Test(retryAnalyzer = Retry.class)
	public void verify_StatusChanged_Successfully_in_The_Table() throws IOException {
		manageSliderPage=new ManageSliderPage(driver);
		manageSliderPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
	    .clickOnManageSliderLink();
	    String beforeChange= manageSliderPage.beforeChange();
	    String afterChange=manageSliderPage.afterChange();
		assertNotEquals(beforeChange,afterChange,"Status Not Changed");
	}
}
