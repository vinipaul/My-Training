package com.obsqura.maven.Testngnew;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShowMessageButtonStyles extends Base  {
	@Test
	public void verify_Font_Weight() {
		String expectedFontWeight="400";
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessagebutton.isEnabled();
		assertTrue(showMessageButtonIsEnabled,"Show Message Button Is not Enabled");
		String actualShowMessageButtonFontWeight=showMessagebutton.getCssValue("font-weight");
		assertEquals(expectedFontWeight,actualShowMessageButtonFontWeight,"Font Weight of show message button is not "+expectedFontWeight);
	}
	@Test
	public void verify_Text_Aalignment() {
		String expectedshowMessageButtonTextAlignment="center";
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessagebutton.isEnabled();
		assertTrue(showMessageButtonIsEnabled,"Show Message Button Is not Enabled");
		String actualShowMessageButtonTextAlignment=showMessagebutton.getCssValue("text-align");
		assertEquals(expectedshowMessageButtonTextAlignment,actualShowMessageButtonTextAlignment,"Show Mesage Button Text Alignment is not"+expectedshowMessageButtonTextAlignment);
	}
	@Test
	public void verify_Font_Color() {
		String expectedshowMessageButtonFontColor="rgba(255, 255, 255, 1)";
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessagebutton.isEnabled();
		assertTrue(showMessageButtonIsEnabled,"Show Message Button Is not Enabled");
		String actualShowMessageButtonFontColor=showMessagebutton.getCssValue("color");
		assertEquals(expectedshowMessageButtonFontColor, actualShowMessageButtonFontColor,"show message button font color is not"+expectedshowMessageButtonFontColor);
	}
	@Test
	public void verify_Button_Shape_Oval() {
		String expectedButtonRadius="4px";
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessagebutton.isEnabled();
		assertTrue(showMessageButtonIsEnabled,"Show Message Button Is not Enabled");
		String buttonBorderRadius=showMessagebutton.getCssValue("border-radius");
		assertEquals(expectedButtonRadius,buttonBorderRadius,"Button border Radius is not"+expectedButtonRadius);
		
	}
	@Test
	public void verify_Line_Height() {
		String expectedShowMessageButtonLineHeight="24px";
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		boolean showMessageButtonIsEnabled=showMessagebutton.isEnabled();
		assertTrue(showMessageButtonIsEnabled,"Show Message Button Is not Enabled");
		String actualShowMessageButtonLineHeight=showMessagebutton.getCssValue("line-height");
		assertEquals(expectedShowMessageButtonLineHeight, actualShowMessageButtonLineHeight,"Show message line height is not"+expectedShowMessageButtonLineHeight);
	}

}
