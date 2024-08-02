package TestPackage;

import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import POMPackage.ElectronicPage;
import POMPackage.WelcomePage;

public class AddToCartTestCase  extends BaseClass{
	@Test ( groups = "Integration Testing")
	public void addtocarttestcases() {
		 WelcomePage wp = new WelcomePage(driver);
		 wp.getElectronicLink().click();
		 ElectronicPage ep = new  ElectronicPage(driver);
		 ep.addProductToCart();
	}

}