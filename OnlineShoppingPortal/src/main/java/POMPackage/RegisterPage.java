package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
 //@FindBy(id="gender-male") private WebElement maleRadioButton;
//@FindBy(id="gender-female") private WebElement femaleRadioButton;
//@FindBy(id="FirstName") private WebElement firstnameTB;
//@FindBy(id="LastName") private WebElement lastnameTB;
//@FindBy(id="Email") private WebElement emailTB;
//@FindBy(id="Password") private WebElement passwordTB;
//@FindBy(id="ConfirmPassword") private WebElement confirmpasswordTB;
//@FindBy(id="register-button") private WebElement registerButton;
//private WebElement lastNameTB;
//private WebElement firstNameTB;

//public RegisterPage(WebDriver driver)
//{
  //PageFactory.initElements(driver, this);
//}

//public WebElement getMaleRadioButton() {
	//return maleRadioButton;
//}

//public WebElement getFemaleRadioButton() {
	//return femaleRadioButton;
//}

//public WebElement getFirstnameTB() {
	//return firstnameTB;
//}

//public WebElement getLastnameTB1() {
//	return lastnameTB;
//}

//public WebElement getEmailTB() {
	//return emailTB;
//}

//public WebElement getPasswordTB() {
	//return passwordTB;
//}

//public WebElement getConfirmpasswordTB() {
	//return confirmpasswordTB;
//}

//public WebElement getRegisterButton() {
	//return registerButton;
//}

//public void registerUser(String fn, String ln, String email, String pwd)
//{
	//maleRadioButton.click();
	//firstNameTB.clear();
	//firstNameTB.sendKeys(fn);
	
	//lastNameTB.clear();
	//lastNameTB.sendKeys(ln);
	
	//emailTB.clear();
	//emailTB.sendKeys(email);
	
	//passwordTB.clear();
	//passwordTB.sendKeys(pwd);
	
	//confirmpasswordTB.clear();
	//confirmpasswordTB.sendKeys(pwd);
	
	//registerButton.click();
	
//}
//}
	
	@FindBy(id = "gender-male") 
    private WebElement maleRadioButton;
    
    @FindBy(id = "gender-female") 
    private WebElement femaleRadioButton;
    
    @FindBy(id = "FirstName") 
    private WebElement firstnameTB;
    
    @FindBy(id = "LastName") 
    private WebElement lastnameTB;
    
    @FindBy(id = "Email") 
    private WebElement emailTB;
    
    @FindBy(id = "Password") 
    private WebElement passwordTB;
    
    @FindBy(id = "ConfirmPassword") 
    private WebElement confirmpasswordTB;
    
    @FindBy(id = "register-button") 
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getMaleRadioButton() {
        return maleRadioButton;
    }

    public WebElement getFemaleRadioButton() {
        return femaleRadioButton;
    }

    public WebElement getFirstnameTB() {
        return firstnameTB;
    }

    public WebElement getLastnameTB() {
        return lastnameTB;
    }

    public WebElement getEmailTB() {
        return emailTB;
    }

    public WebElement getPasswordTB() {
        return passwordTB;
    }

    public WebElement getConfirmpasswordTB() {
        return confirmpasswordTB;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public void registerUser(String fn, String ln, String email, String pwd) {
        maleRadioButton.click();
        firstnameTB.clear();
        firstnameTB.sendKeys(fn);

        lastnameTB.clear();
        lastnameTB.sendKeys(ln);

        emailTB.clear();
        emailTB.sendKeys(email);

        passwordTB.clear();
        passwordTB.sendKeys(pwd);

        confirmpasswordTB.clear();
        confirmpasswordTB.sendKeys(pwd);

        registerButton.click();
    }
}