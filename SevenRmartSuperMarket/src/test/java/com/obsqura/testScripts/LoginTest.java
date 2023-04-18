package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class LoginTest extends Base {
	public LoginPage loginPage;
	@Test(dataProvider = "LoginProvider")
	public void verify_login_with_Credentials(String username,String password) {
		String expectedurl="https://groceryapp.uniqassosiates.com/admin";
		loginPage=new LoginPage(driver);
		assertTrue(loginPage.isUserNameTextBoxDisplayed(),"UserName Field Is Not displayed");
		loginPage.enterUserName(username);
		assertTrue(loginPage.ispasswordTextBoxDisplayed(),"Password Field Is Not Dispalyed");
		loginPage.enterPassword(password);
		assertTrue(loginPage.issignInButtonEnabled(),"Sign in Button is Disabled");
		loginPage.clickOnSignInButton();
		assertEquals(driver.getCurrentUrl(),expectedurl,"Login failed" );
		}
		@DataProvider(name="LoginProvider")
	    public Object[][] getDataFromDataprovider(){
			return new Object[][] 
	    	{
	            {"admin","admin"}
	        };
		}
	@Test
	public void verify_SignIn_Button_Text_AlignmentIsCenter() {
		String expectedTextAlignment="center";
		loginPage=new LoginPage(driver);
		assertTrue(loginPage.issignInButtonDisplayed(), "Sign in BUtton is not Displayed");
		String actualTextAlignment=loginPage.signInButtonTextAlignment();
		assertEquals(expectedTextAlignment,actualTextAlignment,"Alignment is not "+expectedTextAlignment);
		}
	@Test
	public void verify_RememberMeCheckBox_Is_Selected() {
		boolean expectedResult=false;
		loginPage =new LoginPage(driver);
		boolean actualResult=loginPage.isRemembermeCheckboxisSelected();
		assertEquals(actualResult, expectedResult,"Rememeber me checkbox is found "+expectedResult);
	}
}
