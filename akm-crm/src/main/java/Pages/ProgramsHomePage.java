package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ProgramsHomePage extends BaseClass {

	public ProgramsHomePage() {

		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".card-body.card_table_body")
	private WebElement ProgramsModule;

	@FindBy(xpath = " //input[@placeholder='Search']")
	private WebElement SearchBox;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddMembershipProgram;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	private WebElement addProgramBtn;
	
	//Getters for WebElements
	public WebElement getProgramsModule() {
		return ProgramsModule;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getAddMembershipProgramBtn() {
		return AddMembershipProgram;
	}

	public WebElement getAddMembershipProgram() {
		return AddMembershipProgram;
	}

	public WebElement getAddProgramBtn() {
		return addProgramBtn;
	}
	
	public AddMembershipProgram clickAddPrograms() {
		addProgramBtn.click();
		return new AddMembershipProgram();
	}

	public static class AddMembershipProgram{

		public AddMembershipProgram() {
			super();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//label[text()='Name:']//following-sibling::div//input")
		private WebElement Name;

		@FindBy(css = ".ql-editor")
		private WebElement Description;

		@FindBy(css=".custom-control.custom-checkbox.custom-control-inline") 
		private WebElement InactiveCheckbox;
		
		@FindBy(xpath = "(//button[normalize-space()='Add'])[2]")
		private WebElement addProgramBtn;
		
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
			return addProgramBtn;
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
