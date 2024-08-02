package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Deceleration
	
 @FindBy(linkText="Register") private WebElement registerlink;
 @FindBy(linkText="Log in") private WebElement loginLink;
 @FindBy(xpath="//span[text()='Shopping cart']") private WebElement shoppingcartLink;
 @FindBy(xpath="//span[text()='Wishlist']") private WebElement WishListLink;
 @FindBy(partialLinkText="BOOKS") private WebElement booksLink;
 @FindBy(partialLinkText= "COMPUTERS") private WebElement computerLink;
 @FindBy(partialLinkText= "ELECTRONIC") private WebElement electronicLink;
 @FindBy(partialLinkText= "APPARELL & SHOES") private WebElement apparelAandshoesLink;
 @FindBy(partialLinkText="DIGITAL DOWNLOADS") private WebElement digitaldownloadsLinks;
 @FindBy(partialLinkText="JEWELLARY")  private WebElement jewellaryLink;
 @FindBy(partialLinkText = "GIFT CARDS") private WebElement  giftcardsLink;
 @FindBy(partialLinkText = "small-searchterms") private WebElement searchBox;
 @FindBy(xpath="//input[@value='Search']") private WebElement searchButton;
 
 //Initialization
    public WelcomePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 
 //Utilization
 
public WebElement getRegisterlink() {
	return registerlink;
}
public WebElement getLoginLink() {
	return loginLink;
}
public WebElement getShoppingcartLink() {
	return shoppingcartLink;
}
public WebElement getWishListLink() {
	return WishListLink;
}
public WebElement getBooksLink() {
	return booksLink;
}
public WebElement getComputerLink() {
	return computerLink;
}
public WebElement getElectronicLink() {
	return electronicLink;
}
public WebElement getApparelAandshoesLink() {
	return apparelAandshoesLink;
}
public WebElement getDigitaldownloadsLinks() {
	return digitaldownloadsLinks;
}
public WebElement getJewellaryLink() {
	return jewellaryLink;
}
public WebElement getGiftcardsLink() {
	return giftcardsLink;
}
public WebElement getSearchBox() {
	return searchBox;
}
public WebElement getSearchButton() {
	return searchButton;
}
 
}
