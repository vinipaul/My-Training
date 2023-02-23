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
		 // driver.findElement(By.linkText("Sports & Outdoors"));
		  
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












}
