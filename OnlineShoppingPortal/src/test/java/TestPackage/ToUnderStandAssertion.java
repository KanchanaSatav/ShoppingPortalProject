package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderStandAssertion {
	
	@Test
	public void assertion() {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	String actualWelcomePageTitle = "Demp Web Shop"; 
	String actualLoginPageTitle = "Demo WebShop Login";
	
	Assert.assertEquals(actualWelcomePageTitle, driver.getTitle(),"Welcome Page is not Displayed");
	
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(actualWelcomePageTitle, driver.getTitle(),"Login Page is not Displayed");
	
	WebElement emailTB = driver.findElement(By.id("Email"));
	Assert.assertEquals(true, emailTB.isDisplayed(),"Email Text box is not Displayed");
	emailTB.sendKeys("mahisingh07@gmail.com");
	
	WebElement passwordTB = driver.findElement(By.id("password"));
	Assert.assertEquals(true, passwordTB.isDisplayed(),"password Text box is not Displayed");
    passwordTB.sendKeys("Mahi@1234");	
    
    WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
    Assert.assertEquals(true, passwordTB.isDisplayed(),"login Button is not vissible");
    loginButton.click();
    
    } 
  }