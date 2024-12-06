package com.OrangeHRM.Utilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class HandlingDropdowns {

	public static void SelectOption(WebElement element,Object value) {
		
		if(value instanceof Integer) {
			UtilityObjects.HandleDropdown(element).selectByIndex((int) value);
		}
		else if(value instanceof String) {
			try {
			UtilityObjects.HandleDropdown(element).selectByValue((String) value);
			}
			catch(Exception e) {
			UtilityObjects.HandleDropdown(element).selectByVisibleText((String) value);
			}
			
		} 
	}
	
	public static void DeselectOption(WebElement element,Object value) {
		
		if(value instanceof Integer) {
			UtilityObjects.HandleDropdown(element).deselectByIndex((int) value);
		}
		else if(value instanceof String) {
			try {
			UtilityObjects.HandleDropdown(element).deselectByValue((String) value);
			}
			catch(Exception e) {
			UtilityObjects.HandleDropdown(element).deselectByVisibleText((String)value);
			}
			
		} 
		else if(value.equals(null)){
			UtilityObjects.HandleDropdown(element).deselectAll();
		}
	}

	public static List<WebElement> getOptions(WebElement element) {
		 List<WebElement> opts = UtilityObjects.HandleDropdown(element).getOptions();
		return opts;
	}
	
	public static WebElement getFirstSelectedOption(WebElement element) {
		WebElement firstoption = UtilityObjects.HandleDropdown(element).getFirstSelectedOption();
		return firstoption;
	
	}
	
	public static List<WebElement> getAllSelectedOption(WebElement element) {
		List<WebElement> allselectedopts = UtilityObjects.HandleDropdown(element).getAllSelectedOptions();
		return allselectedopts;
	}
	 	 
}
