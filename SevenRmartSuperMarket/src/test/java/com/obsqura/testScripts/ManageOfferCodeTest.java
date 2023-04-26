package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.ManageOfferCodePage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class ManageOfferCodeTest extends Base {
	public  ManageOfferCodePage manageOfferCodePage;
	@Test(retryAnalyzer = Retry.class)
	@Parameters({"offercode"})
	public void verify_seraching_With_Existing_Offercode_Shows_Corressponding_Details(String offercode) throws IOException {
		manageOfferCodePage=new ManageOfferCodePage(driver);
		manageOfferCodePage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnManageOfferLink()
		.clickonSearchButton()
		.enterOfferCode(offercode)
		.clickonSearchSubmitButton();
		assertTrue(manageOfferCodePage.searchInTheTable(offercode),"Given OfferCode is not existing");
		}
	@Test(retryAnalyzer = Retry.class)
	@Parameters({"expectedrawCount"})
	public void verify_Number_Of_Available_OfferCodes_InTheTable(int expectedrawCount ) throws IOException {
		manageOfferCodePage=new ManageOfferCodePage(driver);
		manageOfferCodePage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnManageOfferLink();
		int actualrowcount= manageOfferCodePage.toFindcountOfOffercodes();
		assertEquals(expectedrawCount, actualrowcount,"Row count is not "+expectedrawCount);
	}
}
