package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void clicksearchFeild() throws InterruptedException {
		searchField.click();
		Thread.sleep(3000);

	}

	public void clickSignInFeild() throws InterruptedException {
		signInButton.click();
		Thread.sleep(3000);

	}

}
