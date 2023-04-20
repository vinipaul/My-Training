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
@Test(priority = 1, retryAnalyzer = Retry.class)
public void verify_newButton_allowstoAddPageswith_new_page_and_title() throws IOException{
	 managePagesPage=new ManagePagesPage(driver); 
	 managePagesPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
	 .enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")))
	 .clickOnSignInButton()
	 .clickOnManagePagesLink()
	 .clickonNewButton();
	 String title=FakerUtility.fakeFoodName();
	 String page=FakerUtility.fakeFoodName();
	 managePagesPage.toEnterTitle(title)
	 .toEnterPage(page)
	 .clickOnSaveButton();
	 String actualTitle= managePagesPage.checknewlyAddedPageIntheTable();
	 assertEquals(actualTitle, title,"failed to add");
}
@Test(priority = 2, retryAnalyzer = Retry.class)
public void verify_searchButton_shows_ResultNotFoundWhensearch_NonexistingPage() throws IOException{
	  managePagesPage=new ManagePagesPage(driver); 
	  String searchTitle=FakerUtility.fakeFirstName();
	  managePagesPage.enterUserName(ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login"))
	  .enterPassword(ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login"))
      .clickOnSignInButton()
	  .clickOnManagePagesLink()
	  .clickOnSearchButton()
	  .toentertitletoSearch(searchTitle)
	  .clickOnListPageSearchButton();
	  assertTrue(managePagesPage.toKnowResult(),"Result found");
	  
}
}
