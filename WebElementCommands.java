package com.obsqura.maven.Testngnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test
	public void sendkeymethod() {
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iphone14");
		searchbar.clear();
		searchbar.sendKeys("iphone14");
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
	}
	
	


}
