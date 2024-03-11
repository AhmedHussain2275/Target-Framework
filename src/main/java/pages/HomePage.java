package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "searchTerm")
	WebElement searchField;

	@FindBy(linkText = "Sign in")
	WebElement signInButton;
	
	@FindBy(css = "a[aria-label='Target home']")
	WebElement logo;
	
	@FindBy(css = "button[aria-label='search']")
	WebElement searchButton;


	public void clicksearchFeild() throws InterruptedException {
		clickElement(searchField);
		pause(4);

	}

	public void clickSignInFeild() throws InterruptedException {
		clickElement(signInButton);
		pause(4);

	}
	
	public void validateLogo() throws InterruptedException{
		clickElement(logo);
		pause(4);
	}
	
	public void inputTextOnSearchFeildAndSearchButton() throws InterruptedException{
		inputText(searchField, "Men's long sleeve shirt");
		pause(4);
		clickElement(searchButton);
		pause(7);
	}

}
