package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import tests.home.homeTest;
import tests.login.loginTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class passDriver {



    WebDriver driver;
    loginTest lt;
    homeTest ht;
    RemoteWebDriver desiredBrowser;

    static String pathToChromedriver = "C:\\Users\\SONY\\IdeaProjects\\AutomationTest\\resources\\chromedriver.exe";
    static String pathToFirefoxdriver = "C:\\Users\\SONY\\IdeaProjects\\AutomationTest\\resources\\geckodriver.exe";

    @BeforeClass
    public void testSetup()
    {


        System.setProperty("webdriver.chrome.driver", pathToChromedriver);

        //System.setProperty("webdriver.gecko.driver", pathToFirefoxdriver);
        //Instantiating driver object and launching browser

        driver = new ChromeDriver();
       // driver = new FirefoxDriver();


        driver.get("http://automationpractice.com/index.php");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();

    }

   /* @BeforeMethod
    public void openBrowser()
    {
        System.out.println("Before Method----");

    }*/


    @Test(priority = 1)
    public void login() throws Exception {

        lt= new loginTest();
        lt.TestLoginValid(driver);
    }

    @Test(priority = 2)
    public void getDresses() throws Exception {

        ht= new homeTest();
        ht.dresses(driver);

    }



   /* @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method----");
    }
*/

    @AfterClass
    public void afterClass()
    {
        driver.quit();
        System.out.println("After Class");
    }


}
