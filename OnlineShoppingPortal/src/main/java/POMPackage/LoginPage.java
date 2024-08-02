package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackage.IAutoConstants;


public class LoginPage implements IAutoConstants {
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotpasswordLink;
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;

	}

	public WebElement getForgotpasswordLink1() {
		return forgotpasswordLink;
	}

	public WebElement getRememberMeCheckBox() {
		return getRememberMeCheckBox();
	}

	public WebElement getloginButton() {
		return getloginButton();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

//Operational Methods
	public void validLogin(String email, String password) {
		emailTextBox.clear();
		emailTextBox.sendKeys(email);

		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);

		loginButton.click();

	}
}
