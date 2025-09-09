package ritikYadav.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputUsername")
	WebElement username;

	@FindBy(name = "inputPassword")
	WebElement passwordEle;

	@FindBy(xpath = "//p[@class='infoMsg']")
	WebElement infoMessage;

	@FindBy(xpath = "//input[@name='chkboxTwo']")
	WebElement checkbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signInButton;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//button[@class='go-to-login-btn']")
	WebElement goToLoginBtn;
	
	By resetbutton=By.xpath("//button[@class='reset-pwd-btn']");

	public void land() {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

	public void loginApplication(String email, String password) {
		username.sendKeys(email);
		passwordEle.sendKeys(password);
	}

	public void selectCheckbox() {
		checkbox.click();
	}

	public void clickSignIn() {
		signInButton.click();
	}

	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
	
	public void clickResetButton() {
	    clickElementWhenClickable(resetbutton); // this method will be from AbstractComponents
	}

	public String getMessage() {
	    return infoMessage.getText();
	}


	public void clickToLogin() {
		goToLoginBtn.click();
	}
	public void loginApplicationagain(String email, String password) {
		username.sendKeys(email);
		passwordEle.sendKeys(password);
	}
	
}
