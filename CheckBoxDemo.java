package com.obsqura.maven.Testngnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base {
	@Test
	public void checkBoxDemo() {
	String input="Checkbox Demo"; 
	SelectCategory selectcategory=new SelectCategory(driver);
	selectcategory.selectCatogory(input);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-check-input']")));
	WebElement checkBoxElement=driver.findElement(By.xpath("//input[@class='form-check-input']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkBoxElement));
	checkBoxElement.click();
	
	}
	@Test
	public void multipleCheckBoxSelection() {
		String input="Checkbox Demo"; 
		SelectCategory selectcategory=new SelectCategory(driver);
		selectcategory.selectCatogory(input);
		WebElement checkBoxOne=driver.findElement(By.cssSelector("input#check-box-one"));
		checkBoxOne.click();
		WebElement checkBoxTwo=driver.findElement(By.cssSelector("input#check-box-two"));
		checkBoxTwo.click();
		WebElement selectAllButton=driver.findElement(By.cssSelector("input#button-two"));
		selectAllButton.click();
	}
}
