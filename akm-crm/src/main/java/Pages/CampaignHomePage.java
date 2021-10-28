package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CampaignHomePage extends BaseClass{
	public CampaignHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search")
	private WebElement search;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchBtn;

	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	
	public static class AddCampaign{
		public AddCampaign() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//label[text()='Name:']//following-sibling::div/input")
		private WebElement name;
		
		@FindBy(xpath="//label[text()='Fiscal Year:']//following-sibling::div/select")
		private WebElement fiscalYear;
		
		@FindBy(xpath="//label[text()='Donation Goal Amount:']//following-sibling::div/input")
		private WebElement donationGoalAmount;
		
		@FindBy(xpath="//label[text()='Pledge Goal Amount:']//following-sibling::div/input")
		private WebElement pledgeGoalAmount;
		
		@FindBy(xpath="//label[text()='Membership Program:']//following-sibling::div/select")
		private WebElement selectMembershipProgram;
		
		@FindBy(xpath="//label[text()='Membership Level:']//following-sibling::div/select")
		private WebElement selectMembershipLevel;
		
		@FindBy(xpath="//label[text()='Fund:']//following-sibling::div/select")
		private WebElement fund;
		
		@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
		private WebElement startDate;
		
		@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
		private WebElement endDate;
		
		@FindBy(xpath="//div[@data-placeholder='Insert text here ...']")
		private WebElement notes;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
	}
}
