package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.Flib;
import POMPackage.LoginPage;
import POMPackage.WelcomePage;

public class ValidLoginTestCase extends BaseClass {
	@Test (groups = "Functionality Testing")
	public void loginTC() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, "validcred", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, "validcred", 1, 1);

		lp.validLogin(email, password);
	}
}
