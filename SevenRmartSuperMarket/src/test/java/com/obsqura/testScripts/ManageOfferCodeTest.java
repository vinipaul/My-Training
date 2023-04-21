package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.ManageOfferCodePage;

import utilities.ExcelUtility;

public class ManageOfferCodeTest extends Base {
	public  ManageOfferCodePage manageOfferCodePage;
	@Test(retryAnalyzer = Retry.class)
	@Parameters({"offercode"})
	public void verify_serachingWithOffercode_Shows_Corressponding_Details(String offercode) throws IOException {
		manageOfferCodePage=new ManageOfferCodePage(driver);
		manageOfferCodePage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		.clickOnSignInButton()
		.clickOnManageOfferLink()
		.clickonSearchButton()
		.enterOfferCode(offercode)
		.clickonSearchSubmitButton();
		assertTrue(manageOfferCodePage.searchInTheTable(offercode),"Given OfferCode is not existing");
		}
}
