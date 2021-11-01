package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(id="constituentTab")
	private WebElement constituentTab;
	
	@FindBy(id="membershipTab")
	private WebElement membershipTab;
	
	@FindBy(id="contributionsTab")
	private WebElement contributionsTab;
	
	@FindBy(id="pledgeTab")
	private WebElement pledgeTab;
	
	@FindBy(id="prospectTab")
	private WebElement prospectTab;
	
	@FindBy(id="askTab")
	private WebElement askTab;

	@FindBy(id="grantTab")
	private WebElement grantTab;

	@FindBy(id="taskTab")
	private WebElement taskTab;

	@FindBy(id="activityTab")
	private WebElement activityTab;
	
	@FindBy(xpath="//option[text()='All Constituents']")
	private WebElement selectConstituents;
	
	@FindBy(xpath="//option[text()='All Regions']")
	private WebElement selectAllRegion;
	
	@FindBy(xpath="//option[text()='All Countries']']")
	private WebElement selectAllCountries;
	
	@FindBy(xpath="//option[text()='All States']']")
	private WebElement selectAllStates;
	
	@FindBy(xpath="//option[text()='All Territory']']")
	private WebElement selectAllTerritory;
	
	@FindBy(xpath="//option[text()='All Labels']']")
	private WebElement selectAllLabels;
	
	@FindBy(name="search")
	private WebElement speedSearch;
	
	@FindBy(xpath="//button[normalize-space()='Clear']")
	private WebElement clearFilterBtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addConstituentsBtn;

	@FindBy(xpath="//button[normalize-space()='Export']")
	private WebElement exportConstituentsBtn;
	
	@FindBy(xpath="//select[@class='form-select ng-pristine ng-valid ng-touched']")
	private WebElement selectUser;
	
	@FindBy(xpath="//p[text()='Constituents']//following-sibling::h3")
	private WebElement constituentsCount;
	
	@FindBy(xpath="//p[text()='Memberships']//following-sibling::h3")
	private WebElement membershipsCount;

	@FindBy(xpath="//p[text()='Active Memberships']//following-sibling::h3")
	private WebElement activeMembershipsCount;

	@FindBy(xpath="//p[text()='Pledges']//following-sibling::h3")
	private WebElement pledgesCount;

	@FindBy(xpath="//p[text()='This month']//following-sibling::h3")
	private WebElement thisMonthCount;

	@FindBy(xpath="//p[text()='This year']//following-sibling::h3")
	private WebElement thisYearCount;

	@FindBy(xpath="//p[text()='Last year this month']//following-sibling::h3")
	private WebElement lastYearThisMonthCount;

	@FindBy(xpath="//p[text()='Last year']//following-sibling::h3")
	private WebElement lastYearCount;

	@FindBy(xpath="//a[@href='#/my-home']")
	private WebElement myHomeLinkTab;

	@FindBy(xpath="//a[@href='#/dashboard']")
	private WebElement dashboardLinkTab;
	
	@FindBy(xpath="//a[@href='#/reports']")
	private WebElement reportsLinkTab;

	@FindBy(xpath="//a[@href='#/constituents']")
	private WebElement constituentsLinkTab;

	@FindBy(xpath="//a[@href='#/prospects']")
	private WebElement prospectsLinkTab;

	@FindBy(xpath="//a[@href='#/grants']")
	private WebElement grantsLinkTab;

	@FindBy(xpath="//a[@href='#/memberships']")
	private WebElement membershipsLinkTab;

	@FindBy(xpath="//a[@href='#/pledges']")
	private WebElement pledgesLinkTab;

	@FindBy(xpath="//a[@href='#/contributions']")
	private WebElement contributionsLinkTab;

	@FindBy(xpath="//a[@href='#/tasks']")
	private WebElement tasksLinkTab;

	@FindBy(xpath="//a[@href='#/cases']")
	private WebElement casesLinkTab;

	@FindBy(xpath="//a[@href='#/funds']")
	private WebElement fundsLinkTab;

	@FindBy(xpath="//a[@href='#/purpose']")
	private WebElement purposeLinkTab;

	@FindBy(xpath="//a[@href='#/appeals']")
	private WebElement appealsLinkTab;

	@FindBy(xpath="//a[@href='#/sources']")
	private WebElement sourcesLinkTab;

	@FindBy(xpath="//a[@href='#/campaigns']")
	private WebElement campaignsLinkTab;

	@FindBy(xpath="//a[@href='#/events']")
	private WebElement eventsLinkTab;

	@FindBy(xpath="//a[@href='#/expenses']")
	private WebElement expensesLinkTab;

	@FindBy(xpath="//a[@href='#/programs']")
	private WebElement programsLinkTab;
	@FindBy(xpath="//a[@href='#/fund-partners']")
	private WebElement fundPartnersLinkTab;

	@FindBy(xpath="//*[@class='sidebar-minimizer']")
	private WebElement minimizerLinkTab;
	
	//Getters for WebElements
	public WebElement getDashboardTab() {
		return dashboardTab;
	}

	public WebElement getConstituentTab() {
		return constituentTab;
	}

	public WebElement getMembershipTab() {
		return membershipTab;
	}

	public WebElement getContributionsTab() {
		return contributionsTab;
	}

	public WebElement getPledgeTab() {
		return pledgeTab;
	}

	public WebElement getProspectTab() {
		return prospectTab;
	}

	public WebElement getAskTab() {
		return askTab;
	}

	public WebElement getGrantTab() {
		return grantTab;
	}

	public WebElement getTaskTab() {
		return taskTab;
	}

	public WebElement getActivityTab() {
		return activityTab;
	}

	public WebElement getSelectConstituents() {
		return selectConstituents;
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

	public WebElement getSelectAllTerritory() {
		return selectAllTerritory;
	}

	public WebElement getSelectAllLabels() {
		return selectAllLabels;
	}

	public WebElement getSpeedSearch() {
		return speedSearch;
	}

	public WebElement getClearFilterBtn() {
		return clearFilterBtn;
	}

	public WebElement getAddConstituentsBtn() {
		return addConstituentsBtn;
	}

	public WebElement getExportConstituentsBtn() {
		return exportConstituentsBtn;
	}

	public WebElement getSelectUser() {
		return selectUser;
	}

	public WebElement getConstituentsCount() {
		return constituentsCount;
	}

	public WebElement getMembershipsCount() {
		return membershipsCount;
	}

	public WebElement getActiveMembershipsCount() {
		return activeMembershipsCount;
	}

	public WebElement getPledgesCount() {
		return pledgesCount;
	}

	public WebElement getThisMonthCount() {
		return thisMonthCount;
	}

	public WebElement getThisYearCount() {
		return thisYearCount;
	}

	public WebElement getLastYearThisMonthCount() {
		return lastYearThisMonthCount;
	}

	public WebElement getLastYearCount() {
		return lastYearCount;
	}

	public WebElement getMyHomeLinkTab() {
		return myHomeLinkTab;
	}

	public WebElement getDashboardLinkTab() {
		return dashboardLinkTab;
	}

	public WebElement getReportsLinkTab() {
		return reportsLinkTab;
	}

	public WebElement getConstituentsLinkTab() {
		return constituentsLinkTab;
	}

	public WebElement getProspectsLinkTab() {
		return prospectsLinkTab;
	}

	public WebElement getGrantsLinkTab() {
		return grantsLinkTab;
	}

	public WebElement getMembershipsLinkTab() {
		return membershipsLinkTab;
	}

	public WebElement getPledgesLinkTab() {
		return pledgesLinkTab;
	}

	public WebElement getContributionsLinkTab() {
		return contributionsLinkTab;
	}

	public WebElement getTasksLinkTab() {
		return tasksLinkTab;
	}

	public WebElement getCasesLinkTab() {
		return casesLinkTab;
	}

	public WebElement getFundsLinkTab() {
		return fundsLinkTab;
	}

	public WebElement getPurposeLinkTab() {
		return purposeLinkTab;
	}

	public WebElement getAppealsLinkTab() {
		return appealsLinkTab;
	}

	public WebElement getSourcesLinkTab() {
		return sourcesLinkTab;
	}

	public WebElement getCampaignsLinkTab() {
		return campaignsLinkTab;
	}

	public WebElement getEventsLinkTab() {
		return eventsLinkTab;
	}

	public WebElement getExpensesLinkTab() {
		return expensesLinkTab;
	}

	public WebElement getProgramsLinkTab() {
		return programsLinkTab;
	}

	public WebElement getFundPartnersLinkTab() {
		return fundPartnersLinkTab;
	}

	public WebElement getMinimizerLinkTab() {
		return minimizerLinkTab;
	}
}
