package com.obsqura.maven.Testngnew;

import java.util.jar.Attributes.Name;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {

@Test
public void locatebyid() {
	driver.findElement(By.id("glow-ingress-line2"));//Deliver to Dubai line 2
	driver.findElement(By.id("glow-ingress-line1"));//deliver to line 1
	driver.findElement(By.id("nav-link-amazonprime"));//prime
	driver.findElement(By.id("nav-logo-sprites"));//amazon logo
	driver.findElement(By.id("nav-orders"));//Returns and orders line 2
	driver.navigate().to("https://www.noon.com/");
	driver.findElement(By.id("overlay_portal"));
	driver.findElement(By.id("dd_header_signInOrUp"));
	driver.findElement(By.id("btn_logo"));
	driver.findElement(By.id("searchBar"));
	
	
	
}
@Test
public void locatebyclass() {
	driver.findElement(By.className("hm-icon-label"));//All
	
	  driver.findElement(By.className("nav-logo-locale"));//amazon logo .ae
	  driver.findElement(By.className("icp-nav-link-inner"));//uae En with flag
	  //driver.findElement(By.className("skip-link"));//amazon logo
	  driver.findElement(By.className("nav-line-1-container"));//Hello,sign in text
	  driver.findElement(By.className("layoutToolbarPadding"));//Hello sign in whole label
	  driver.navigate().to("https://www.flipkart.com/");
	  driver.findElement(By.className("_3_C9Hx"));//flipkart logo
	  driver.findElement(By.className("exehdJ"));//more
	  driver.findElement(By.className("_3-PJz-"));//become a sellerpo
	  driver.findElement(By.className("_1cmsER"));//search bar
	  //driver.findElement(By.className("go_DOp _2errNR"));//login
	  driver.findElement(By.className("_3SkBxJ"));
	 
}
@Test
public void locatebyname() {
	
		  driver.findElement(By.name("glow-validation-token"));
		  driver.findElement(By.name("google-site-verification"));
		  driver.findElement(By.name("twitter:card"));
		  driver.findElement(By.name("dropdown-selection-ubb"));
		  driver.findElement(By.name("twitter:site:id"));
}
@Test
public void locatebylinktext() {
	
		  driver.findElement(By.linkText("Customer Service"));
		  driver.findElement(By.linkText("Best Sellers"));
		  driver.findElement(By.linkText("Today's Deals"));
		 // driver.findElement(By.linkText("Sports & Outdoors"));//not in first page.thats why its not running
		  
}
@Test
public void bypartiallinktext() {
	
		  driver.findElement(By.partialLinkText("Customer"));
		  driver.findElement(By.partialLinkText("Best"));
		  driver.findElement(By.partialLinkText("Deals"));
		 // driver.findElement(By.tagName("img"));tag name not unique
}
@Test
public void locatebyTag() {
	driver.findElement(By.tagName("img"));//tag name not unique
}
@Test
public void bycssSelector() {
	//tag#id
	driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//css=Tag#id
	driver.findElement(By.cssSelector("a#nav-global-location-popover-link"));
	driver.findElement(By.cssSelector("div#glow-ingress-block"));
	driver.findElement(By.cssSelector("input#glowValidationToken"));
	driver.findElement(By.cssSelector("div#nav-global-location-toaster-script-container"));
	//tag.class
	driver.findElement(By.cssSelector("span.hm-icon-label"));//css=tag.class
	driver.findElement(By.cssSelector("span.nav-logo-locale"));
	driver.findElement(By.cssSelector("div.nav-search-facade"));
	driver.findElement(By.cssSelector("i.nav-icon"));
	driver.findElement(By.cssSelector("div.layoutToolbarPadding"));
	//Tag[attribute]
	driver.findElement(By.cssSelector("div[id=nav-flyout-iss-anchor]"));
	driver.findElement(By.cssSelector("div[id=nav-al-signin]"));
	driver.findElement(By.cssSelector("a[id=nav-logo-sprites]"));//css=Tag[attribute]
	driver.findElement(By.cssSelector("span[class=hm-icon-label]"));
	driver.findElement(By.cssSelector("div[id=nav-xshop]"));
	//tag.class[attribute] combination of 3
	driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=ubbShipTo]"));//tag.class[attribute]
	
}
@Test
public void byXpath() {
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	driver.findElement(By.xpath("//div[@id='nav-global-location-toaster-script-container']"));
	driver.findElement(By.xpath("//div[@id='nav-al-your-account']"));
	driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
	driver.findElement(By.xpath("//input[@id='glowValidationToken']"));
	driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"));
	driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"));
	driver.findElement(By.xpath("//div[@id='nav-belt']"));
	driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
}
@Test
public void dynamic_Locators_ofRelativeXpath() {
	//dynamic Locators with contains
	driver.findElement(By.xpath("//a[contains(@href,'bootstrap-alert')]"));
	driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
	driver.findElement(By.xpath("//label[contains(@for,'inputEmail4')]"));
	driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
	//dynamic Locators with or
	driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
	driver.findElement(By.xpath("//button[@id='button-two' or text()='Get Total']"));
	driver.findElement(By.xpath("//a[@href='ajax-form-submit.php' or text()='Ajax Form Submit']"));
	driver.findElement(By.xpath("//a[@href='check-box-demo.php' or text()='Checkbox Demo']"));
	driver.findElement(By.xpath("//a[@id='progress-bars' or @href='jquery-progress-bar.php' ]"));
	//dynamic Locators with and
	driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Message']"));
	driver.findElement(By.xpath("//input[@id='single-input-field' and @placeholder='Message']"));
	driver.findElement(By.xpath("//button[@id='button-one' and text()='Show Message']"));
	driver.findElement(By.xpath("//a[@href='jquery-select.php' and text()='Jquery Select2']"));
	driver.findElement(By.xpath("//a[@id='list0box' and @class='nav-link']"));
	//dynamic Locators with starts-with
	driver.findElement(By.xpath("//a[starts-with(text(),'Ajax Form ')]"));
	driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
	driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
	driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
	driver.findElement(By.xpath("//button[ starts-with(text(),'Get Total')]"));
}
@Test
public void axesMethodsofRelativeXpath() {
	//parent traversing
	driver.findElement(By.xpath("//button[@data-toggle='collapse']//parent::nav[@class='navbar navbar-expand-md navbar-dark']"));
	driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']"));
	driver.findElement(By.xpath("//div[@id='message-one']//parent::form[@method='POST']"));
	driver.findElement(By.xpath("//label[text()='Enter Message']//parent::div[@class='form-group']"));
	driver.findElement(By.xpath("//input[@id='value-b']//parent::div[@class='form-group']"));
	//child traversing
	driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
	driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
	driver.findElement(By.xpath("//div[@class='form-group']//child::label[text()='Enter value B']"));
	driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@src='images/logo.png']"));
	driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-a']"));
	//following-find element after current node
	driver.findElement(By.xpath("//input[@id='single-input-field']//following::button[@id='button-one']"));
	driver.findElement(By.xpath("//input[@id='value-a']//following::button[@type='button']"));
	driver.findElement(By.xpath("//div[@id='message-one']//following::div[@class='example my-3']"));
	driver.findElement(By.xpath("//label[text()='Enter value B']//following::div[@id='message-two']"));
	driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//following::div[@class='container page']"));
	//preceding-find element before current node
	driver.findElement(By.xpath("//div[@id='message-two']//preceding::button[@id='button-two']"));
	//ancestor-find ancestor of current node
	driver.findElement(By.xpath("//div[@class='form-group']//ancestor::section[@class='clearfix']"));
	driver.findElement(By.xpath("//div[starts-with(@class,'example my-3')]//ancestor::div[starts-with(@class,'col-lg-3')]"));
	driver.findElement(By.xpath("//div[starts-with(@class,'example my-3')]//ancestor::section[starts-with(@class,'clearfix')]"));
	driver.findElement(By.xpath("//ul[starts-with(@class,'list-group list')]//ancestor::div[starts-with(@class,'example')]"));
	driver.findElement(By.xpath("//div[@class='form-group']//ancestor::div[starts-with(@class,'col-lg-9 col-md-9')]"));
	//descendent
	driver.findElement(By.xpath("//button[@id='button-one']//parent::form [@method='POST']//descendant::label"));
	//self
	driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
}
}
