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
	 managePagesPage.clickonNewButton();
	 String title=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 String page=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
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
	  managePagesPage.clickOnSearchButton();
	  managePagesPage.toentertitletoSearch(searchTitle);
	  managePagesPage.clickOnListPageSearchButton();
	  boolean actualResult=managePagesPage.toKnowResult();
	  assertEquals(actualResult,expectedResult,"Result found");
	  
}
}
