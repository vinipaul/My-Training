package com.obsqura.maven.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public WebDriver driver;
public void initializeBrowser() {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","F://vini java//Automationcourse//src//main//java//Resources//chromedriver.exe");
	driver.get("http://www.opesmount.in/grocerystore1/");
}
public void titleCommand() {
	String title=driver.getTitle();
	System.out.println(title);
}
public void urlCommand() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 one=new Assignment1();
		one.initializeBrowser();
		one.titleCommand();
		
	}

}
