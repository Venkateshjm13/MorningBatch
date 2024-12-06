package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//h6[.='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//h6[.='User Management']")
	private WebElement AdminDashboard;
	
	@FindBy(xpath="//a[.='Admin']")
	private WebElement AdminButton;
	
	@FindBy(xpath="//span[.='PIM']")
	private WebElement PIMButton;
	
	@FindBy(xpath="//h6[.='PIM']")
	private WebElement PIMMenu;
	
	@FindBy(xpath="//button[.=' Add ']")
	private WebElement AddEmployeeButton;
	
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement AddEmpButton;
	
	@FindBy(xpath="//h6[.='Add Employee']")
	private WebElement AddEmpPage;
	
	@FindBy(xpath="//h6[.='Admin']")
	private WebElement AddEmployeePage;
	
	/*Functional*/
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement userNameField;
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	private WebElement employeeNameField;
	
	@FindBy(xpath="(//div[.='-- Select --'])[4]")
	private WebElement userroleDropdown;
	
	@FindBy(xpath="(//div[.='-- Select --'])[5]")
	private WebElement statusDropdown;
	
	@FindBy(xpath="//button[.=' Search ')")
	private WebElement searchButton;
	 
	@FindBy(xpath="(//div[.='Admin'])[1]")
	private WebElement usernameText;
	 
	@FindBy(xpath="(//div[.='Admin'])[7]")
	private WebElement userroleText;
	
	@FindBy(xpath="(//div[.='Enabled'])[5]")
	private WebElement statusText;
	
	/*Integration
	@FindBy(xpath="//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editButton;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-pencil-fill'])[3]")
	private WebElement status_editButton;
	
	@FindBy(xpath="//h6[.='Edit User']")
	private WebElement editUserText;*/
	
	@FindBy(xpath="//span[.='Organization ']")
	private WebElement org_dropDown;
	
	@FindBy(xpath="//span[.='Qualifications ']")
	private WebElement qual_dropDown;
	

	@FindBy(xpath="//a[.='General Information']")
	private WebElement generalInfo_Link;
	
	@FindBy(xpath="//a[.='Education']")
	private WebElement education_Link;
	
	@FindBy(xpath="//a[.='Corporate Branding']")
	private WebElement corp_brandingLink;
	
	
	@FindBy(xpath="//h6[.='General Information']")
	private WebElement generalInfo_text;
	
	@FindBy(xpath="//h6[.='Education']")
	private WebElement education_text;
	
	@FindBy(xpath="//h6[.='Corporate Branding']")
	private WebElement corpbranding_text;
	
	public HomePage(WebDriver driver) {
		
		//PageFactory.initElements(driver,this);
		Initialization i = new Initialization();
		
	}
	
	public WebElement CheckDashBoard() {
		return Dashboard;
	}
	
	public WebElement CheckAdminDashBoard() {
		return AdminDashboard;
	}
	
	public WebElement CheckAdminButton() {
		return AdminButton;
	}
	public WebElement CheckPIMButton() {
		
		return PIMButton;
	}
	
	public WebElement CheckPIMPage() {
		
		return PIMMenu;
	}
	
	public WebElement VerifyAddEmployeeBtn() {
		
		return AddEmployeeButton;
	}
	public WebElement VerifyAddEmpBtn() {
		
		return AddEmpButton;
	}
	
	public WebElement VerifyAddEmpPage() {
		
		return AddEmpPage;
	}

	public WebElement VerifyAddEmployeePage() {
		
		return AddEmployeePage;
	}
	
	/*Functional*/
	public WebElement userNameField() {
		return userNameField;
	}
	public WebElement EmployeeNameField() {
		return employeeNameField;
	}
	
	public WebElement clickSearchButton() {
		return searchButton;
	}
	
	public WebElement VerifyUsername() {
		return usernameText;
	}
	
	public WebElement VerifyUserrole() {
		return userroleText;
	}
	
	public WebElement userrole_dropDown() {
		return userroleDropdown;
	}
	
	public WebElement status_dropDown() {
		return statusDropdown;
	}
	
	public WebElement VerifyStatus() {
		return statusText;
	}
	
	/*Integration
	public WebElement EditButton() {
		return editButton;
		
	}
	
	public WebElement checkEditUser() {
		return editUserText;
	}
	 
	
	public WebElement status_EditButton() {
		return status_editButton;
	}
	*/
	
	public WebElement org_dropDown() {
		return org_dropDown;
	}
	
	public WebElement quali_dropDown() {
		return qual_dropDown;
	}
	
	public WebElement GeneralInfo_link() {
		return generalInfo_Link;
	}
	
	public WebElement Education_link() {
		return education_Link;
	}
	
	
	public WebElement corpbranding_link() {
		return corp_brandingLink;
	}
	
	
	
	 
	public WebElement Check_GeneralHeading() {
		return generalInfo_text;
	}
	
	public WebElement Check_EducationHeading() {
		return education_text;
	}
	
	public WebElement Check_CorporateHeading() {
		return corpbranding_text;
	}
	
	}

