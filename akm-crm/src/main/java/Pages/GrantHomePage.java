package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GrantHomePage extends BaseClass {

	public GrantHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(id="grantTab")
	private WebElement grantTab;
	
	@FindBy(xpath="//*[text()='Total Grants']//following-sibling::*")
	private WebElement totalGrant;
	
	@FindBy(xpath="")
	private WebElement totalByStage;
	
	@FindBy(xpath="")
	private WebElement totalByGrantOwner;
	
	@FindBy(xpath="//option[.='All Campaigns']//ancestor::select")
	private WebElement selectAllCampaigns;
	
	@FindBy(xpath="//option[.='All Funds']//ancestor::select")
	private WebElement selectAllFunds;
	
	@FindBy(xpath="//option[.='All Appeals']//ancestor::select")
	private WebElement selectAllAppeals;

	@FindBy(xpath="//option[.='All Purposes']//ancestor::select")
	private WebElement selectAllPurposes;
	
	@FindBy(xpath="//input[@placeholder='Type constituent name or id']")
	private WebElement searchConstituentsBox;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;
	
	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//td[.='No record found']")
	private WebElement noRecordFoundMsg;
	
	public static class addGrant{
		public addGrant() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfo;
		
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfo;
		
		@FindBy(xpath="//label[text()='Person / Organization ']//following-sibling::div//input")
		private WebElement personOrOrganizationName;
		
		@FindBy(xpath="//label[text()='Connector:']//following-sibling::div//input")
		private WebElement connector;
		
		@FindBy(xpath="//label[text()='Currency']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Territory']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Proposal Start Date:']//following-sibling::div//input")
		private WebElement selectProposalStartDate;

		@FindBy(xpath="//label[text()='Proposal Due Date:']//following-sibling::div//input")
		private WebElement selectProposalDueDate;

		@FindBy(xpath="//label[text()='Proposal Submitted Date:']//following-sibling::div//input")
		private WebElement selectProposalSubmittedDate;

		@FindBy(xpath="//label[text()='Grant Approved Date:']//following-sibling::div//input")
		private WebElement grantApprovedDate;
		
		@FindBy(xpath="//label[text()='Grant Approved Amount:']//following-sibling::div//input")
		private WebElement grantApprovedAmount;
		
		@FindBy(xpath="//label[text()='Stage']//following-sibling::div//select")
		private WebElement selectStage;
		
		@FindBy(xpath="//label[text()='Type']//following-sibling::div//select")
		private WebElement selectType;
		
		@FindBy(xpath="//label[text()='Alignment:']//following-sibling::div/input")
		private WebElement alignment;
		
		@FindBy(xpath="")
		private WebElement probability;
		
		@FindBy(xpath="//label[text()='Primary Owner:']//following-sibling::div/select")
		private WebElement primaryOwner;
		
		@FindBy(xpath="//label[text()='Secondary Owner:']//following-sibling::div/select")
		private WebElement secondaryOwner;
		
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
