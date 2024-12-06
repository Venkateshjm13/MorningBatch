package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	//declaration
	@FindBy(xpath="//li[@class='oxd-userdropdown']")
	private WebElement logoutDropdown;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutBtn;
	
	//Initialization
	public LogoutPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement click_logoutdropdown() {
		return logoutDropdown;
	}
	
	public WebElement click_logoutbtn() {
		return logoutBtn;
	}
}
