package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DashboardHomePage extends BaseClass {
	
	public DashboardHomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="membershipTab")
	private WebElement membershipTab;
	
	@FindBy(id="contributionTab")
	private WebElement contributionTab;
	
	@FindBy(id="donorTab")
	private WebElement donorTab;
	
	@FindBy(xpath="//select[@class='form-select ng-pristine ng-valid ng-touched']")
	private WebElement calenderFilter;
	
	@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine' and @placeholder='From Date']")
	private WebElement selectFromDate;	

	@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine' and @placeholder='To Date']")
	private WebElement selectToDate;	
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applyBtn;
	
	@FindBy(xpath="//button[text()='Clear']")
	private WebElement clearBtn;
	
	@FindBy(xpath="//option[text()='All Regions']")
	private WebElement selectAllRegion;
	
	@FindBy(xpath="//option[text()='All Countries']']")
	private WebElement selectAllCountries;
	
	@FindBy(xpath="//option[text()='All States']']")
	private WebElement selectAllStates;
	
	@FindBy(xpath="//option[text()='All Membership Programs']']")
	private WebElement selectAllMembershipPrograms;
	
	@FindBy(xpath="//option[text()='Select Membership Levels']']")
	private WebElement selectMembershipLevels;
	
	//Getters for WebElements
	public WebElement getMembershipTab() {
		return membershipTab;
	}

	public WebElement getContributionTab() {
		return contributionTab;
	}

	public WebElement getDonorTab() {
		return donorTab;
	}

	public WebElement getCalenderFilter() {
		return calenderFilter;
	}

	public WebElement getSelectFromDate() {
		return selectFromDate;
	}

	public WebElement getSelectToDate() {
		return selectToDate;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getSelectAllRegion() {
		return selectAllRegion;
	}

	public WebElement getSelectAllCountries() {
		return selectAllCountries;
	}

	public WebElement getSelectAllStates() {
		return selectAllStates;
	}

	public WebElement getSelectAllMembershipPrograms() {
		return selectAllMembershipPrograms;
	}

	public WebElement getSelectMembershipLevels() {
		return selectMembershipLevels;
	}	
}
