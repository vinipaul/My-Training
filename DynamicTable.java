package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicTable extends Base {
	MainMenuorMagnave mainmenu;
	@Test
	public void fetch_dynamicTableValues() {
		ArrayList <String> expectedList=new ArrayList<String>();
		expectedList.add("Name");
		expectedList.add("Position");
		expectedList.add("Office");
		expectedList.add("Age" );
		expectedList.add("Start date");
		expectedList.add("Salary");
		mainmenu=new MainMenuorMagnave(driver);
		mainmenu.mainMenuOrMagnave("Table");
		List<WebElement> headings=driver.findElements(By.xpath("//tr[@role='row']//child::th"));
		ArrayList<String> actualitems=new ArrayList<String>();
		for(WebElement header:headings) {
			String headerText=header.getText();
			actualitems.add(headerText);
		}
		System.out.println(actualitems);
		assertEquals(expectedList,actualitems,"Headers is not same");
	}
@Test
public void verify_rowcount() {
	int expectedRowCount=10;
	mainmenu=new MainMenuorMagnave(driver);
	mainmenu.mainMenuOrMagnave("Table");
	List<WebElement> rowsinTable= driver.findElements(By.xpath("//td[text()='Tiger Nixon']//ancestor::tbody//child::tr"));
	int actualrowcount= rowsinTable.size();
	System.out.println("Table contains "+actualrowcount+" rows");
	assertEquals(expectedRowCount, actualrowcount,"Row count is not "+expectedRowCount);
}
@Test 
public void verify_tableContent() {
	mainmenu=new MainMenuorMagnave(driver);
	mainmenu.mainMenuOrMagnave("Table");
	List <WebElement> itemsinthetable=driver.findElements(By.xpath("//table[@id='dtBasicExample']//td")); 
	ArrayList list=new ArrayList();
	for(WebElement singlitem:itemsinthetable) {
		list.add( singlitem.getText());
		  }
	System.out.println(list);
	System.out.println("Table consists of "+list.size()+" items");
}
@Test
public  void verify_tablefilter() {
	String search="Ashton Cox";
	mainmenu=new MainMenuorMagnave(driver);
	mainmenu.mainMenuOrMagnave("Table");
    List<WebElement> items=driver.findElements(By.xpath("//ul[starts-with(@class,'list-group')]//li[@class='list-group-item']//a"));
	for(WebElement item:items) {
		String itemtext=item.getText();
		if( itemtext .equals("Table Filter")) {
			item.click();
			break;
		}
	}
	  WebElement searchboxElement=driver.findElement(By.cssSelector("input[type=search]"));
	  boolean issearchboxElementdisplayed=searchboxElement.isDisplayed();
	  assertTrue(issearchboxElementdisplayed,"search box  is not displayed");
	  searchboxElement.sendKeys(search); 
	  List <WebElement> tablebody=driver.findElements(By.xpath("//tr[@class='odd']//child::td"));
	  ArrayList findList=new ArrayList();
	  for(WebElement tableRaw:tablebody) {
		 String tableRawText= tableRaw.getText();
		 findList.add(tableRawText);
		 }
	  assertTrue(findList.contains(search),"No item in the table like "+search);
	  System.out.println("Table content related to "+search+" as "+findList);
	
		  
	  
	}	
}

