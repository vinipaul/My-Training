package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManageDeliveryBoyPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base {
	ManageDeliveryBoyPage manageDeliveryBoyPage;

	@Test(retryAnalyzer = Retry.class)
	public void verify_password_shown_under_The_Table_Raw_when_passwordIcon_Clicked() throws IOException {
		manageDeliveryBoyPage = new ManageDeliveryBoyPage(driver);
		manageDeliveryBoyPage.enterUserName((ExcelUtility.getString(1, 0, constants.Constants.FILEPATH, "login")))
				.enterPassword((ExcelUtility.getString(1, 1, constants.Constants.FILEPATH, "login")))
				.clickOnSignInButton().clickOnManageDeliveryBoy().clickOnPasswordIcon();
		assertTrue(manageDeliveryBoyPage.isPasswordRawPresent(), "Password does not shown under the Table raw");
	}
}
