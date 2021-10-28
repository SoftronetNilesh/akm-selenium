package testSuite;


	import java.io.File;
	import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.FundingPartnersHomePage;
import Pages.LoginPage;

	public class FundPartnerTestSuite extends BaseClass {

		public FundPartnerTestSuite() {
			super();
		}
		FundingPartnersHomePage fundingPartnersHomePage;
		LoginPage loginPage;

		@BeforeMethod
		public void setup() {
			initialisation();
			
			fundingPartnersHomePage=new FundingPartnersHomePage();
			loginPage=new LoginPage();
		}

		@Test()
		public void ProductPurchaseSuccessFlowTest() throws InterruptedException {
			loginPage.login();
			fundingPartnersHomePage.getFundPartnerLinkTab().click();
		}

		@AfterMethod
		public void tearDown(ITestResult result) {
			driver.quit();
		}


}
