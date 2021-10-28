package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#email")
	private WebElement email;

	@FindBy(css="#password")
	private WebElement password;

	@FindBy(css = "button.btn.btn-dark.btn-block.sign_btn")
	private WebElement loginButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void login()
	{
		getEmail().sendKeys("nathan@softronet.com");
		getPassword().sendKeys("he9KLxmaesa74AN");
		getLoginButton().click();
	}
}
