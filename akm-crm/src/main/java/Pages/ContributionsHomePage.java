package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ContributionsHomePage extends BaseClass{
	public ContributionsHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Total Contributions Dashboard
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(id="contributionsTab")
	private WebElement contributionsTab;
	
	@FindBy(id="scheduleTab")
	private WebElement scheduleTab;
	
	@FindBy(id="webcontributionsTab")
	private WebElement webcontributionsTab;
	
	@FindBy(xpath="(//option[text()='Life Time']//ancestor::div/select)[1]")
	private WebElement selectCalender;
	
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
	private WebElement calenderStartDate;

	@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
	private WebElement calenderEndDate;
	
	@FindBy(xpath="(//option[text()='All Amounts']//ancestor::div/select)[1]")
	private WebElement allAmount;
	
	@FindBy(xpath="(//*[@placeholder='Min amount'])[1]")
	private WebElement minAmount;

	@FindBy(xpath="(//*[@placeholder='Max amount'])[1]")
	private WebElement maxAmount;
	
	@FindBy(xpath="//button[.='Apply']")
	private WebElement applyBtn;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;	
	
	//Total Contributions
	
	@FindBy(xpath="(//option[text()='Life Time']//ancestor::div/select)[2]")
	private WebElement selectCalender2;
	
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[3]")
	private WebElement calenderStartDate2;

	@FindBy(xpath="(//i[@class='fa fa-calendar'])[4]")
	private WebElement calenderEndDate2;
	
	@FindBy(xpath="(//option[text()='All Amounts']//ancestor::div/select)[2]")
	private WebElement allAmount2;
	
	@FindBy(xpath="(//*[@placeholder='Min amount'])[2]")
	private WebElement minAmount2;

	@FindBy(xpath="(//*[@placeholder='Max amount'])[2]")
	private WebElement maxAmount2;
	
	@FindBy(xpath="//option[text()='All Campaigns']//ancestor::div/select]")
	private WebElement allCampaigns;
	
	@FindBy(xpath="//option[text()='All Funds']//ancestor::div/select")
	private WebElement allFunds;
	
	@FindBy(xpath="//option[text()='All Appeals']//ancestor::div/select")
	private WebElement allAppeals;
	
	@FindBy(xpath="(//button[.='Apply'])[2]")
	private WebElement applyBtn2;
	
	@FindBy(xpath="(//button[.='Clear'])[2]")
	private WebElement clearBtn2;	

	public static class AddContribution{
		public AddContribution() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfoBtn;
	
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfoBtn;
		
		@FindBy(xpath="//button[.=' Recognition ']")
		private WebElement selectRecognitionBtn;
		
		@FindBy(xpath="//button[normalize-space(text())='Tribute - In Memory Of, In Honor Of & Celebration']")
		private WebElement selectTributeBtn;
		
		@FindBy(xpath="//button[normalize-space(text())='Acknowledgement & Tax Receipt']")
		private WebElement selectAcknowledgementBtn;
		
		@FindBy(xpath="//button[.=' Payment Information ']")
		private WebElement selectPaymentInfoBtn;
		
		@FindBy(xpath="//label[text()='Select Person ']//following-sibling::div//input")
		private WebElement selectPerson;
		
		@FindBy(xpath="//label[text()='Type ']//following-sibling::div//select")
		private WebElement selectType;
		
		@FindBy(xpath="//label[text()='Date:']//following-sibling::div//input")
		private WebElement selectDate;
		
		@FindBy(xpath="//label[text()='Territory ']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Currency ']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Amount(CAD):']//following-sibling::div/input")
		private WebElement selectAmountCAD;
		
		@FindBy(xpath="//label[text()='Exchange Rate(CAD to ):']//following-sibling::div//input")
		private WebElement selectExchangeRateCAD;
		
		@FindBy(xpath="//label[text()='Amount ():']//following-sibling::div//input")
		private WebElement Amount;		

		@FindBy(xpath="//label[text()='Notes:']//following-sibling::div//textarea")
		private WebElement Notes;
		
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

		@FindBy(xpath="//label[text()='Funding Partner:']//following-sibling::div//select")
		private WebElement fundingPartner;	
				
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;
		
		@FindBy(xpath="//label[.='Sales Channel:']//following-sibling::div//select")
		private WebElement salesChannel;

		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement solicitorMethod;
		
		@FindBy(xpath="//label[.='Solicitor']//following-sibling::div//input")
		private WebElement solicitor;
		
		@FindBy(id="anonymous")
		private WebElement anonymousCheck;
		
		@FindBy(xpath="//label[.='Recognition Name:']//following-sibling::div//input")
		private WebElement recognitionName;
		
		@FindBy(xpath="//label[.='Special Type:']//following-sibling::div//select")
		private WebElement specialType;
		
		@FindBy(xpath="//label[.='Select acknowledgement email template:']//following-sibling::div//select")
		private WebElement acknowledgementEmail;
		
		@FindBy(id="send_tax_receipt")
		private WebElement sendTaxReceiptCheck;
		
		@FindBy(xpath="//label[text()='Payment Method ']//following-sibling::div//select")
		private WebElement paymentMethod;
		
		@FindBy(id="is_paid")
		private WebElement isPaidCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
	
	}
	
	public static class AddSchedule{
		public AddSchedule() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//button[.=' Basic Information ']")
		private WebElement selectBasicInfoBtn;
	
		@FindBy(xpath="//button[.=' Additional Information ']")
		private WebElement selectAdditionalInfoBtn;
		
		@FindBy(xpath="//button[.=' Recognition ']")
		private WebElement selectRecognitionBtn;
		
		@FindBy(xpath="//button[normalize-space(text())='Tribute - In Memory Of, In Honor Of & Celebration']")
		private WebElement selectTributeBtn;
		
		@FindBy(xpath="//button[.=' Payment Information ']")
		private WebElement selectPaymentInfoBtn;
		
		@FindBy(xpath="//label[text()='Select Person ']//following-sibling::div//input")
		private WebElement selectPerson;
		
		@FindBy(xpath="//label[text()='Type ']//following-sibling::div//select")
		private WebElement selectType;
		
		@FindBy(xpath="//label[text()='Date:']//following-sibling::div//input")
		private WebElement selectDate;
		
		@FindBy(xpath="//label[text()='Territory ']//following-sibling::div//select")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//label[text()='Currency ']//following-sibling::div//select")
		private WebElement selectCurrency;
		
		@FindBy(xpath="//label[text()='Amount(CAD):']//following-sibling::div/input")
		private WebElement selectAmountCAD;
		
		@FindBy(xpath="//label[text()='Exchange Rate(CAD to ):']//following-sibling::div//input")
		private WebElement selectExchangeRateCAD;
		
		@FindBy(xpath="//label[text()='Amount ():']//following-sibling::div//input")
		private WebElement Amount;		

		@FindBy(xpath="//label[text()='Notes:']//following-sibling::div//textarea")
		private WebElement Notes;
		
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

		@FindBy(xpath="//label[text()='Funding Partner:']//following-sibling::div//select")
		private WebElement fundingPartner;	
				
		@FindBy(xpath="//label[.='Source:']//following-sibling::div//select")
		private WebElement source;
		
		@FindBy(xpath="//label[.='Sales Channel:']//following-sibling::div//select")
		private WebElement salesChannel;

		@FindBy(xpath="//label[.='Solicitor Method:']//following-sibling::div//select")
		private WebElement solicitorMethod;
		
		@FindBy(xpath="//label[.='Solicitor']//following-sibling::div//input")
		private WebElement solicitor;
		
		@FindBy(id="anonymous")
		private WebElement anonymousCheck;
		
		@FindBy(xpath="//label[.='Recognition Name:']//following-sibling::div//input")
		private WebElement recognitionName;
		
		@FindBy(xpath="//label[.='Special Type:']//following-sibling::div//select")
		private WebElement specialType;
		
		@FindBy(xpath="//label[text()='Payment Method ']//following-sibling::div//select")
		private WebElement paymentMethod;
		
		@FindBy(id="is_paid")
		private WebElement isPaidCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;		
		
	}
	
}
