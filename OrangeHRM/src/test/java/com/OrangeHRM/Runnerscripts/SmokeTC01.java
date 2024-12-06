package com.OrangeHRM.Runnerscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericScripts.BasePage;

public class SmokeTC01 extends BasePage {

	@Test(priority=0)
	public void CheckAdminDashboard() {
		String ExpectedText = "Dashboard";
		String ActualText = hp.CheckDashBoard().getText();
		Assert.assertEquals(ActualText,ExpectedText,"The Verification is Unsuccessful");
		Assert.fail();
	}
	
	@Test(priority=1)
	public void CheckPIMPage() {
		hp.CheckPIMButton().click();
		String ExpectedPage ="PIM";
		String ActualPage =hp.CheckPIMPage().getText();
		Assert.assertEquals(ActualPage,ExpectedPage,"PIM page is not valid");
	}
	
	@Test(priority=2)
	
	public void AddEmpBtn() {
		hp.CheckPIMButton().click();
		boolean res = hp.VerifyAddEmpBtn().isEnabled();
		Assert.assertTrue(res,"The Element is not Enabled");
		hp.VerifyAddEmpBtn().click();
		boolean res1=hp.VerifyAddEmpPage().isDisplayed();
		Assert.assertTrue(res1,"The Page is not displayed");
	}
}

