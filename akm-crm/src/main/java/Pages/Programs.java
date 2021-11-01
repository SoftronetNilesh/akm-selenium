package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Programs extends BaseClass {

	public Programs() {

		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//app-sidebar-nav-link-content[normalize-space()='Programs']")
	private WebElement ProgramsModuleLink;

	@FindBy(xpath = " //input[@placeholder='Search']")
	private WebElement SearchBox;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddMembershipProgram;

	//Getters for WebElements
	public WebElement getProgramsModuleLink() {
		return ProgramsModuleLink;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getAddMembershipProgram() {
		return AddMembershipProgram;
	}

	public static class AddMembershipProgram{

		public AddMembershipProgram() {
			super();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//label[text()='Name:']//following-sibling::div//input")
		private WebElement Name;

		@FindBy(xpath = "//label[text()='Description:']//following-sibling::div")
		private WebElement Description;

		@FindBy(xpath="//input[@id='is_inactive']") 
		private WebElement InactiveCheckbox;

		@FindBy(xpath = "//button[normalize-space()='Add']")
		private WebElement AddButton;
		
		//Getters for WebElements
		public WebElement getName() {
			return Name;
		}

		public WebElement getDescription() {
			return Description;
		}

		public WebElement getInactiveCheckbox() {
			return InactiveCheckbox;
		}

		public WebElement getAddButton() {
			return AddButton;
		}
	}

	public static class EditProgram{

		public EditProgram() {
			super();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//label[text()='Name:']//following-sibling::div//input")
		private WebElement EditName;

		@FindBy(xpath = "//label[text()='Description:']//following-sibling::div")
		private WebElement EditDescription;

		@FindBy(xpath="//input[@id='is_inactive']") 
		private WebElement EditInactiveCheckbox;

		@FindBy(xpath = "//button[normalize-space()='Update']")
		private WebElement UpdateButton;
		
		//Getters for WebElements
		public WebElement getEditName() {
			return EditName;
		}

		public WebElement getEditDescription() {
			return EditDescription;
		}

		public WebElement getEditInactiveCheckbox() {
			return EditInactiveCheckbox;
		}

		public WebElement getUpdateButton() {
			return UpdateButton;
		}
	}
}
