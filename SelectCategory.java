package com.obsqura.maven.Testngnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectCategory extends Base {
	public SelectCategory(WebDriver driver){
		this.driver=driver;
	}
	@Test
	public void selectCatogory(String inputitem) {
	List <WebElement> categories= driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
	for(WebElement category:categories) {
		String categoryName=category.getText();
		if(categoryName.equals(inputitem)) {
			category.click();
			break;
		}
	}
}
}
