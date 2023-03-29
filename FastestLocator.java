package com.obsqura.maven.Testngnew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FastestLocator extends Base {
	@Test
	public void byid() {
		driver.findElement(By.id(""));
	}
	@Test
	public void byclassname() {
		driver.findElement(By.className(""));
	}
	@Test
	public void byname() {
		driver.findElement(By.name(""));
	}
	@Test
	public void csstagid() {
		driver.findElement(By.cssSelector(""));
	}
	@Test
	public void csstagclass() {
		driver.findElement(By.cssSelector(""));
	}
	@Test
	public  void bycsstagattribute() {
		driver.findElement(By.cssSelector(""));
	}@Test
	public void csstagclassattribute() {
		driver.findElement(By.cssSelector(""));
	}
	@Test
	public  void bylinktext() {
		driver.findElement(By.linkText(""));
	}
	@Test
	public void bypartiallinktext() {
		driver.findElement(By.partialLinkText(""));
	}
	@Test
	public void byxpath() {
		driver.findElement(By.xpath(""));
	}
	

}
