package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.network.model.ReportingApiReport;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ReportsHomePage extends BaseClass{
	public ReportsHomePage(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="standardReportTab")
	private WebElement standardReportTab;
	
	@FindBy(xpath="//i[@class='fas fa-eye']//ancestor::tr/td[.='Key Metrics - Donors']")
	private WebElement keyMetricsDonorViewBtn;
	
	@FindBy(xpath="//i[@class='fas fa-eye']//ancestor::tr/td[.='Quarterly Report - Members']")
	private WebElement quarterlyReportMembersViewBtn;
	
	@FindBy(xpath="//i[@class='fas fa-eye']//ancestor::tr/td[.='Quarterly Report - Single Member Tier']")
	private WebElement quarterlyReportSingleMemberViewBtn;
	
	@FindBy(xpath="//i[@class='fas fa-eye']//ancestor::tr/td[.='Comprehensive Donor Revenue Analysis']")
	private WebElement comprehensiveDonorRevenueViewBtn;

	@FindBy(xpath="//td[.='Quarterly Report - Pledges']//following-sibling::*")
	private WebElement quarterlyReportViewBtn;
	
	@FindBy(id="constituentTab")
	private WebElement constituentTab;
	
	@FindBy(xpath="//td[.='No record found']")
	private WebElement noRecordFoundMsg;
	
	@FindBy(id="contributionTab")
	private WebElement contributionTab;
	
	@FindBy(xpath="//a[text()='Save current Filter']")
	private WebElement saveCurrentFilterLink;
	
	@FindBy(xpath="//a[text()='Saved Filters']")
	private WebElement savedFiltersLink;
	
	@FindBy(xpath="//a[text()='Advanced Filter']")
	private WebElement advancedFilterLink;
	
	public static class SaveCurrentFilter{
		
		public SaveCurrentFilter(){
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Search Name']//following-sibling::div//input")
		private WebElement searchName;
		
		@FindBy(xpath="//label[text()='Search Description:']//following-sibling::div//textarea")
		private WebElement searchDesc;
		
		@FindBy(id="is_public")
		private WebElement searchAllCheck;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveBtn;
		
		@FindBy(xpath="//button[text()='Cancel']")
		private WebElement cancelBtn;
	}
	
	public static class SavedFilters{
		
		public SavedFilters(){
			super();
			PageFactory.initElements(driver, this);
		}
	}
	
	public static class AdvancedFilter{
		public AdvancedFilter(){
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="contributed_date")
		private WebElement contributedDateCheck;
		
		@FindBy(xpath="//select[@class=\"form-select ng-pristine ng-valid ng-touched\"]")
		private WebElement calenderFilter;
		
		@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
		private WebElement selectFromDate;
		
		@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
		private WebElement selectToDate;
		
		@FindBy(id="contributed_amount")
		private WebElement contributedAmountCheck;
		
		@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine' and @placeholder='Min amount']")
		private WebElement minAmount;
		
		@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine' and @placeholder='Max amount']")
		private WebElement maxAmount;
		
		@FindBy(xpath="//option[.='All Campaigns']/ancestor::select")
		private WebElement allCampaignDrp;

		@FindBy(xpath="//option[.='All Funds']/ancestor::select")
		private WebElement allFundsDrp;

		@FindBy(xpath="//option[.='All Appeals']/ancestor::select")
		private WebElement allAppealsDrp;
		
		@FindBy(xpath="//option[.='All Events']/ancestor::select")
		private WebElement allEventsDrp;

		@FindBy(xpath="//option[.='All Purposes']/ancestor::select")
		private WebElement allPurposeDrp;
		
		@FindBy(xpath="//button[.='Search']")
		private WebElement searchBtn;
			
		@FindBy(xpath="//button[.='Cancel']")
		private WebElement cancelBtn;
		
		@FindBy(id="geography")
		private WebElement geographyCheck;

	}
	
}
