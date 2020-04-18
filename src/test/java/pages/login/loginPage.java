package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {
	WebDriver driver;


    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signIn;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement btnLogin;


	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSignIn() {
		return signIn;
	}


	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginBtn() {
		return btnLogin;
	}


	public void  verifypagetitle() {
		   String expected="My account - My Store";
			String actual=driver.getTitle();
		 
		 Assert.assertEquals(expected,actual);
		 
		 System.out.println("login succesfull======== " +actual);
		
	}
}
