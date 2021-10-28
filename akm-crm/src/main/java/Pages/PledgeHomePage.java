package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class PledgeHomePage extends BaseClass{
	public PledgeHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//option[text()='Select']//ancestor::select")
	private WebElement calenderSelect;
	
	@FindBy(xpath="//option[text()='Life Time']//ancestor::select")
	private WebElement calenderSelectFilter;
	
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
	private WebElement calenderStartDate;

	@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
	private WebElement calenderEndDate;
	
	@FindBy(xpath="//option[.='All Statuses']//ancestor::select")
	private WebElement selectAllMembershipProgram;
	
	@FindBy(xpath="//option[.='All Campaigns']//ancestor::select")
	private WebElement selectAllCampaigns;
	
	@FindBy(xpath="//option[.='Select Amount Type']//ancestor::select")
	private WebElement selectAmountType;
	
	@FindBy(xpath="//option[.='All Amounts']//ancestor::select")
	private WebElement selectAllAmount;
	
	@FindBy(xpath="//input[@placeholder='Min amount']")
	private WebElement selectMinAmount;
	
	@FindBy(xpath="//input[@placeholder='Max amount']")
	private WebElement selectMaxAmount;
	
	@FindBy(xpath="//option[.='All Appeals']//ancestor::select")
	private WebElement selectAllAppeals;
	
	@FindBy(xpath="//option[.='All Funds']//ancestor::select")
	private WebElement selectAllFunds;

	@FindBy(xpath="//option[.='All Purposes']//ancestor::select")
	private WebElement selectAllPurposes;	

	@FindBy(xpath="//option[.='All Territory']//ancestor::select")
	private WebElement selectAllTerritory;

	@FindBy(xpath="//option[.='All Regions']//ancestor::select")
	private WebElement selectRegions;

	@FindBy(xpath="//option[.='All Countries']//ancestor::select")
	private WebElement selectAllCountries;
	
	@FindBy(xpath="//option[.='All States']//ancestor::select")
	private WebElement selectAllStates;
	
	@FindBy(xpath="//option[.='All']//ancestor::select")
	private WebElement selectAll;
	
	@FindBy(xpath="//input[@placeholder='Type constituent name or id']")
	private WebElement searchConstituentsBox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//button[.='Apply']")
	private WebElement applyBtn;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;	
	
	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[.='Export']")
	private WebElement exportBtn;
	
	@FindBy(xpath="//td[.='No record found']")
	private WebElement noRecordFoundMsg;

	public static class addPledge{
		
		public addPledge() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfoBtn;
		
		@FindBy(xpath=" Membership Benefits - Beneficiary - Benefits used by  ")
		private WebElement selectBenifitsUsedByBtn;
		
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfoBtn;
		
		@FindBy(xpath="//button[.=' Payment Information ']")
		private WebElement selectPaymentInfoBtn;
		
		@FindBy(xpath="//label[text()='Select Person ']//following-sibling::div//input")
		private WebElement selectPerson;
		
		@FindBy(xpath="//label[text()='Type ']//following-sibling::div//select")
		private WebElement selectType;
		
		@FindBy(xpath="//label[text()='Number of years ']//following-sibling::div//select")
		private WebElement selectNoOfYears;
		
		@FindBy(xpath="//label[text()='Commited On ']//following-sibling::div//input")
		private WebElement commitedOnDate;
		
		@FindBy(xpath="//label[text()='Territory ']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Currency ']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Amount(CAD):']//following-sibling::div/input")
		private WebElement selectAmountCAD;
		
		@FindBy(xpath="//label[text()='Exchange Rate(CAD to ):']//following-sibling::div//input")
		private WebElement selectExchangeRateCAD;
		
		@FindBy(xpath="//label[text()='Commited Amount () ']//following-sibling::div//input")
		private WebElement selectCommitedAmount;
		
		@FindBy(id="benefits_declined")
		private WebElement benefitsDeclinedCheck;
				
		@FindBy(xpath="//label[.='Select Beneficiary']//following-sibling::div//input")
		private WebElement selectBeneficiary;
		
		@FindBy(xpath="//label[.='Campaign:']//following-sibling::div//select")
		private WebElement campaign;
		
		@FindBy(xpath="//label[.='Event:']//following-sibling::div//select")
		private WebElement event;
			
		@FindBy(xpath="//label[.='Fund:']//following-sibling::div//select")
		private WebElement fund;

		@FindBy(xpath="//label[.='Appeal:']//following-sibling::div//select")
		private WebElement appeal;

		@FindBy(xpath="//label[text()='Restricted Fund:']//following-sibling::div//select")
		private WebElement restrictedFund;
		
		@FindBy(xpath="//label[.='Purpose:']//following-sibling::div//select")
		private WebElement purpose;
		
		@FindBy(xpath="//label[text()='Category:']//following-sibling::div//select")
		private WebElement category;
		
		@FindBy(xpath="//label[text()='Status:']//following-sibling::div//select")
		private WebElement status;		
				
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;

		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement solicitorMethod;
		
		@FindBy(xpath="//label[.='Solicitor']//following-sibling::div//input")
		private WebElement solicitor;
		
		@FindBy(xpath="//label[text()='Payment Method ']//following-sibling::div//select")
		private WebElement paymentMethod;
		
		@FindBy(id="is_paid")
		private WebElement isPaidCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;

	}
}
