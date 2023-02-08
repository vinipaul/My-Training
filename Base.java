package com.obsqura.maven.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//for any web driver ,WebDriver is a an Interface.
	//public ChromeDriver driver;//specific for chrome driver
	//method for Initializing chrome browser.
public void initializeBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\vini java\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");//string argument ,webdriver path
	 driver=new ChromeDriver();//casting into 
	 driver.get("https://www.amazon.ae/");//which site to be automated.
}
public void titleCommands() {
	String actualTitle="Welcome to Amazon.ae Shop Online in UAE for Electronics, Apparel, Computers, Grocery & more | Amazon.ae";
	
	String title=driver.getTitle();
	if(actualTitle.equals(title))
	{
		System.out.println("Title is correct");
	}
	else
		System.out.println("Title is not correct");
}
public void getUrlCommand() {
	String url=driver.getCurrentUrl();
	String actualUrl="https://www.amazon.ae/";
	if (actualUrl.equals(url))
	{
		System.out.println("url same");
	}
	else
		System.out.println("url not same");
}
	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
		base.titleCommands();
		base.getUrlCommand();
	}

}
