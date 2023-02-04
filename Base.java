package com.obsqura.maven.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//for any web driver
	//public ChromeDriver driver;//specific for chrome driver
	//method for Initializing chrome browser.
public void initializeBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\vini java\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");//string argument ,webdriver path
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.ae/");//which site to be automated.
}
	public static void main(String[] args) {
		Base baseObj=new Base();
		baseObj.initializeBrowser();

	}

}
