package testSuite;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.FundingPartnersHomePage;
import Pages.FundingPartnersHomePage.AddFundingPartner;
import Pages.FundingPartnersHomePage.EditFundingPartner;
import Pages.FundingPartnersHomePage.EditFundingPartnerHome;
import Pages.LoginPage;

	public class FundPartnerTestSuite extends BaseClass {

		public FundPartnerTestSuite() {
			super();
		}
		FundingPartnersHomePage fundingPartnersHomePage;
		LoginPage loginPage;
		AddFundingPartner addFundPartner;
		EditFundingPartnerHome editFundingPartnerHome;
		EditFundingPartner editFundingPartner;
		
		@BeforeMethod
		public void setup() {
			initialisation();
			fundingPartnersHomePage=new FundingPartnersHomePage();
			loginPage=new LoginPage();
			addFundPartner=new AddFundingPartner();
			editFundingPartnerHome=new EditFundingPartnerHome();
			editFundingPartner=new EditFundingPartner();
			loginPage.login();
			javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",fundingPartnersHomePage.getFundPartnerLinkTab());
			fundingPartnersHomePage.getFundPartnerLinkTab().click();
		}

		@Test()
		public void verifyAllFieldsFromAddFundingPartnerPage() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(fundingPartnersHomePage.getAddFundingPartnerButton()));
			fundingPartnersHomePage.getAddFundingPartnerButton().click();
			wait.until(ExpectedConditions.visibilityOf(addFundPartner.getFundingPartnerNameField()));
			Assert.assertEquals(addFundPartner.getFundingPartnerNameField().isEnabled(), true);
			Assert.assertEquals(addFundPartner.getFundingPartnerPhoneField().isDisplayed(), true);
			Assert.assertEquals(addFundPartner.getFundingPartnerPhoneField().isEnabled(), true);
			Assert.assertEquals(addFundPartner.getFundingPartnerTaxReceiptCheckbox().isEnabled(), true);
			Assert.assertEquals(addFundPartner.getFundingPartnerTaxReceiptCheckbox().isDisplayed(), true);
			Assert.assertEquals(addFundPartner.getGetFundingPartnerEmailField().isDisplayed(), true);
			Assert.assertEquals(addFundPartner.getGetFundingPartnerEmailField().isEnabled(), true);
			Assert.assertEquals(addFundPartner.getFundPartnerContactNameField().isDisplayed(), true);
			Assert.assertEquals(addFundPartner.getFundPartnerContactNameField().isEnabled(), true);
			Assert.assertEquals(addFundPartner.getAddFundingPartnerSubmitButton().isDisplayed(), true);
			Assert.assertEquals(addFundPartner.getAddFundingPartnerSubmitButton().isEnabled(), true);
		}
		@Test(dependsOnMethods = "verifyAllFieldsFromAddFundingPartnerPage" )
		public void addNewFundPartner() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(fundingPartnersHomePage.getAddFundingPartnerButton()));
			fundingPartnersHomePage.getAddFundingPartnerButton().click();
			wait.until(ExpectedConditions.visibilityOf(addFundPartner.getFundingPartnerNameField()));
			addFundPartner.getFundingPartnerNameField().sendKeys("Test");
			addFundPartner.getFundPartnerContactNameField().sendKeys("Test Name");
			addFundPartner.getFundingPartnerPhoneField().sendKeys("+9172636823682");
			addFundPartner.getGetFundingPartnerEmailField().sendKeys("test@test.com");
			addFundPartner.getAddFundingPartnerSubmitButton().click();
			Assert.assertEquals(fundingPartnersHomePage.verifyFundingPartnerName("Test"), true);
			wait.until(ExpectedConditions.visibilityOf(editFundingPartnerHome.getEditFundingPartnerBtn()));
			editFundingPartnerHome.getEditFundingPartnerBtn().click();
			Assert.assertEquals((editFundingPartnerHome.getName().getText().trim().split(": "))[1], "Test");
			Assert.assertEquals((editFundingPartnerHome.getContact().getText().trim().split(": "))[1], "Test Name");
			Assert.assertEquals((editFundingPartnerHome.getPhone().getText().trim().split(": "))[1], "+9172636823682");
			Assert.assertEquals((editFundingPartnerHome.getEmail().getText().trim().split(": "))[1], "test@test.com");
		}

		@AfterMethod
		public void tearDown(ITestResult result) {
			driver.quit();
		}


}
