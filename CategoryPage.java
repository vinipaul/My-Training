package com.obsqura.maven.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
	public WebDriver driver;
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	By categoryOptions=By.xpath("//li[@class='list-group-item']//a");
	public void selectCategory(String input) {
		List<WebElement>categories=driver.findElements(categoryOptions);
		for(WebElement category:categories) {
			String categoryText=category.getText();
			if(categoryText.equals(input)) {
				category.click();
				break;
			}
		}
	}
}
