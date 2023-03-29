package facebookloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.obsqura.maven.Testngnew.Base;

public class FacebookSignUpPage extends Base {
	@Test
public void verify_fbSignupPage() {
	String inputEmail="vini";
	String inputPassword="vini";
	WebElement emailTextBoxElement=driver.findElement(By.cssSelector("input#email"));
	emailTextBoxElement.sendKeys(inputEmail);
	WebElement passwordTextBoxElement=driver.findElement(By.cssSelector("input#pass"));
	passwordTextBoxElement.sendKeys(inputPassword);
	WebElement loginButtonElement=driver.findElement(By.cssSelector("button[name=login]"));
	loginButtonElement.click();
	//WebElement createAccountButtonElement=driver.findElement(By.xpath("//div[@class='_6ltg']//a"));
	//createAccountButtonElement.click();
	//WebElement firstNameFromPopup=driver.findElement(By.xpath("//div//input[@placeholder='First name']"));
	//firstNameFromPopup.sendKeys("divyapaul");
}
}
