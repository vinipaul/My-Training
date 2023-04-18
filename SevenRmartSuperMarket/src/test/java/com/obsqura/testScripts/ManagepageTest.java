package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.pages.DashBoardPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManagePagesPage;

import utilities.ExcelUtility;
import utilities.FakerUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagepageTest extends Base {
	ManagePagesPage managePagesPage;
@Test
public void verify_newButton_allowstoAddPageswith_new_page_and_title() throws IOException{
	 managePagesPage=new ManagePagesPage(driver); 
	 managePagesPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.clickOnSignInButton();
	 managePagesPage.clickOnManagePagesLink();
	 assertTrue(managePagesPage.isNewButtonEnabled(),"NewButton Is not enabled");
	 managePagesPage.clickonNewButton();
	 String title=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 String page=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 assertTrue(managePagesPage.isTitleTextBoxDispalyed(), "Title Field is not displayed");
	 managePagesPage.toEnterTitle(title);
	 
	 managePagesPage.toEnterPage(page);
	 managePagesPage.clickOnSaveButton();
}
@Test
public void verify_searchButton_shows_ResultNotFoundWhensearch_NonexistingPage() throws IOException{
	  boolean expectedResult=true;
	  managePagesPage=new ManagePagesPage(driver); 
	  String searchTitle=FakerUtility.fakeFirstName();
	  managePagesPage.enterUserName(ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login"));
	  managePagesPage.enterPassword(ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")); 
	  managePagesPage.clickOnSignInButton();
	  managePagesPage.clickOnManagePagesLink();
	  assertTrue(managePagesPage.isSearchButtonEnabled(),"search button  is disabled");
	  managePagesPage.clickOnSearchButton();
	  assertTrue(managePagesPage.istittleTextBoxDisplayed(),"Title textbox is not displayed");
	  managePagesPage.toentertitletoSearch(searchTitle);
	  assertTrue(managePagesPage.isListPageSearchButtonEnabled(),"Search Button Is disabled");
	  managePagesPage.clickOnListPageSearchButton();
	  boolean actualResult=managePagesPage.toKnowResult();
	  assertEquals(actualResult,expectedResult,"Result found");
	  
}
}
