package com.obsqura.testScripts;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageLocationPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageLocationTest  extends Base{
	public ManageLocationPage manageLocationPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_Location_Added_in_the_Table_when_save_button_clicked() throws IOException {
		manageLocationPage=new  ManageLocationPage(driver);
		manageLocationPage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnManageLocationLink()
		.clickonNewButton()
		.selectCountry()
		.selectState();
		String location=FakerUtility.fakeCityName();
		manageLocationPage.enterLocation(location)
		.enterDeliveryCharge()
		.clickonSaveButton();
		assertTrue(manageLocationPage.checkInTheTable(location),"Location not Entered in the table");
		}
}