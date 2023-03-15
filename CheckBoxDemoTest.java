package com.obsqura.maven.testscripts;

import org.testng.annotations.Test;

import com.obsqura.maven.pages.CategoryPage;
import com.obsqura.maven.pages.CheckBoxDemoPage;

public class CheckBoxDemoTest extends Base{
	CategoryPage categorypage;
@Test
public void verify_SingleInputCheckBox() {
	CheckBoxDemoPage checkBoxDemo=new CheckBoxDemoPage(driver);
	categorypage=new CategoryPage(driver);
	categorypage.selectCategory("Checkbox Demo");
	checkBoxDemo.selectSingleInputCheckBox();
}
}
