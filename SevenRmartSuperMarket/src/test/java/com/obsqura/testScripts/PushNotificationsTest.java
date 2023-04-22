package com.obsqura.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.PushNotificationsPage;

import utilities.ExcelUtility;

public class PushNotificationsTest extends Base {
	PushNotificationsPage pushNotificationsPage;
	@Test(retryAnalyzer = Retry.class)
	public void verify_Send_successfully_AlertMessage_Appears_When_Send_Button_Clicked() throws IOException {
		pushNotificationsPage=new PushNotificationsPage(driver);
		pushNotificationsPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		 .enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
		 .clickOnSignInButton()
		 .clickOnPushNotificationlink()
		 .enterTitle()
		 .enterDescription()
		 .clickOnSendButton();
		assertTrue(pushNotificationsPage.checkForAlertMessage(),"Message Send failed,No Alert Message");
	}
}
