package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CaseHomePage extends BaseClass{
	public CaseHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search")
	private WebElement searchCategory;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;

	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	public static class AddCases{
		public AddCases() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(xpath="//label[text()='Select Constituent']//following-sibling::div//input")
		private WebElement selectConstituent;
		
		@FindBy(xpath="//label[text()='Category:']/following-sibling::div/input")
		private WebElement selectCategory;
		
		@FindBy(xpath="//label[text()='Sub Category:']/following-sibling::div/input")
		private WebElement selectSubCategory;
		
		@FindBy(xpath="//label[text()='Contact Method:']/following-sibling::div/input")
		private WebElement selectContactMethod;
		
		@FindBy(xpath="//label[text()='Priority:']/following-sibling::div/input")
		private WebElement selectPriority;

		@FindBy(xpath="//label[text()='Severity:']/following-sibling::div/input")
		private WebElement selectSeverity;

		@FindBy(xpath="//div[@data-placeholder='Insert text here ...']")
		private WebElement subjectText;	
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
	}
	
	
}
