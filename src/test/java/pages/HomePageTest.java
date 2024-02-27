package pages;


import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	
	@Test(enabled = true,priority = 2)
	
	public void clickSearchFieldTest() throws InterruptedException {
		homePage.clicksearchFeild();
		
	}
	
	@Test(enabled = true,priority = 1)
	
	public void clickSignInFeildTest() throws InterruptedException {
		homePage.clickSignInFeild();
		
	}

}