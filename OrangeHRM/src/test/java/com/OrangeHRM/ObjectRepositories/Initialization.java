package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Initialization {

	public void initial(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public Initialization{
}
