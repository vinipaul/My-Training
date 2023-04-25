package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.ManagePaymentMethodsPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManagePaymentMethodTest  extends Base{
	ManagePaymentMethodsPage managePaymentMethodPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_newsField_Is_Editable_when_Edit_Icon_Clicked() throws IOException {
		managePaymentMethodPage=new ManagePaymentMethodsPage(driver);
		managePaymentMethodPage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnManagePaymentMethods()
		.clickOnEditIcon();
		String title=(ExcelUtility.getString(2, 0,constants.Constants.FILEPATH,"PaymentMethods_Page"));
		String paymentLimit=FakerUtility.fakeNumber().toString();
		managePaymentMethodPage.editPaymentMethods(title,paymentLimit)
		.clickOnUpdateButton();
		assertTrue(managePaymentMethodPage.checkForUpdatesInTheTable(title,paymentLimit),"Updation In the Table Failed");
	}
}
