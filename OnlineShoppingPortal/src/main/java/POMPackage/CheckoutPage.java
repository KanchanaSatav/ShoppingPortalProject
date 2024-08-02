package POMPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackage.Flib;
import GenericPackage.IAutoConstants;
import GenericPackage.WebDriverUtility;

public class CheckoutPage {
 
	
	@FindBy(name="billing_address_id") private WebElement  billingAddressDropdown; 
	@FindBy(id="BillingNewAddress_CountryId") private WebElement CountryDropdown;;
	@FindBy(id="BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id="BillingNewAddress_Address1") private WebElement BillingNewAddress1;
	@FindBy(id="BillingNewAddress_Address2") private WebElement BillingNewAddress2;
	@FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement postalcodeTB;
	@FindBy(id="BillingNewAddress_PhoneNumber") private WebElement phoneNumberTB;
	@FindBy(id= "BillingNewAddress_FaxNumber") private WebElement faxNumberTB;
	@FindBy(xpath="//input[@onclick='Billing.save()']") private WebElement continueBilling;
	@FindBy(id="shipping-address-select") private WebElement shippingAddressDropdown;
	@FindBy(xpath="//input[@onclick=\"Shipping.save()\"]") private WebElement continueShipping;
	@FindBy(xpath="//input[@onclick=\"ShippingMethod.save()\"]") private WebElement continueShippingMethod;
	@FindBy(xpath="//input[@onclick=\"PaymentMethod.save()\"]") private WebElement continuePaymentMethod;
	@FindBy(xpath="//input[@onclick=\"PaymentInfo.save()\"]") private WebElement  continuePaymentInfo;
	@FindBy(xpath="//input[@onclick=\"ConfirmOrder.save()\"]") private WebElement continueConfirmOrder;
	@FindBy(xpath="//input[@value=\"Continue\"]") private WebElement continueFinalConfirm;
	
	
	//

	public void setContinueShipping(WebElement continueShipping) {
		this.continueShipping = continueShipping;
	}


	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getBillingAddressDropdown() {
		return billingAddressDropdown;
	}


	public void setBillingAddressDropdown(WebElement billingAddressDropdown) {
		this.billingAddressDropdown = billingAddressDropdown;
	}


	public WebElement getCountryDropdown() {
		return CountryDropdown;
	}


	public WebElement getCityTB() {
		return cityTB;
	}


	public WebElement getBillingNewAddress1() {
		return BillingNewAddress1;
	}


	public WebElement getBillingNewAddress2() {
		return BillingNewAddress2;
	}


	public WebElement getPostalcodeTB() {
		return postalcodeTB;
	}


	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}


	public WebElement getFaxNumberTB() {
		return faxNumberTB;
	}


	public WebElement getContinueBilling() {
		return continueBilling;
	}
	
	public WebElement getContinueShipping() {
		return continueShipping;
	}


	public WebElement getShippingAddressDropdown() {
		return shippingAddressDropdown;
	}


	public WebElement getContinueShippingMethod() {
		return continueShippingMethod;
	}


	public WebElement getContinuePaymentMethod() {
		return continuePaymentMethod;
	}


	public WebElement getContinuePaymentInfo() {
		return continuePaymentInfo;
	}


	public WebElement getContinueConfirmOrder() {
		return continueConfirmOrder;
	}


	public WebElement getContinueFinalConfirm() {
		return continueFinalConfirm;
	}

public void buyProductInCOD() throws IOException, InterruptedException 
{
	WebDriverUtility wdu = new WebDriverUtility();
	 Flib flib = new Flib();
	 
    String address= flib.readExcelData(IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 0); 
    wdu.handledDropdown(billingAddressDropdown, address);
	
	 String  country = flib.readExcelData( IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 1);
	 wdu.handledDropdown(CountryDropdown, "India");
	 
	String city=flib.readExcelData(IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 2);
	cityTB.sendKeys(city);
	
	String address1=flib.readExcelData(IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 3);
	BillingNewAddress1.sendKeys(address1);
	
	String postalCode = flib.readNumericExcelData(IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 4);
	postalcodeTB.sendKeys(postalCode);
	
	int data = flib.getRandomNumber();
	String contact = flib.readNumericExcelData(IAutoConstants.Excel_TEST_PATH, "buyproduct", 1, 5);
	String mobileNO = contact+data;
	phoneNumberTB.sendKeys(mobileNO);
	
	continueBilling.click();
	continueShipping.click();
	continueShippingMethod.click();
	//shippingAddressDropdown.click();
    continuePaymentMethod.click();
    continuePaymentInfo.click();
    continueConfirmOrder.click();
    
    Thread.sleep(2000);
    continueFinalConfirm.click();
    Thread.sleep(5000);

		
}
}

	
	
	
	
	
	
	