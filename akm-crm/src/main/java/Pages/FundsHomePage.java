package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FundsHomePage extends BaseClass {
	
	public FundsHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="search")
	private WebElement searchName;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;

	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	public static class AddFund{
		public AddFund() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(xpath="//label[text()='Fund name:']//following::div/input")
		private WebElement fundName;
		
		@FindBy(xpath="//label[text()='UTM Funds:']//following::div/input")
		private WebElement utmFund;
		
		@FindBy(id="pis_inactive")
		private WebElement pisInactiveCheck;
		
		@FindBy(id="restricted")
		private WebElement restrictedCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
	}
}
