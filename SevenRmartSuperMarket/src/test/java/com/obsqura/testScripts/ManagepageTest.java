package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.Test;

import com.obsqura.pages.DashBoardPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManagePagesPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagepageTest extends Base {
	public ManagePagesPage managePagesPage;
	public DashBoardPage dashBoardPage;
@Test
public void verify_newButton() throws IOException{
	 managePagesPage=new ManagePagesPage(driver); 
	// dashBoardPage =new DashBoardPage(driver);
	 managePagesPage.enterPassword("admin");
	 managePagesPage.enterUserName("admin");
	 managePagesPage.clickOnSignInButton();
	 driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-page");
	 //dashBoardPage.selectIcon("Manage Pages");
	 assertTrue(PageUtility.isElementEnabled(managePagesPage.newbuttonElement()),"NewButton Is not enabled");
	 managePagesPage.clickonNewButton();
	 String title=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 String page=ExcelUtility.getString(1, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"Home_page");
	 WaitUtility.waitForElement(driver, managePagesPage.titleTextBoxElement());
	 managePagesPage.toEnterTitle(title);
	 WaitUtility.waitForElement(driver, managePagesPage.pageTextBoxElement());
	 managePagesPage.toEnterPage(page);
	 managePagesPage.clickOnSaveButton();
	
}
@Test
public void verify_searchButton(){
	managePagesPage=new ManagePagesPage(driver); 
	  String searchTitle="goodmorning";
	  managePagesPage.enterPassword("admin"); 
	  managePagesPage.enterUserName("admin");
	  managePagesPage.clickOnSignInButton();
	  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-page");
	  managePagesPage.clickOnSearchElement();
	  managePagesPage.toentertitletoSearch(searchTitle);
	  managePagesPage.clickOnListPageSearchButton();
	  
	  
}
}
