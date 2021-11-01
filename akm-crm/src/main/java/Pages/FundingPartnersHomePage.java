package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FundingPartnersHomePage extends BaseClass {
	
	public FundingPartnersHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[normalize-space()='Fund Partners']")
	private WebElement fundPartnerLinkTab;

	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addFundingPartnerButton;

	@FindBy(xpath = "//tbody/tr/td[1]")
	private WebElement editFirstFundingPartnerRecord;
	
	//Getters for WebElements
	public WebElement getFundPartnerLinkTab() {
		return fundPartnerLinkTab;
	}

	public WebElement getAddFundingPartnerButton() {
		return addFundingPartnerButton;
	}

	public WebElement getEditFirstFundingPartnerRecord() {
		return editFirstFundingPartnerRecord;
	}

	public static class addFundingPartner{
		
		public addFundingPartner() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//label[text()='Name:']//following-sibling::div/input")
		private WebElement fundingPartnerNameField;

		@FindBy(xpath="//label[text()='Contact Name:']//following-sibling::div/input") 
		private WebElement fundPartnerContactNameField;

		@FindBy(xpath="//label[text()='Phone:']//following-sibling::div/input")
		private WebElement fundingPartnerPhoneField;

		@FindBy(xpath="//label[text()='Email:']//following-sibling::div/input")
		private WebElement getFundingPartnerEmailField;

		@FindBy(xpath="//input[@id='tax_receipt_issued']")
		private WebElement fundingPartnerTaxReceiptCheckbox;

		@FindBy(xpath="//input[@id='inactive']")
		private WebElement fundingPartnerInactiveCheckbox;

		@FindBy(xpath="//button[normalize-space()='Add']")
		private WebElement addFundingPartnerSubmitButton;

		@FindBy(xpath="//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']")
		private WebElement fundingPartnerErrorPopup;

		@FindBy(xpath="//button[@class='close pull-right']")
		private WebElement closeForm;

		//Getters for WebElements
		public WebElement getFundingPartnerNameField() {
			return fundingPartnerNameField;
		}

		public WebElement getFundPartnerContactNameField() {
			return fundPartnerContactNameField;
		}

		public WebElement getFundingPartnerPhoneField() {
			return fundingPartnerPhoneField;
		}

		public WebElement getGetFundingPartnerEmailField() {
			return getFundingPartnerEmailField;
		}

		public WebElement getFundingPartnerTaxReceiptCheckbox() {
			return fundingPartnerTaxReceiptCheckbox;
		}

		public WebElement getFundingPartnerInactiveCheckbox() {
			return fundingPartnerInactiveCheckbox;
		}

		public WebElement getAddFundingPartnerSubmitButton() {
			return addFundingPartnerSubmitButton;
		}

		public WebElement getFundingPartnerErrorPopup() {
			return fundingPartnerErrorPopup;
		}

		public WebElement getCloseForm() {
			return closeForm;
		}			
	}

	public static class EditFundingPartnerHome{
		
		public EditFundingPartnerHome() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "detailsTab")
		private WebElement detailsTab;

		@FindBy(id="campaignTab")
		private WebElement campaignTab;

		@FindBy(xpath = "//i[@class='fas fa-pencil-alt']")
		private WebElement editFundingPartnerBtn;

		@FindBy(xpath="//button[.=' Add']")
		private WebElement addPartnerCampaignButton;		

		@FindBy(css="td:nth-child(1)")
		private WebElement editFirstRecord;
		
		//Getters for WebElements
		public WebElement getDetailsTab() {
			return detailsTab;
		}

		public WebElement getCampaignTab() {
			return campaignTab;
		}

		public WebElement getEditFundingPartnerBtn() {
			return editFundingPartnerBtn;
		}

		public WebElement getAddPartnerCampaignButton() {
			return addPartnerCampaignButton;
		}

		public WebElement getEditFirstRecord() {
			return editFirstRecord;
		}		
}

	public static class EditFundingPartner{
		
		public EditFundingPartner() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Name:']//following-sibling::div/input")
		private WebElement editName;

		@FindBy(xpath="//label[text()='Contact Name:']//following-sibling::div/input")
		private WebElement editContactName;

		@FindBy(xpath="//label[text()='Phone:']//following-sibling::div/input")
		private WebElement editPhone;

		@FindBy(xpath="//label[text()='Email:']//following-sibling::div/input")
		private WebElement editEmail;

		@FindBy(id = "tax_receipt_issued")
		private WebElement editTaxReciptFlg;

		@FindBy(id="inactive")
		private WebElement editInactiveFlg;

		@FindBy(xpath="//label[text()='Notes:']//following-sibling::div/input")
		private WebElement editNotes;

		@FindBy(xpath = "//div[@class='modal-dialog']//button[@type='button'][normalize-space()='Update']")
		private WebElement updateFundPartnerBtn;
		
		//Getters for WebElements
		public WebElement getEditName() {
			return editName;
		}

		public WebElement getEditContactName() {
			return editContactName;
		}

		public WebElement getEditPhone() {
			return editPhone;
		}

		public WebElement getEditEmail() {
			return editEmail;
		}

		public WebElement getEditTaxReciptFlg() {
			return editTaxReciptFlg;
		}

		public WebElement getEditInactiveFlg() {
			return editInactiveFlg;
		}

		public WebElement getEditNotes() {
			return editNotes;
		}

		public WebElement getUpdateFundPartnerBtn() {
			return updateFundPartnerBtn;
		}
	}


	public static class addFundingPartnerCampaign{
		
		public addFundingPartnerCampaign() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Name:']//following-sibling::div")
		private WebElement addFundingPartnerCampaignName;

		@FindBy(xpath="//label[text()='Contact Name:']//following-sibling::div/input")
		private WebElement addFundingPartnerCampaignContactName;

		@FindBy(xpath="//label[text()='Start Date:']//following-sibling::div/input")
		private WebElement campaignStartDate;

		@FindBy(xpath="//label[text()='End Date:']//following-sibling::div/input")
		private WebElement campaignEndDate;		

		@FindBy(xpath="//label[text()='Received Foreign Currency Type:']//following-sibling::div/input")
		private WebElement receivedCurrencyType;	

		@FindBy(xpath="//label[text()=//label[text()='Received Foreign Currency Amount:']//following-sibling::div/input")
		private WebElement receivedCurrencyAmount;

		@FindBy(id="issue_tax_receipts")		
		private WebElement taxReceiptIssuedFlg;

		@FindBy(id="inactive")
		private WebElement campaignInactiveRadioFlg;

		@FindBy(xpath="//label[text()='Notes:']/following-sibling::div/input")		
		private WebElement CampaignNotes;

		@FindBy(xpath="//button[text()='Add']")		
		private WebElement UpdateCampaignBtn;

		@FindBy(xpath="//*[@id='campaignTab-panel']//i[@class='fas fa-pencil-alt']")
		private WebElement editFirstPartnerCampaign;
		
		//Getters for WebElements
		public WebElement getAddFundingPartnerCampaignName() {
			return addFundingPartnerCampaignName;
		}

		public WebElement getAddFundingPartnerCampaignContactName() {
			return addFundingPartnerCampaignContactName;
		}

		public WebElement getCampaignStartDate() {
			return campaignStartDate;
		}

		public WebElement getCampaignEndDate() {
			return campaignEndDate;
		}

		public WebElement getReceivedCurrencyType() {
			return receivedCurrencyType;
		}

		public WebElement getReceivedCurrencyAmount() {
			return receivedCurrencyAmount;
		}

		public WebElement getTaxReceiptIssuedFlg() {
			return taxReceiptIssuedFlg;
		}

		public WebElement getCampaignInactiveRadioFlg() {
			return campaignInactiveRadioFlg;
		}

		public WebElement getCampaignNotes() {
			return CampaignNotes;
		}

		public WebElement getUpdateCampaignBtn() {
			return UpdateCampaignBtn;
		}

		public WebElement getEditFirstPartnerCampaign() {
			return editFirstPartnerCampaign;
		}
	}
}
