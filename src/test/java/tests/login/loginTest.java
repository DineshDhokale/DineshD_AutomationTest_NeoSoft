package tests.login;

import java.io.IOException;
import java.nio.file.Paths;

import baseClass.passDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.login.loginPage;




public class loginTest extends passDriver {

	WebDriver driver;
	loginPage lp;
	WebDriverWait wait;
	JavascriptExecutor js;


	public void TestLoginValid(WebDriver driver) throws IOException, Exception {

		this.driver = driver;
		wait = new WebDriverWait(driver, 40);
		js = (JavascriptExecutor) driver;

		lp = new loginPage(driver);

		lp.getSignIn().click();


		js.executeScript("window.scrollBy(0,200)");

		lp.getTxtUserName().sendKeys("dhokale.dinesh516@gmail.com");

		lp.getTxtPassword().sendKeys("dinesh@123");

		lp.getLoginBtn().click();
		//wait.until(ExpectedConditions.visibilityOf(ipp.getRemark()))

		lp.verifypagetitle();


	}
}

