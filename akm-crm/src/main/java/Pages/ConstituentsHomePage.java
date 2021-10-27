package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class ConstituentsHomePage extends BaseClass{
	
	
	public ConstituentsHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//app-sidebar-nav-link-content[normalize-space()='Constituents']")
	private WebElement constituentsLinkTab;
	
	@FindBy(id="dashboardTab")
	private WebElement dashboardTab;
	
	@FindBy(id="constituentTab")
	private WebElement constituentTab;
	
	@FindBy(id="householdTab")
	private WebElement householdTab;
	
	@FindBy(xpath="//option[text()='All Regions']")
	private WebElement selectAllRegion;
	
	@FindBy(xpath="//option[text()='All Countries']']")
	private WebElement selectAllCountries;
	
	@FindBy(xpath="//option[text()='All States']']")
	private WebElement selectAllStates;
	
	@FindBy(xpath="//option[text()='All Territory']']")
	private WebElement selectAllTerritory;
	
	@FindBy(name="search")
	private WebElement speedSearch;
	
	@FindBy(xpath="//button[normalize-space()='Clear']")
	private WebElement clearFilterBtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addHouseholdBtn;

	@FindBy(xpath="//button[normalize-space()='Export']")
	private WebElement exportBtn;
	
	@FindBy(xpath="//td[@class=\"min-td-width-display\"]")
	private WebElement editFirstHouseHoldRecord;
	
	
	
	
	public static class addConstituents{
		
		
		public addConstituents() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Constituent Type']//following-sibling::div")
		private WebElement selectConstituentType;
		
		@FindBy(xpath="//label[text()='Prefix:']//following-sibling::div/input")
		private WebElement prefix;
		
		@FindBy(xpath="//label[text()='Last Name']//following-sibling::div/input")
		private WebElement lastName;
		
		@FindBy(xpath="//label[text()='Middle Name:']//following-sibling::div/input")
		private WebElement middleName;
		
		@FindBy(xpath="//label[text()='First Name']//following-sibling::div/input")
		private WebElement firstName;
		
		@FindBy(xpath="//label[text()='Suffix:']//following-sibling::div/input")
		private WebElement suffix;
		
		@FindBy(xpath="//label[text()='Display Name ']//following-sibling::div/input")
		private WebElement displayName;
		
		@FindBy(xpath="//label[text()='Salutation:']//following-sibling::div/input")
		private WebElement salutation;
		
		@FindBy(xpath="//label[text()='Family Salutation:']//following-sibling::div/input")
		private WebElement familySalutation;
		
		@FindBy(xpath="")
		private WebElement homePhoneCountryCode;
		
		@FindBy(xpath="")
		private WebElement mobilePhoneCountryCode;
		
		@FindBy(xpath="")
		private WebElement workPhoneCountryCode;
		
		@FindBy(xpath="//*[@name='home_phone']")
		private WebElement homePhone;
		
		@FindBy(xpath="//*[@name='mobile_phone']")
		private WebElement mobilePhone;

		@FindBy(xpath="//*[@name='work_phone']")
		private WebElement workPhone;
		
		@FindBy(xpath="//label[text()='Personal Email']//following-sibling::div/input")
		private WebElement email;
		
		@FindBy(xpath="//label[text()='Work Email:']//following-sibling::div/input")
		private WebElement workEmail;
		
		@FindBy(xpath="//label[text()='Street1:']//following-sibling::div/input")
		private WebElement street1;

		@FindBy(xpath="//label[text()='Street2:']//following-sibling::div/input")
		private WebElement street2;
		
		@FindBy(xpath="//label[text()='Street3:']//following-sibling::div/input")
		private WebElement street3;
		
		@FindBy(xpath="//label[text()='City:']//following-sibling::div/input")
		private WebElement city;
		
		@FindBy(xpath="//label[text()='ZIP/Potal Code:']//following-sibling::div/input")
		private WebElement zipCode;

		@FindBy(xpath="//label[text()='Region']/following::select[1]")
		private WebElement selectRegion;
		
		@FindBy(xpath="//label[text()='Country']/following::select[1]")
		private WebElement selectCountry;
		
		@FindBy(xpath="//label[text()='State/Province']/following::select[1]")
		private WebElement selectState;
		
		@FindBy(xpath="//label[text()='Territory']/following::select[1]")
		private WebElement selectTerritory;
		
		
		@FindBy(xpath="//button[text()='Add']")
		private WebElement addConstituencyBtn;
		
		
	}
	
	public static class constituent{
		
		public constituent() {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="profileImage")
		private WebElement editProfileImage;
		
		@FindBy(xpath="")
		private WebElement editPersonalInfo;
		
		@FindBy(xpath="//p//button[@type='button']")
		private WebElement editDonorWall;
		
		@FindBy(xpath="//button[text()='Add Pledge']")
		private WebElement addPledge;
		
		@FindBy(xpath="//button[text()='Add Membership']")
		private WebElement addMembership;
		
		@FindBy(xpath="//button[text()='Add Contribution']")
		private WebElement addContribution;
		
		@FindBy(xpath="//h4[text()='Relationships ']//button[@type='button']")
		private WebElement addRelationship;
		
		@FindBy(xpath="//h4[text()='Household ']//following-sibling::button")
		private WebElement edithouseHold;
		
		@FindBy(xpath="//h4[text()='Labels ']//button[@type='button']")
		private WebElement addLabels;
		
		@FindBy(xpath="//h4[text()='Emails ']//button[@type='button']")
		private WebElement addEmails;
		
		@FindBy(xpath="//h4[text()='Phones ']//button[@type='button']")
		private WebElement addPhones;
		
		@FindBy(xpath="//h4[text()='Addresses ']//button[@type='button']")
		private WebElement addAddress;
		
		@FindBy(xpath="//h4[text()='Constituencies ']//button[@type='button']")
		private WebElement addConstituencies;
		
		@FindBy(xpath="//h4[text()='Documents ']//following-sibling::button[normalize-space()='Upload']")
		private WebElement uploadDocumentBtn;		
		
		@FindBy(xpath="//h4[text()='Notes ']//following-sibling::button")
		private WebElement addNotes;
		
		@FindBy(xpath="//h4[text()='Additional Information ']//following-sibling::button")
		private WebElement addAdditionalInfo;
		
		@FindBy(xpath="//h4[text()='Marketing ']//following-sibling::button")
		private WebElement editMarketing;
		
		@FindBy(xpath="//h4[text()='Social Media ']//following-sibling::button")
		private WebElement addSocialMediaBtn;
		
		@FindBy(xpath="//h4[text()='Photos ']//following-sibling::button[normalize-space()='Upload']")
		private WebElement uploadPhotosBtn;
		
		@FindBy(xpath="//span[text()='Tasks & Activities']")
		private WebElement taskActivitiesSideBtn;
		
		@FindBy(xpath="//span[text()='Change History']")
		private WebElement changeHistorySideBtn;
		
		@FindBy(xpath="//span[text()='Notes']")
		private WebElement notesSideBtn;
		
		@FindBy(xpath="//button[text()='Add Task']")
		private WebElement addTask;
		
		@FindBy(xpath="//button[text()='Add Activity']")
		private WebElement addActivity;
		
		@FindBy(xpath="//button[text()='Send Email']")
		private WebElement sendEmail;
		
		@FindBy(xpath="//button[text()='Send SMS']")
		private WebElement sendSMS;
		
		
		
		
	}
	
	public static class addHousehold{
		
		public addHousehold() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Display Name ']//following-sibling::div/input")
		private WebElement houseHoldName;
		
		@FindBy(xpath="//label[text()='Household Salutation:']//following-sibling::div/input")
		private WebElement salutationName;
		
		@FindBy(xpath="//label[text()='Region']/following::select[1]")
		private WebElement selectRegion;
		
		@FindBy(xpath="//label[text()='Country']/following::select[1]")
		private WebElement selectCountry;
		
		@FindBy(xpath = "//label[text()='Territory']/following::select[1]")
		private WebElement selectTerritory;
		
		@FindBy(xpath="//button[text()='Add']")
		private WebElement addHouseHoldBtn;
		
		
	}
	
}
