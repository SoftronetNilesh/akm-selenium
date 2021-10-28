package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ProspectsHomePage extends BaseClass{
	
	public ProspectsHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(xpath="//p[.='# of. Prospects']//following-sibling::h3")
	private WebElement prospectCount;
	
	@FindBy(xpath="//p[.='# of. Ask']//following-sibling::h3")
	private WebElement askCount;
	
	@FindBy(xpath="")
	private WebElement prospectByStageCount;
	
	@FindBy(xpath="")
	private WebElement prospectByManagerCount;
	
	@FindBy(xpath="")
	private WebElement prospectAskBySectorCount;
		
	@FindBy(id="prospectTab")
	private WebElement prospectTab;
	
	@FindBy(id="askTab")
	private WebElement askTab;
	
	@FindBy(xpath="//option[.='All Campaigns']//ancestor::select")
	private WebElement selectAllCampaigns;
	
	@FindBy(xpath="//option[.='All Funds']//ancestor::select")
	private WebElement selectAllFunds;
	
	@FindBy(xpath="//option[.='All Appeals']//ancestor::select")
	private WebElement selectAllAppeals;

	@FindBy(xpath="//option[.='All Purposes']//ancestor::select")
	private WebElement selectAllPurposes;
	
	@FindBy(xpath="//option[.='All Stages']//ancestor::select")
	private WebElement selectAllStages;
	
	@FindBy(xpath="//option[.='All Sectors']//ancestor::select")
	private WebElement selectAllSectors;
	
	@FindBy(xpath="//option[.='All Types']//ancestor::select")
	private WebElement selectAllTypes;
	
	@FindBy(xpath="//option[.='All Territory']//ancestor::select")
	private WebElement selectAllTerritory;
	
	@FindBy(xpath="//option[.='All Owners']//ancestor::select")
	private WebElement selectAllOwners;
	
	
	@FindBy(xpath="//input[@placeholder='Type constituent name or id']")
	private WebElement searchConstituentsBox;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;
	
	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//td[.='No record found']")
	private WebElement noRecordFoundMsg;
	
	public static class addProspect{
		public addProspect() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfo;
		
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfo;
		
		@FindBy(xpath="//label[text()='Select Person']//following-sibling::div//input")
		private WebElement selectPerson;
		
		@FindBy(xpath="//label[text()='Currency']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Territory']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Capacity Rating:']//following-sibling::div//select")
		private WebElement selectCapacityRating;
		
		@FindBy(xpath="//label[text()='Asset Amount:']//following-sibling::div//select")
		private WebElement selectAssetAmount;
		
		@FindBy(xpath="//label[text()='Asset Note:']//following-sibling::div")
		private WebElement assetNote;
		
		@FindBy(xpath="//label[text()='Real Estate Amount:']//following-sibling::div")
		private WebElement realEstateAmount;
		
		@FindBy(xpath="//label[text()='Potential Min Amount:']//following-sibling::div")
		private WebElement potentialMinAmount;
		
		@FindBy(xpath="//label[text()='Potential Max Amount:']//following-sibling::div")
		private WebElement potentialMaxAmount;
		
		@FindBy(xpath="//label[text()='Potential Note:']//following-sibling::div")
		private WebElement potentialNote;
		
		@FindBy(xpath="//label[text()='HH Income:']//following-sibling::div")
		private WebElement hhIncome;
		
		@FindBy(xpath="//label[text()='Level:']//following-sibling::div")
		private WebElement level;
		
		@FindBy(xpath="")
		private WebElement rating;
		
		@FindBy(xpath="//label[text()='Prospect Manager:']//following-sibling::div")
		private WebElement prospectManager;
		
		@FindBy(xpath="//label[text()='Target Amount:']//following-sibling::div")
		private WebElement targetAmount;
		
		@FindBy(xpath="//label[text()='Target Period (In year):']//following-sibling::div")
		private WebElement targetPeriodInYear;
		
		@FindBy(xpath="//label[text()='Prospect Stage']//following-sibling::div")
		private WebElement prospectStage;
		
		@FindBy(xpath="")
		private WebElement priority;
		
		@FindBy(xpath="//label[text()='Funding Interests:']//following-sibling::div/textarea")
		private WebElement fundingInterests;
		
		@FindBy(xpath="//label[.='Campaign:']//following-sibling::div//select")
		private WebElement campaign;
		
		@FindBy(xpath="//label[.='Event:']//following-sibling::div//select")
		private WebElement event;
		
		@FindBy(xpath="//label[.='Fund:']//following-sibling::div//select")
		private WebElement fund;
		
		@FindBy(xpath="//label[.='Purpose:']//following-sibling::div//select")
		private WebElement purpose;
		
		@FindBy(xpath="//label[.='Appeal:']//following-sibling::div//select")
		private WebElement appeal;
		
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;
		
		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement sourceMethod;
		
		@FindBy(xpath="(//label[.='Solicitor']//following-sibling::div)[1]")
		private WebElement solicitor;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
	}
	
	
	public static class addAsk{
		public addAsk() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfo;
		
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfo;
		
		@FindBy(xpath="//button[.=' Clearance ']")
		private WebElement selectClearance;
		
		@FindBy(xpath="//label[text()='Person / Organization ']//following-sibling::div//input")
		private WebElement personOrOrganizationName;
		
		@FindBy(xpath="//label[text()='Connector:']//following-sibling::div//input")
		private WebElement connector;
		
		@FindBy(xpath="//label[text()='Currency']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Territory']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Stage']//following-sibling::div//select")
		private WebElement selectStage;
		
		@FindBy(xpath="//label[text()='Sector:']//following-sibling::div//select")
		private WebElement selectSector;
		
		@FindBy(xpath="//label[text()='Priority:']//following-sibling::div//select")
		private WebElement selectPriority;
		
		@FindBy(xpath="//label[text()='Type']//following-sibling::div//select")
		private WebElement selectType;
		
		@FindBy(xpath="//label[text()='Ask Amount']//following-sibling::div//input")
		private WebElement askAmount;
		
		@FindBy(xpath="//label[text()='Committed Amount:']//following-sibling::div//input")
		private WebElement commitedAmount;
		
		@FindBy(xpath="(//th[text()='Amount']//following::input)[1]")
		private WebElement expectedQ1Amount;
		
		@FindBy(xpath="(//th[text()='Amount']//following::input)[2]")
		private WebElement expectedQ2Amount;
		
		@FindBy(xpath="(//th[text()='Amount']//following::input)[3]")
		private WebElement expectedQ3Amount;
		
		@FindBy(xpath="(//th[text()='Amount']//following::input)[4]")
		private WebElement expectedQ4Amount;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[1]/td)[1]")
		private WebElement fiscalYear1;
		
		@FindBy(xpath="((//th[text()='Fiscal Year']//following::tr[2]/td)[1]")
		private WebElement fiscalYear2;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[3]/td)[1]")
		private WebElement fiscalYear3;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[4]/td)[1]")
		private WebElement fiscalYear4;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[1]/td)[2]")
		private WebElement fiscalYearQuarter1;
		
		@FindBy(xpath="((//th[text()='Fiscal Year']//following::tr[2]/td)[2]")
		private WebElement fiscalYearQuarter2;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[3]/td)[3]")
		private WebElement fiscalYearQuarter3;
		
		@FindBy(xpath="(//th[text()='Fiscal Year']//following::tr[4]/td)[4]")
		private WebElement fiscalYearQuarter4;
		
		@FindBy(xpath="//label[text()='Alignment:']//following-sibling::div/input")
		private WebElement alignment;
		
		@FindBy(xpath="")
		private WebElement probability;
		
		@FindBy(xpath="//label[text()='Primary Owner:']//following-sibling::div/select")
		private WebElement primaryOwner;
		
		@FindBy(xpath="//label[text()='Secondary Owner:']//following-sibling::div/select")
		private WebElement secondaryOwner;
		
		@FindBy(xpath="//button[text()=' Clearance ']")
		private WebElement clearance;
		
		@FindBy(id="required")
		private WebElement requiredCheck;
		
		@FindBy(id="received")
		private WebElement receivedCheck;
		
		@FindBy(xpath="//label[.='Campaign:']//following-sibling::div//select")
		private WebElement campaign;
		
		@FindBy(xpath="//label[.='Event:']//following-sibling::div//select")
		private WebElement event;
		
		@FindBy(xpath="//label[.='Fund:']//following-sibling::div//select")
		private WebElement fund;
		
		@FindBy(xpath="//label[.='Purpose:']//following-sibling::div//select")
		private WebElement purpose;
		
		@FindBy(xpath="//label[.='Appeal:']//following-sibling::div//select")
		private WebElement appeal;
		
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;
		
		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement sourceMethod;
		
		@FindBy(xpath="(//label[.='Solicitor']//following-sibling::div)[1]")
		private WebElement solicitor;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
	}
	
}
