package tests.home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.home.homePage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class homeTest {


    WebDriver driver;
    homePage hp;
    WebDriverWait wait;
    JavascriptExecutor js;
    String mainWindow = null;

    List<WebElement> li = new ArrayList<WebElement>();


    public void dresses(WebDriver driver) throws IOException, Exception {

        this.driver = driver;
        wait = new WebDriverWait(driver, 40);
        js = (JavascriptExecutor) driver;

        hp = new homePage(driver);

        Actions action= new Actions(driver);
        action.moveToElement(hp.getDresses()).perform();

        hp.getSummerDresses().click();       //Then Go to Dresses section (Mouse hover on DRESSES tab - and then click on summer dress submenu which will open up due to mouse over)

        js.executeScript("window.scrollBy(0,200)");

        hp.getViewLists().click();           //Change View mode to list.

        mainWindow = driver.getWindowHandle();


        List<WebElement> productsList =  driver.findElements(By.xpath("//a[@class='product-name' and @itemprop='url']"));

        System.out.println(productsList.size());
        System.out.println(hp.getInStock().getText());
        String verifyInStock=hp.getInStock().getText();
        Assert.assertEquals(verifyInStock,"In stock");
        Assert.assertTrue(hp.getBlueColor().isDisplayed());// which is stock and available in blue color. (Verification should be there to check these pre-conditions)

        for(int i=0;i<productsList.size();i++)
        {
            //Thread.sleep(3000);
            if(hp.getInStock().isDisplayed())
            {
                   WebElement verifiedProduct= productsList.get(i);
                   System.out.println(productsList.get(i));

            }
        }

        js.executeScript("window.scrollBy(0,200)");

        hp.getQuickView().click(); // Then click on Quick View on that product.

        driver.switchTo().frame(0);

        hp.getShareFb().click();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.switchTo().window(tabs.get(1)).getTitle());

        String ActualFbTitle=driver.switchTo().window(tabs.get(1)).getTitle();

        System.out.println(ActualFbTitle);
        Assert.assertEquals( ActualFbTitle,"Facebook");   //After that click on facebook share button. and verify that it's going to facebook site.


        driver.switchTo().window(mainWindow);

        hp.getClosePopup().click();

        driver.switchTo().defaultContent();

        Thread.sleep(2000);

        productsList.get(0).click();

        js.executeScript("window.scrollBy(0,200)");

        hp.getQuantities().clear();
        hp.getQuantities().sendKeys("2");    //Come back to parent window and then select 2 quantities for the product.

        Assert.assertTrue(hp.getBlueColor().isDisplayed());
        hp.getBlueColor().click();

        hp.getAddToWishList().click();         //Add this product to wishlist.

        hp.getClosePopup().click();

        hp.getAddToCart().click();             //Click on Add to cart.

        hp.getProceedToCheckout().click();     //Click on Proceed to checkout.

        js.executeScript("window.scrollBy(0,400)");

        String totalPrice=hp.getTotalPrice().getText();
        Double ExpectedPrice=(28.98*2)+2.00;
        System.out.println(totalPrice);

        String address=hp.getVerifyDeliveryAddress().getText();
        System.out.println(address);                                    // Now in Shopping-cart summary - verify delivery address, product selected and price


        js.executeScript("window.scrollBy(0,400)");

        hp.getSummaryProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");
        hp.getAddressProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");

        hp.getCheckoutConfirmation().click();

        hp.getShippingProceedToCheckout().click();           //Complete checkout process.

        js.executeScript("window.scrollBy(0,400)");

        System.out.println(totalPrice);
        System.out.println("$"+ExpectedPrice);
        Assert.assertEquals( totalPrice,"$"+ExpectedPrice);  // On Order confirmation page, check amount once.


        js.executeScript("window.scrollBy(0,-400)");

        hp.getViewMyCustomerAccount().click();

        hp.getMyWishList().click();

        js.executeScript("window.scrollBy(0,200)");

        Assert.assertTrue(hp.getVerifyAddedProductinWhishList().isDisplayed());   //Go to View my customer account and check whether product has been added to wishlist.

    }
}
