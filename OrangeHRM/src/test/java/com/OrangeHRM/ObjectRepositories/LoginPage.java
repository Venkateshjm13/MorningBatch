package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="username")
	private WebElement usnTF;
	
	@FindBy(name="password")
	private WebElement pswTF;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgnBtn;
	
	//Initialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);;
	}
	
	//Utilization
	public WebElement enter_usnTF() {
		return usnTF;
	}
	
	public WebElement enter_pswTF() {
		return pswTF;
	}
	
	public WebElement click_lgnbtn() {
		return lgnBtn;
	}
}
