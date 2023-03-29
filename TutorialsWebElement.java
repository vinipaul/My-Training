package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TutorialsWebElement extends Base {
@Test
public void commands() {
	WebElement textbox1=driver.findElement(By.name("firstname"));
	textbox1.sendKeys("vini");
	WebElement textbox2=driver.findElement(By.name("lastname"));
	textbox2.sendKeys("paul");
	textbox1.clear();
	textbox2.clear();
	WebElement button=driver.findElement(By.cssSelector("button[name=submit]"));
	button.submit();
}

}
