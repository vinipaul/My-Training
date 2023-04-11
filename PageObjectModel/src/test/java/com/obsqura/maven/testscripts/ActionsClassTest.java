package com.obsqura.maven.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.obsqura.maven.pages.ActionsClassPage;
import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.MagnaveBarPage;

public class ActionsClassTest extends Base{
	CategoryPage categoryPage;
	ActionsClassPage actionsClassPage;
	MagnaveBarPage magnaveBarPage;
	@Test
	public void verify_single_click_onShowMessageButton() {
		//String message="car";
		categoryPage=new CategoryPage(driver);
		actionsClassPage=new ActionsClassPage(driver);
		categoryPage.selectCategory("Simple Form Demo");
		//actionsClassPage.enterDataInTextBox(message);
		actionsClassPage.showMessageButton_singleClick();
	}
	@Test
public void verify_mouse_hover_on_SimpleformdemoLink() {
	categoryPage=new CategoryPage(driver);
	actionsClassPage=new ActionsClassPage(driver);
	actionsClassPage.simpleformdemolink_mouseHover();
}
	@Test
	public void verify_doubleclick_onCheckboxSelectAllButton() {
		categoryPage=new CategoryPage(driver);
		actionsClassPage=new ActionsClassPage(driver);
		categoryPage.selectCategory("Checkbox Demo");
		actionsClassPage.doubleclick_onCheckboxSelectAllButton();
	}
	@Test
	public void verify_rightClickon_checkboxSelectAllButton() {
		categoryPage =new CategoryPage(driver);
		categoryPage.selectCategory("Checkbox Demo");
		actionsClassPage=new ActionsClassPage(driver);
		actionsClassPage.rightClickon_checkboxSelectAllButton();
	}
	@Test
	public void verify_clickandHoldOn_checkboxSelectAllButton() {
		categoryPage =new CategoryPage(driver);
		categoryPage.selectCategory("Checkbox Demo");
		actionsClassPage=new ActionsClassPage(driver);
		actionsClassPage.clickandHoldOn_checkboxSelectAllButton();
	}
	@Test
	public void verify_draganddropfieldinOthersofMagnaveBar() {
		magnaveBarPage=new MagnaveBarPage(driver);
		magnaveBarPage.mainMenuOrMagnave("others");
		actionsClassPage=new ActionsClassPage(driver);
		actionsClassPage.draganddropfieldinOthersofMagnaveBar();
	}
}
