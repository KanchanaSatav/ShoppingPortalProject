package GenericPackage;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;

public class Demo {

	// public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	// FileInputStream fis =new
	// FileInputStream("./src/main/resources/Config.properities");
	// Properties prop = new Properties();
	// prop.load(fis);
	// String browserValue = prop.getProperty("browser1");
	// System.out.println(browserValue);

	// For File library
	// public static void main(String[] args) throws IOException {
	// Flib flib = new Flib();
	// String url =
	// flib.readPropertyData("./src\\main\\resources\\Config.properities", "url");
	// System.out.println(url);

	// To read data from excel sheet

	// private static final String Excel_Path = null;

	public static void main(String[] args) throws IOException  {
		Flib flib = new Flib();
		String data = flib.readExcelData("./src/main/resources/TestData.xlsx", "validcred", 1, 0);
		System.out.println(data);
		//int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		 //System.out.println(rc);
	}

}
