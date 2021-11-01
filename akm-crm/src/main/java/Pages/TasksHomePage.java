package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class TasksHomePage extends BaseClass{
	public TasksHomePage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tasksTab")
	private WebElement tasksTab;
	
	@FindBy(id="activityTab")
	private WebElement activityTab;
	
	@FindBy(xpath="//option[text()='All Users']//ancestor::div/select")
	private WebElement selectAllUsers;
	
	@FindBy(xpath="//option[text()='All Status']//ancestor::div/select")
	private WebElement selectAllStatus;
	
	@FindBy(xpath="//option[text()='All Related item']//ancestor::div/select")
	private WebElement selectAllRelatedItems;
	
	@FindBy(xpath="//input[@placeholder='Type subject or constituent name']")
	private WebElement searchConstituentsBox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//button[.='Clear']")
	private WebElement clearBtn;	
	
	@FindBy(xpath="//button[.='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[.='Table View']")
	private WebElement tableViewBtn;
	
	@FindBy(xpath="//td[.='No record found']")
	private WebElement noRecordFoundMsg;

	@FindBy(xpath="//button[text()='today']")
	private WebElement selectTodayBtn;
	
	@FindBy(xpath="//button[text()='month']")
	private WebElement selectMonthBtn;
	
	@FindBy(xpath="//button[text()='week']")
	private WebElement selectWeekBtn;
	
	@FindBy(xpath="//button[@aria-label='prev']")
	private WebElement selectPrevious;

	@FindBy(xpath="//button[@aria-label='next']")
	private WebElement selectNext;
	
	@FindBy(xpath="//option[text()='All Items']//ancestor::div/select")
	private WebElement selectAllItems;
	
	@FindBy(xpath="//option[text()='All Type']//ancestor::div/select")
	private WebElement selectAllIType;

	@FindBy(xpath="//option[text()='All Direction']//ancestor::div/select")
	private WebElement selectAllDirection;
	
	@FindBy(name="search")
	private WebElement searchSubjectMsg;
	
	@FindBy(xpath="//button[text()=' Reset ']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//tr/td[text()='No data found']")
	private WebElement noDataFoundMsg;
	
	//Getters for WebElements
	public WebElement getTasksTab() {
		return tasksTab;
	}

	public WebElement getActivityTab() {
		return activityTab;
	}

	public WebElement getSelectAllUsers() {
		return selectAllUsers;
	}

	public WebElement getSelectAllStatus() {
		return selectAllStatus;
	}

	public WebElement getSelectAllRelatedItems() {
		return selectAllRelatedItems;
	}

	public WebElement getSearchConstituentsBox() {
		return searchConstituentsBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getTableViewBtn() {
		return tableViewBtn;
	}

	public WebElement getNoRecordFoundMsg() {
		return noRecordFoundMsg;
	}

	public WebElement getSelectTodayBtn() {
		return selectTodayBtn;
	}

	public WebElement getSelectMonthBtn() {
		return selectMonthBtn;
	}

	public WebElement getSelectWeekBtn() {
		return selectWeekBtn;
	}

	public WebElement getSelectPrevious() {
		return selectPrevious;
	}

	public WebElement getSelectNext() {
		return selectNext;
	}

	public WebElement getSelectAllItems() {
		return selectAllItems;
	}

	public WebElement getSelectAllIType() {
		return selectAllIType;
	}

	public WebElement getSelectAllDirection() {
		return selectAllDirection;
	}

	public WebElement getSearchSubjectMsg() {
		return searchSubjectMsg;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getNoDataFoundMsg() {
		return noDataFoundMsg;
	}

	public static class AddTask{
		public AddTask() {
			// TODO Auto-generated constructor stub
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Subject:']//following-sibling::div/input")
		private WebElement subject;
		
		@FindBy(xpath="//div[@data-placeholder='Insert text here ...']")
		private WebElement description;
		
		@FindBy(xpath="//i[@class='fa fa-calendar']")
		private WebElement selectCalender;
		
		@FindBy(xpath="//label[text()='Creator:']/following-sibling::div/input")
		private WebElement selectCreater;
		
		@FindBy(xpath="//label[text()='Assign To:']/following-sibling::div/select")
		private WebElement selectAssignedTo;
		
		@FindBy(xpath="//label[text()='Status:']/following-sibling::div/select")
		private WebElement selectStatus;
		
		@FindBy(xpath="//label[text()='Constituent']/following-sibling::div//input")
		private WebElement selectConstituent;
		
		@FindBy(xpath="//label[text()='Related To:']/following-sibling::div//select")
		private WebElement selectRelatedTo;
		
		@FindBy(xpath="//label[text()='Notes:']/following-sibling::div//input")
		private WebElement notes;
		
		@FindBy(xpath="//button[.='Add']")
		private WebElement addBtn;
		
		//Getters for WebElements
		public WebElement getSubject() {
			return subject;
		}

		public WebElement getDescription() {
			return description;
		}

		public WebElement getSelectCalender() {
			return selectCalender;
		}

		public WebElement getSelectCreater() {
			return selectCreater;
		}

		public WebElement getSelectAssignedTo() {
			return selectAssignedTo;
		}

		public WebElement getSelectStatus() {
			return selectStatus;
		}

		public WebElement getSelectConstituent() {
			return selectConstituent;
		}

		public WebElement getSelectRelatedTo() {
			return selectRelatedTo;
		}

		public WebElement getNotes() {
			return notes;
		}

		public WebElement getAddBtn() {
			return addBtn;
		}
	}
	
}
