package com.OrangeHRM.Runnerscripts.Admin;

import javax.swing.text.Utilities;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericScripts.BasePage;
import com.OrangeHRM.GenericScripts.DataProviderClass;
import com.OrangeHRM.Utilities.MouseAction;
import com.OrangeHRM.Utilities.UtilityObjects;

public class AdminSmokeTestcases extends BasePage {

	//@Test(priority=0)
	public void SmokeTestcases001() 
	{
		hp.CheckAdminButton().click();
		String ExpectedText = "User Management";
		String ActualText = hp.CheckAdminDashBoard().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
		
	}
	
	//@Test(priority=1)
	public void SmokeTestcases002() 
	{
		hp.CheckAdminButton().click();
		hp.VerifyAddEmployeeBtn().click();
		boolean res1=hp.VerifyAddEmployeePage().isDisplayed();
		Assert.assertTrue(res1,"The Page is not displayed");
	}
	
	//@Test
	public void FunctionalTestcases001() {
		 hp.CheckAdminButton().click();
		 hp.userNameField().sendKeys("Admin");
		 hp.clickSearchButton();
		 boolean res2 = hp.VerifyUsername().isDisplayed();
		Assert.assertTrue(res2,"username-Admin is not found");
	}
 
 
	//@Test
	public void FunctionalTestcases002() {
		hp.CheckAdminButton().click();
		hp.userrole_dropDown().click();
		UtilityObjects.MouseActions(driver).sendKeys(Keys.DOWN).perform();
		UtilityObjects.MouseActions(driver).sendKeys(Keys.ENTER).perform();
		 boolean res3 = hp.VerifyUserrole().isDisplayed();
		Assert.assertTrue(res3,"userrole-Admin is not found");
	}
	
	//@Test
	
	public void FunctionalTestcases003() {
		hp.CheckAdminButton().click();
		hp.status_dropDown().click();
		UtilityObjects.MouseActions(driver).sendKeys(Keys.DOWN).perform();
		UtilityObjects.MouseActions(driver).sendKeys(Keys.ENTER).perform();
		boolean res4 = hp.VerifyStatus().isDisplayed();
		Assert.assertTrue(res4,"status-Enabled is not found");
	}
	
	//@Test
	public void IntegrationTestcases001() {
		hp.CheckAdminButton().click();
		hp.org_dropDown().click();
		hp.GeneralInfo_link().click();
		String ExpectedText = "General Information";
		String ActualText = hp.Check_GeneralHeading().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
	}
	
	//@Test
	
	public void IntegrationTestcase002() {
		hp.CheckAdminButton().click();
		hp.quali_dropDown().click();
		hp.Education_link().click();
		String ExpectedText = "Education";
		String ActualText = hp.Check_EducationHeading().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
	}
	
	//@Test
	
	public void IntegrationTestcases003() {
		hp.CheckAdminButton().click();
		hp.corpbranding_link().click();
		String ExpectedText = "Corporate Branding";
		String ActualText = hp.Check_CorporateHeading().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
	}
	
	
	@Test(dataProvider="Excel",dataProviderClass=DataProviderClass.class)
	
	public void E2E(String username) {
		hp.CheckAdminButton().click();
		String ExpectedText = "User Management";
		String ActualText = hp.CheckAdminDashBoard().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
		hp.userNameField().sendKeys(username);
		hp.clickSearchButton();
		boolean res2 = hp.VerifyUsername().isDisplayed();
		Assert.assertTrue(res2,"username-Admin is not found");
		hp.org_dropDown().click();
		hp.GeneralInfo_link().click();
		String ExpectedText2 = "General Information";
		String ActualText2 = hp.Check_GeneralHeading().getText();
		Assert.assertEquals(ActualText2,ExpectedText2,"The Verification is Unsuccessful");
		
	}
	
	
}
