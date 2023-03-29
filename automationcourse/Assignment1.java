package com.obsqura.maven.automationcourse;
//program for automate opesmount site
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public WebDriver driver;
public void initializeBrowser() {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","F:\\vini java\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
	driver.get("https://www.flipkart.com/");
}
public void titleCommand() {
	String title=driver.getTitle();
	System.out.println(title);
}
public void urlCommand() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
public void toclose() {
	driver.close();
}
public void toquit() {
	driver.quit();
}

	public static void main(String[] args) {
		Assignment1 one=new Assignment1();
		one.initializeBrowser();
		one.titleCommand();
		one.urlCommand();
		//one.toclose();
		one.toquit();
	}

}
