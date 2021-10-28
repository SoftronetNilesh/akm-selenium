package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SourcesHomePage extends BaseClass{
	public SourcesHomePage() {
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
	
	public static class AddSource{
		public AddSource() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(xpath="//label[text()='Source name:']//following-sibling::div//input")
		private WebElement purposeName;
		
		@FindBy(xpath="//label[text()='UTM Sources:']//following-sibling::div//input")
		private WebElement utmCampaign;
		
		@FindBy(id="pis_inactive")
		private WebElement pisInactiveCheck;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
	}
	
	
}
