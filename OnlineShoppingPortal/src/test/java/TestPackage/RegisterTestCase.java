package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.Flib;
import POMPackage.RegisterPage;
import POMPackage.WelcomePage;

public class RegisterTestCase  extends  BaseClass{

	@Test
	public void registerTC() throws IOException
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterlink().click();
		
		 RegisterPage rp = new RegisterPage(driver);
		
		 
		 Flib flib = new Flib();
		String fn = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 0);
		  String ln = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 1);
		String email = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 2);
		String pwd = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 3);
		
		rp.registerUser(fn, ln, email, pwd);
		  
	}
}
