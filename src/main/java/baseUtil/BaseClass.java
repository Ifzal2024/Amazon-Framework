package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {

	// ChromeDriver is the concrete Class. WebDriver is Interface and can't
	// instantiate by itself.
	// ChromeDriver implements WebDriver behind the library
	// We don't write like this. Instead we define.
	// WebDriver driver = new ChromeDriver();

	// First we Define . So that we can use the object for different browsers
	// multiple times later.
	public WebDriver driver; // related to line 31
	public HomePage homePage; // related to 36

	// Before start a test what need to do?
	@BeforeMethod
	public void setUp() {
		// First Job is to recognize the location of chrome driver from your drive.
		// Right click on Chromedriver.exe ---properties---copy the location and paste
		// below.
		// Set the Location. Which website to Open
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ifzal\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");
		// We instantiated the driver here
		driver = new ChromeDriver();
		// When website opens , maximize window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Asking driver to open this url
		driver.get("https://www.amazon.com/");
		// Give some time to open the url.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Connects with Homepage class.
		homePage = new HomePage(driver);

	}

	// After a test is done, what need to do. Tear up= discard.
	// driver.Quit = Will close all websites/pages
	// driver.close= close current page
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
