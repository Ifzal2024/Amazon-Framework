package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// We Inspect all the Web Elements

	// WebDriver = Interface, driver= object(Reference variable)
	public WebDriver driver;

	// Parameterized Constructor.
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement logo;

	// If Element cannot be find, throw exception for safety.
	public void clickLogo() throws InterruptedException {
		logo.click();
		// To see if it clicked. Visualize.
		Thread.sleep(5000);
	}

}