package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 1)

	public void validateLogoTest() throws InterruptedException {
		homePage.validateLogo();

	}

	@Test(enabled = true, priority = 2)

	public void clickSearchFieldTest() throws InterruptedException {
		homePage.clicksearchFeild();

	}

	@Test(enabled = true, priority = 3)

	public void clickSignInFeildTest() throws InterruptedException {
		homePage.clickSignInFeild();

	}

	@Test(enabled = true, priority = 4)

	public void inputTextOnSearchFeildAndSearchButtonTest() throws InterruptedException {
		homePage.inputTextOnSearchFeildAndSearchButton();

	}
	

}