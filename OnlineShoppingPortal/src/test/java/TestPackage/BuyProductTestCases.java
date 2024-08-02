package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.Flib;
import POMPackage.CheckoutPage;
import POMPackage.ElectronicPage;
import POMPackage.LoginPage;
import POMPackage.ShoppingCartPage;
import POMPackage.WelcomePage;

public class BuyProductTestCases extends BaseClass {

	@Test (groups = "System Testing")
	public void buyProduct() throws IOException, InterruptedException {
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		 
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readExcelData(EXCEL_PATH, "validcred", 1, 0),flib.readExcelData(EXCEL_PATH, "validcred", 1, 1));
		
		wp.getElectronicLink().click();
		ElectronicPage ep = new ElectronicPage(driver);
		ep.addProductToCart();
		
		wp.getShoppingcartLink().click();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getTermsofservicecheckbox().click();
		sp.getCheckboxbutton().click();
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.buyProductInCOD();
		
	}
	}
