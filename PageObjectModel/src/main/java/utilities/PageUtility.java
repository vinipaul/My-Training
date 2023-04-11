package utilities;

import java.util.ArrayList;
import java.util.List;

//import org.apache.poi.hssf.eventusermodel.dummyrecord.MissingCellDummyRecord;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.css.ElementCSSInlineStyle;

public class PageUtility  {
	public static void clickOnElement(WebElement element) {
		element.click();
		}
		public boolean isDisplay(WebElement element) {
			boolean status = element.isDisplayed();
			return status;
		}
		public static WebElement enterText(WebElement element, String value) {
		element.sendKeys(value);
		return element;
		}
		public static void sendKey(WebElement element, String s) {
			element.sendKeys(s);
		}
		public boolean isEnabled(WebElement element) {//my contribution
			boolean status= element.isEnabled();
			return status;
		}
		public static String getElementText(WebElement element) {
		return element.getText();
		}
		public static void single_click(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).click().perform();
		}
		public static void mouse_hover(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).build().perform();
		}
		public static void right_click(WebElement element,WebDriver driver) {
			Actions actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		public static void double_click(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		public static void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
		}
		public static void dragand_drop(WebDriver driver,WebElement sourceElement,WebElement destinationElement) {
			Actions actions=new Actions(driver);
			actions.dragAndDrop(sourceElement, destinationElement).build().perform();
			//action.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
		}
		public static void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		}
		public static void selectDropdownbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		}
		public static void clearText(WebElement element) {//my contribution
			element.clear();
		}
		public static String getTagNameofElement(WebElement element) { //my contribution
			String tagName=element.getTagName();
			return tagName;
		}
		public static String getAttributeofElement(WebElement element,String attribute) {//my contribution
			String attributeValue=element.getAttribute(attribute);
			return attributeValue;
		}
		public static String getcssValueofElement(WebElement element,String cssProperty) {//my contribution
			String cssPropertyValue=element.getCssValue(cssProperty);
			return cssPropertyValue;
		}
		public static Point getLocationOfElement(WebElement element) {//my contribution
			Point location=element.getLocation();
			return location;
		}
		public static Dimension getSizeofElement(WebElement element) {//my contribution
		Dimension size=element.getSize();
		return size;
		}
		public static WebElement enterIntValue(WebElement element, CharSequence[] value) {
		element.sendKeys(value);
		return element;
		}
		public static Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
		}
		public static void ScrollBy(WebDriver driver) {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,2500)");
		}
		public static void stopPageRefresh(WebDriver driver) {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.stop();");
		}
		public String getToolTip(WebElement element) {
			return element.getAttribute("title");
		}
		public void getClickElement(WebElement element) {
			element.click();
		}
		public void mediumDelay(int x) throws InterruptedException {
			Thread.sleep(x);
		}
		public void selectFuncbyindex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void selectFuncbyValue(WebElement element, String value) {
			Select select1 = new Select(element);
			select1.selectByValue(value);
		}
		public String selectFuncbyVisibletext(WebElement element, String visibletext) {
			Select select = new Select(element);
			select.selectByVisibleText(visibletext);
			WebElement selectedValue = select.getFirstSelectedOption();
			return (selectedValue.getText());
		}
		public String FirstSelectedOption(WebElement element) {
			Select select1 = new Select(element);
			String firstoption = select1.getFirstSelectedOption().getText();
			return (firstoption);
		}
		public List<WebElement> getAllOptions(Select s) {
			List<WebElement> op = s.getOptions();
			return op;
		}
		public List<String> convertToStringList(List<WebElement> weList) {
			List<String> strList = new ArrayList<String>();
			for (int i = 0; i < weList.size(); i++) {
				strList.add(weList.get(i).getText());
			}
			return strList;
		}
		public String stylePropertyValidation(WebElement element, String propertyType) {
			return element.getCssValue(propertyType);
		}
		public boolean isSelected(WebElement element) {
			return element.isSelected();
		}

		public List<String> addList(List<String>list,String s) {
			list.add(s);
			return list;
		}
		public void alertHandlingaccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		}
		public String alerttext(WebDriver driver) {
			return (driver.switchTo().alert().getText());
		}	
			
		public boolean getElementTextList(List<WebElement> chkList, String element) {
		boolean value = true;
		for (int i = 0; i < chkList.size(); i++) {
		String text = chkList.get(i).getText();
		if (!text.equals(element)){
			value = false;
			}
		}
		return value;
		}
		public boolean compareLists(List<String> actuallist, List<String> expectedlist) {
		boolean value = true;
		for (int i = 0; i < actuallist.size(); i++) {
		if (!actuallist.get(i).equals(expectedlist.get(i))) {
			value = false;
			}
			}
		return value;
		}
		public void managSliderList(List<WebElement> actuallist, List<WebElement> element) {
		for (int i = 0; i < actuallist.size(); i++) {
			String text = actuallist.get(i).getText();
			if (!text.equals(element)) {
			break;
			}
			}
		}
}
