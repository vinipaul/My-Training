package com.obsqura.maven.Testngnew;

import org.testng.annotations.Test;

public class HomeFromMain extends Base{
	@Test
public void home() {
	MainMenuorMagnave mainmenu=new MainMenuorMagnave(driver);
	mainmenu.mainMenuOrMagnave("Home");
	}
}
