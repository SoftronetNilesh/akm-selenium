package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class MembershipHomePage extends BaseClass {
	public MembershipHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(id="membershipTab")
	private WebElement membershipTab;
	
	@FindBy(id="revenueTab")
	private WebElement revenueTab;
	
	@FindBy(xpath="//p[text()='Lifetime Memberships']//following-sibling::*")
	private WebElement lifetimeMembershipCount;
	
	@FindBy(xpath="//p[text()='Active Memberships']//following-sibling::*")
	private WebElement activeMemberships;
	
	@FindBy(xpath="//p[text()='Expiring This month']//following-sibling::*")
	private WebElement expThisMonthCount;
	
	@FindBy(xpath="//p[text()='Renewed this month']//following-sibling::*")
	private WebElement renewedThisMonthCount;
	
	@FindBy(xpath="//p[text()='Dropped this month']//following-sibling::*")
	private WebElement dropThisMonthCount;
	
	@FindBy(id="active")
	private WebElement activeCheck;
	
	@FindBy(id="new")
	private WebElement newCheck;
	
	@FindBy(id="renewal")
	private WebElement renewalCheck;
	
	@FindBy(id="reinstated")
	private WebElement reinstatedCheck;
	
	@FindBy(xpath="//select[@class='form-select ng-pristine ng-valid ng-touched']")
	private WebElement calenderSelect;
	
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
	private WebElement calenderStartDate;

	@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
	private WebElement calenderEndDate;
	
	@FindBy(xpath="//option[.='All Membership Programs']//ancestor::select")
	private WebElement selectAllMembershipProgram;
	
	@FindBy(xpath="//option[.='All Membership Levels']//ancestor::select")
	private WebElement selectAllMembershipLevels;
	
	@FindBy(xpath="//option[.='All Campaigns']//ancestor::select")
	private WebElement selectAllCampaigns;
	
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
	
	@FindBy(xpath="//input[@placeholder='Type constituent name or id']")
	private WebElement searchConstituentsBox;
	
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
	
	//Getters for WebElements
	public WebElement getDashboardTab() {
		return dashboardTab;
	}

	public WebElement getMembershipTab() {
		return membershipTab;
	}

	public WebElement getRevenueTab() {
		return revenueTab;
	}

	public WebElement getLifetimeMembershipCount() {
		return lifetimeMembershipCount;
	}

	public WebElement getActiveMemberships() {
		return activeMemberships;
	}

	public WebElement getExpThisMonthCount() {
		return expThisMonthCount;
	}

	public WebElement getRenewedThisMonthCount() {
		return renewedThisMonthCount;
	}

	public WebElement getDropThisMonthCount() {
		return dropThisMonthCount;
	}

	public WebElement getActiveCheck() {
		return activeCheck;
	}

	public WebElement getNewCheck() {
		return newCheck;
	}

	public WebElement getRenewalCheck() {
		return renewalCheck;
	}

	public WebElement getReinstatedCheck() {
		return reinstatedCheck;
	}

	public WebElement getCalenderSelect() {
		return calenderSelect;
	}

	public WebElement getCalenderStartDate() {
		return calenderStartDate;
	}

	public WebElement getCalenderEndDate() {
		return calenderEndDate;
	}

	public WebElement getSelectAllMembershipProgram() {
		return selectAllMembershipProgram;
	}

	public WebElement getSelectAllMembershipLevels() {
		return selectAllMembershipLevels;
	}

	public WebElement getSelectAllCampaigns() {
		return selectAllCampaigns;
	}

	public WebElement getSelectAllAppeals() {
		return selectAllAppeals;
	}

	public WebElement getSelectAllFunds() {
		return selectAllFunds;
	}

	public WebElement getSelectAllPurposes() {
		return selectAllPurposes;
	}

	public WebElement getSelectAllTerritory() {
		return selectAllTerritory;
	}

	public WebElement getSelectRegions() {
		return selectRegions;
	}

	public WebElement getSelectAllCountries() {
		return selectAllCountries;
	}

	public WebElement getSelectAllStates() {
		return selectAllStates;
	}

	public WebElement getSearchConstituentsBox() {
		return searchConstituentsBox;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getExportBtn() {
		return exportBtn;
	}

	public WebElement getNoRecordFoundMsg() {
		return noRecordFoundMsg;
	}

	public static class AddMembership{
		public AddMembership() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfo;
		
		@FindBy(xpath="//button[.=' Important Dates ']")
		private WebElement selectImpDates;
		
		@FindBy(xpath="//button[.=' Gift Membership - Benefactor - Given By ']")
		private WebElement selectGivenBy;
		
		@FindBy(xpath=" Membership Benefits - Beneficiary - Benefits used by  ")
		private WebElement selectBenifitsUsedBy;		
		
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfo;
		
		@FindBy(xpath="//button[.=' Payment Information ']")
		private WebElement selectPaymentInfo;
		
		@FindBy(xpath="//label[text()='Select Person ']//following-sibling::div//input")
		private WebElement selectPerson;
		
		@FindBy(xpath="//label[text()='Program ']//following-sibling::div//select")
		private WebElement selectProgram;
		
		@FindBy(xpath="//label[text()='Level ']//following-sibling::div//select")
		private WebElement selectLevel;		

		@FindBy(xpath="//label[text()='Amount(CAD):']//following-sibling::div/input")
		private WebElement selectAmountCAD;
		
		@FindBy(xpath="//label[text()='Exchange Rate(CAD to ):']//following-sibling::div/input")
		private WebElement selectExchangeRateCAD;
		
		@FindBy(xpath="//label[text()='Amount() ']//following-sibling::div/input")
		private WebElement selectAmount;
		
		@FindBy(xpath="//label[text()='Status ']//following-sibling::div//select")
		private WebElement selectStatus;
		
		@FindBy(xpath="//i[@class='fa fa-calendar']//ancestor::div//label[text()='Inception Date ']")
		private WebElement selectInceptionDate;
		
		@FindBy(xpath="//i[@class='fa fa-calendar']//ancestor::div//label[text()='Start Date ']")
		private WebElement selectStartDate;
		
		@FindBy(xpath="//i[@class='fa fa-calendar']//ancestor::div//label[text()='Expiry Date ']")
		private WebElement selectExpDate;

		@FindBy(xpath="//i[@class='fa fa-calendar']//ancestor::div//label[text()='Renewal Start Date ']")
		private WebElement selectRenewalDate;

		@FindBy(xpath="//i[@class='fa fa-calendar']//ancestor::div//label[text()='Lapse Date (Grace Period End) ']")
		private WebElement selectLapseDate;
		
		@FindBy(xpath="//label[.='Select Benefactor']//following-sibling::div//input")
		private WebElement selectBenefactor;
		
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
		
		@FindBy(xpath="//label[.='Purpose:']//following-sibling::div//select")
		private WebElement purpose;
		
		@FindBy(xpath="//label[.='Appeal:']//following-sibling::div//select")
		private WebElement appeal;
		
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;
		
		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement sourceMethod;
		
		@FindBy(xpath="(//label[.='Solicitor']//following-sibling::div//input")
		private WebElement solicitor;
		
		@FindBy(xpath="//label[text()='Payment Method ']//following-sibling::div//select")
		private WebElement paymentMethod;
		
		@FindBy(id="is_paid")
		private WebElement isPaidCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
		//Getters for WebElements
		public WebElement getSelectBasicInfo() {
			return selectBasicInfo;
		}

		public WebElement getSelectImpDates() {
			return selectImpDates;
		}

		public WebElement getSelectGivenBy() {
			return selectGivenBy;
		}

		public WebElement getSelectBenifitsUsedBy() {
			return selectBenifitsUsedBy;
		}

		public WebElement getSelectAdditionalInfo() {
			return selectAdditionalInfo;
		}

		public WebElement getSelectPaymentInfo() {
			return selectPaymentInfo;
		}

		public WebElement getSelectPerson() {
			return selectPerson;
		}

		public WebElement getSelectProgram() {
			return selectProgram;
		}

		public WebElement getSelectLevel() {
			return selectLevel;
		}

		public WebElement getSelectAmountCAD() {
			return selectAmountCAD;
		}

		public WebElement getSelectExchangeRateCAD() {
			return selectExchangeRateCAD;
		}

		public WebElement getSelectAmount() {
			return selectAmount;
		}

		public WebElement getSelectStatus() {
			return selectStatus;
		}

		public WebElement getSelectInceptionDate() {
			return selectInceptionDate;
		}

		public WebElement getSelectStartDate() {
			return selectStartDate;
		}

		public WebElement getSelectExpDate() {
			return selectExpDate;
		}

		public WebElement getSelectRenewalDate() {
			return selectRenewalDate;
		}

		public WebElement getSelectLapseDate() {
			return selectLapseDate;
		}

		public WebElement getSelectBenefactor() {
			return selectBenefactor;
		}

		public WebElement getBenefitsDeclinedCheck() {
			return benefitsDeclinedCheck;
		}

		public WebElement getSelectBeneficiary() {
			return selectBeneficiary;
		}

		public WebElement getCampaign() {
			return campaign;
		}

		public WebElement getEvent() {
			return event;
		}

		public WebElement getFund() {
			return fund;
		}

		public WebElement getPurpose() {
			return purpose;
		}

		public WebElement getAppeal() {
			return appeal;
		}

		public WebElement getSource() {
			return source;
		}

		public WebElement getSourceMethod() {
			return sourceMethod;
		}

		public WebElement getSolicitor() {
			return solicitor;
		}

		public WebElement getPaymentMethod() {
			return paymentMethod;
		}

		public WebElement getIsPaidCheck() {
			return isPaidCheck;
		}

		public WebElement getAddBtn() {
			return addBtn;
		}
	}
	
}
