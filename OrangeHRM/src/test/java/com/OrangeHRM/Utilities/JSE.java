package com.OrangeHRM.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSE {

	public static void PassData(WebDriver driver,WebElement ele,String data) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("arguments[0].value='"+data+"'",ele);
	}
	
	public static void ClearData(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("arguments[0].value=''",ele);
	}
	
	public static void scrollIntoElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	public static void scrollBottomPage(WebDriver driver) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	}
	
	public static void scrollTopPage(WebDriver driver) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight");
	}
	
	public static void zoomPage(WebDriver driver,int size) {
		JavascriptExecutor js = UtilityObjects.HandleDisabledElement(driver);
		js.executeScript("document.body.style.zoom="+size+"");
	}
	
	
}
