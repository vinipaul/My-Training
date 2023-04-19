package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtility {
	public static final long IMPLICIT_WAIT = 10;
	public static final long PAGE_LOAD_WAIT = 20;
	public static final long EXPLICIT_WAIT = 50;
	public static final long FLUENT_WAIT=10;
	public static final long POLLING_WAIT=10;

	public static void waitForElement(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(target));
	}

	public static void waitForElementClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void waitForElementClickable(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}

	public static void waitForElementSelected(WebDriver driver, WebElement element) {           
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void waitFortextToBePresentInElement(WebDriver driver,WebElement element,String text) {   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	public static void waitForElementIsPresent(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(target));
	}
	public static void waitForAlterIsPresent(WebDriver driver) { 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public static Alert IsAlterIsPresent(WebDriver driver) { 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void waitForFrameToBeAvailableAndSwitchToIt(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(target));
	}
	public static void waitForInvisibilityOfElementLocated(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(target));
	
	}
	public static void waitForvisibilityOfElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	
	}

	public static void waitForPresenceOfAllElementsLocated(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(target));
	}

	public static void waitForPresenceOfElementsLocatedBy(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(target));
	}

	public static void waitForPresenceOfElementsLocated(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(target));
	}

	public static void waitForTextToBePresentInElementLocated(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(target,null));
	}

	public static void waitForAttributeToBe(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.attributeToBe(target, null, null));
	}
	public static void fluentwaitForElement(WebDriver driver, WebElement target) {
		FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentwait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentwait.ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.visibilityOf(target));
		}
	public static void fluentwaitForElementClickable(WebDriver driver, WebElement target) {
		FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentwait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentwait.ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(target));
	}
	public static void fluentwaitForElementClickable(WebDriver driver, By target) {
		FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentwait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentwait.ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(target));
	}
	public static void fluentwaitForElementSelected(WebDriver driver, By target) {            
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeSelected(target));
	}

	public static void fluentwaitFortextToBePresentInElement(WebDriver driver,By target, String text) {   
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.textToBePresentInElementLocated(target,text));
	}

	public static void fluentwaitForElementIsPresent(WebDriver driver, By target) {
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.presenceOfElementLocated(target));

	}

	public static void fluentwaitForAlterIsPresent(WebDriver driver, By target) {
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.pollingEvery(Duration.ofSeconds(POLLING_WAIT));
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.alertIsPresent());

	}
	public static void pageLoadTimeOutWait(WebDriver driver) {
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_WAIT));
	}
}
