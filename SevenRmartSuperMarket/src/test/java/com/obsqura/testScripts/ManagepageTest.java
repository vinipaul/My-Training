package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.obsqura.pages.ManagePagesPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

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
	 String title=FakerUtility.fakeFoodName();
	 String page=FakerUtility.fakeFoodName();
	 managePagesPage.toEnterTitle(title);
	 managePagesPage.toEnterPage(page);
	 managePagesPage.clickOnSaveButton();
	 String actualTitle= managePagesPage.checknewlyAddedPageIntheTable();
	 assertEquals(actualTitle, title,"Added successfully");
}
@Test
public void verify_searchButton_shows_ResultNotFoundWhensearch_NonexistingPage() throws IOException{
	  managePagesPage=new ManagePagesPage(driver); 
	  String searchTitle=FakerUtility.fakeFirstName();
	  managePagesPage.enterUserName(ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login"));
	  managePagesPage.enterPassword(ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")); 
	  managePagesPage.clickOnSignInButton();
	  managePagesPage.clickOnManagePagesLink();
	  managePagesPage.clickOnSearchButton();
	  managePagesPage.toentertitletoSearch(searchTitle);
	  managePagesPage.clickOnListPageSearchButton();
	  assertTrue(managePagesPage.toKnowResult(),"Result found");
	  
}
}
