package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FundingPartnersPage extends BaseClass {

	public FundingPartnersPage() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	@FindBy(xpath="//app-sidebar-nav-link-content[normalize-space()='Fund Partners']")
	private WebElement fundPartnerLinkTab;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addFundingPartnerButton;
	
	
	@FindBy(xpath="//label[text()='Name:']//following-sibling::div")
	private WebElement fundingPartnerNameField;
	
	@FindBy(xpath="//label[text()='Contact Name:']//following-sibling::div") 
	private WebElement fundPartnerContactNameField;
	
	@FindBy(xpath="//label[text()='Phone:']//following-sibling::div")
	private WebElement fundingPartnerPhoneField;
	
	@FindBy(xpath="//input[@id='tax_receipt_issued']")
	private WebElement fundingPartnerTaxReceiptCheckbox;
	
	@FindBy(xpath="//input[@id='inactive']")
	private WebElement fundingPartnerInactiveCheckbox;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addFundingPartnerInButton;
	
	
	@FindBy(xpath="//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']")
	private WebElement FundingPartnerErrorPopup;
	
	public static class EditFundingPartner{
		
		public EditFundingPartner() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(css="td:nth-child(1)")
		private WebElement  selectFirstRecord;
		
		@FindBy(xpath="//i[@class='fas fa-pencil-alt']")
		private WebElement updateRecordDetails;
		
		@FindBy(xpath="//button[.=' Add']")
		private WebElement addPartnerCampaignButton;
		
		@FindBy(xpath="//label[text()='Name:']//following-sibling::div")
		private WebElement addFundingPartnerCampaignNameField;
		
		@FindBy(xpath="//label[text()='Start Date:']//following-sibling::div")
		private WebElement campaignStartDate;
		
		@FindBy(xpath="//label[text()='End Date:']//following-sibling::div")
		private WebElement campaignEndDate;
		
		
		@FindBy(xpath="//label[text()='Received Foreign Currency Type:']//following-sibling::div")
		private WebElement receivedCurrencyType;
		
		
		@FindBy(xpath="//label[text()=//label[text()='Received Foreign Currency Amount:']//following-sibling::div")
		private WebElement receivedCurrencyAmount;

		@FindBy(xpath="//input[@id='issue_tax_receipts']")		
		private WebElement taxReceiptIssuedRadio;
		
		@FindBy(xpath="//input[@id='inactive']")
		private WebElement fundingPartnerInactiveRadio;

		@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-valid ng-touched']")		
		private WebElement fundingPartnerCampaignNotes;

		@FindBy(xpath="//a[@id='detailsTab']")
		private WebElement tradersAssociatesDetailsButton;
		
		@FindBy(xpath="//a[@id='campaignTab']")
		private WebElement tradersAssociatesPartnersCampaignDetailsButton;
		
		@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")		
		private WebElement editPartnerCampaignFirstRecordDetailsButton;

		@FindBy(xpath="//button[@class='btn btn-primary ng-star-inserted']")		
		private WebElement updatePartnerCampaignFirstRecordDetailsButton;
	
		
	}
	
}
