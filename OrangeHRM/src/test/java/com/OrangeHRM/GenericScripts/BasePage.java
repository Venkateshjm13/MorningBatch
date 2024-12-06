package com.OrangeHRM.GenericScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.OrangeHRM.ObjectRepositories.HomePage;
import com.OrangeHRM.ObjectRepositories.LoginPage;
import com.OrangeHRM.ObjectRepositories.LogoutPage;
import com.OrangeHRM.Utilities.CaptureDefects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage implements ApplicationConstants{

	public WebDriver driver;
	public LoginPage lp;
	public LogoutPage logout;
	public HomePage hp;
	@Parameters("Browser")
	@BeforeTest
	public void BrowserSetup(String Browser) {
		
		switch(Browser) {
		
		case "chrome" : WebDriverManager.chromedriver().setup();
		break;
		
		case "fire": WebDriverManager.firefoxdriver().setup();
		break;
		
		default: System.out.println("Invalid Browsers");
		}
		
	}
	
	@Parameters("BrowserInitialization")
	@BeforeMethod
	public void LaunchApplication(String BrowserInitialization) throws Exception {
		
		switch(BrowserInitialization) {
		case "chrome" : driver=new ChromeDriver();
		break;
		case "fire" : driver= new FirefoxDriver();
		break;
		default: System.out.println("Invalid driver paths");
		}
		lp=new LoginPage(driver);
		logout = new LogoutPage(driver);
		hp=new HomePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOuts,TimeUnit.SECONDS);
		Properties property = ReadPropertyValue.ReadProperty();
		driver.get(property.getProperty("LoginPageUrl"));
//		System.out.println(property.getProperty("adminUsn"));
//		System.out.println(property.getProperty("adminPsw"));
		lp.enter_usnTF().sendKeys(property.getProperty("adminUsn"));
		lp.enter_pswTF().sendKeys(property.getProperty("adminPsw"));
		lp.click_lgnbtn().click();
		Thread.sleep(2000);
		
		
	}
	
	
	@AfterMethod
	public void closeApplication(ITestResult result) throws Exception {
		if(result.FAILURE == result.getStatus()) {
			CaptureDefects.GetDefects(driver,result.getName());
		}
		logout.click_logoutdropdown().click();
		logout.click_logoutbtn().click();
		driver.quit();
		
	}
	
	@AfterClass
	public void TearDown() {
		
	}
}
