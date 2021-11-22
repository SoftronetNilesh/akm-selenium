package testSuite;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.FundingPartnersHomePage;
import Pages.LoginPage;
import Pages.ProgramsHomePage;
import Pages.ProgramsHomePage.AddMembershipProgram;
import Pages.FundingPartnersHomePage.AddFundingPartner;
import Pages.FundingPartnersHomePage.EditFundingPartner;
import Pages.FundingPartnersHomePage.EditFundingPartnerHome;
import Pages.HomePage;

public class ProgramTestSuite extends BaseClass {

	public ProgramTestSuite() {
		super();
	}
	LoginPage loginPage;
	HomePage homePage;
	ProgramsHomePage programsHomePage;
	AddMembershipProgram addMembershipProgram;
	@BeforeMethod
	public void setup() {
		initialisation();
		loginPage=new LoginPage();
		loginPage.login();
		homePage= new HomePage();
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",homePage.getProgramsTab());
		programsHomePage= homePage.clickProgramsTab();
	}
	@Test(enabled=true)
	public void verifyProgramHomePageContents() {
		Assert.assertEquals(true, programsHomePage.getProgramsModule().isDisplayed());
		Assert.assertEquals(true, programsHomePage.getSearchBox().isDisplayed());
		Assert.assertEquals(true, programsHomePage.getAddMembershipProgramBtn().isDisplayed());
	}
	
	@Test(enabled = true)
	public void verifyAddNewProgramDetails(){
		addMembershipProgram=programsHomePage.clickAddPrograms();
		wait.until(ExpectedConditions.visibilityOf(addMembershipProgram.getDescription()));
		Assert.assertEquals(true, addMembershipProgram.getName().isDisplayed());
		Assert.assertEquals(true, addMembershipProgram.getDescription().isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(addMembershipProgram.getInactiveCheckbox()));
		Assert.assertEquals(true, addMembershipProgram.getInactiveCheckbox().isDisplayed());
		Assert.assertEquals(true, addMembershipProgram.getAddButton().isDisplayed());
	}
	
	
	@Test
	public void addNewMembershipProgams() {
		addMembershipProgram=programsHomePage.clickAddPrograms();
		wait.until(ExpectedConditions.visibilityOf(addMembershipProgram.getName()));
		addMembershipProgram.getName().sendKeys("Test Mmbership Program1");
		wait.until(ExpectedConditions.visibilityOf(addMembershipProgram.getDescription()));
		addMembershipProgram.getDescription().sendKeys("Description");
		addMembershipProgram.getAddButton().click();

	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
