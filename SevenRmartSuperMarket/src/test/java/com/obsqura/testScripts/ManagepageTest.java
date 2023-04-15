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
	public ManagePagesPage managePagesPage;
	public DashBoardPage dashBoardPage;
@Test
public void verify_newButton_allowstoAddPageswth_page_and_title() throws IOException{
	 managePagesPage=new ManagePagesPage(driver); 
	// dashBoardPage =new DashBoardPage(driver);
	 managePagesPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.clickOnSignInButton();
	 driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-page");
	 //dashBoardPage.selectIcon("Manage Pages");
	 assertTrue(PageUtility.isElementEnabled(managePagesPage.newbuttonElement()),"NewButton Is not enabled");
	 managePagesPage.clickonNewButton();
	 String title="o";//ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 String page="o";//ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 WaitUtility.waitForElement(driver, managePagesPage.titleTextBoxElement());
	 managePagesPage.toEnterTitle(title);
	 WaitUtility.waitForElement(driver, managePagesPage.pageTextBoxElement());
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
	  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-page");
	  managePagesPage.clickOnSearchElement();
	  managePagesPage.toentertitletoSearch(searchTitle);
	  managePagesPage.clickOnListPageSearchButton();
	  boolean actualResult=managePagesPage.toKnowResult();
	 assertEquals(actualResult,expectedResult,"Result found");
	  
}
@Test
public void  verify_chooseFileButtonoploadsImage() throws IOException{
	 managePagesPage=new ManagePagesPage(driver); 
	 managePagesPage.enterUserName((ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.enterPassword((ExcelUtility.getString(1, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login")));
	 managePagesPage.clickOnSignInButton();
	 driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
	 managePagesPage.clickonchooseFileButton();
	 Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3.projecttestcasepicture.exe"); 
	 boolean isImagePresent= managePagesPage.toknowImageIsPresent();
}
}
