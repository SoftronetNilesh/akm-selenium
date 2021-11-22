package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Programs']")
	private WebElement programsTab;
	
	@FindBy(xpath="//a[normalize-space()='Fund Partners']")
	private WebElement fundPartnersTab;

	public WebElement getProgramsTab() {
		return programsTab;
	}

	public WebElement getFundPartnersTab() {
		return fundPartnersTab;
	}
	
	public ProgramsHomePage clickProgramsTab() {
		programsTab.click();
		return new ProgramsHomePage();
	}
}
