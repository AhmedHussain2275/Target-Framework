package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {

		// this recognize the driver

		System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.target.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
