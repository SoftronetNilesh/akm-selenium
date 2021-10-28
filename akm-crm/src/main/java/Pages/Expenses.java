package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Expenses extends BaseClass {
	 
	public Expenses() {
	 super();
 	 PageFactory.initElements(driver, this);
      }
	
	@FindBy(xpath = "//app-sidebar-nav-link-content[normalize-space()='Expenses']")
	   private WebElement ExpensesModuleLink;
	
	@FindBy(xpath = " //input[@placeholder='Search']")
	   private WebElement SearchBox;
    
    @FindBy(xpath = "//button[normalize-space()='Add']")
	   private WebElement AddMeExpense;
    
    public static class AddExpense{

   		public AddExpense() {
   			super();
   			PageFactory.initElements(driver, this);
   		}
   		@FindBy(xpath = "//label[text()='Name:']//following-sibling::div//input")
 	    private WebElement Name;
   		
	
    }
	
}
  // //input[@id='is_inactive'] for checkbox
// //label[text()='Date:']//following-sibling::div//input - date

//label[text()='Notes:']//following-sibling::div//div/div[@data-placeholder="Insert text here ..."] -- Notes