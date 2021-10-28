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
           
          }
        
       
      	
}
