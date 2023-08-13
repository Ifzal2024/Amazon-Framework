package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

// Connects inherits  with BaseClass
public class HomePageTest extends BaseClass {

	@Test

	public void clickLogoTest() throws InterruptedException {

		homePage.clickLogo();
	}

}
