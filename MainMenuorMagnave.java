package com.obsqura.maven.Testngnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainMenuorMagnave extends Base {
	public MainMenuorMagnave(WebDriver driver){
		this.driver=driver;
	}
@Test
public void mainMenuOrMagnave(String input) {
	 List<WebElement> items=driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
	 for(WebElement item:items) {
		 String itemtext=item.getText();
		 if(itemtext.equalsIgnoreCase(input)) {
			 item.click();
			 break;
		 }
	 }
}
}
