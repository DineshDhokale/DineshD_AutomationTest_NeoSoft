package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    WebElement dresses;

    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    WebElement summerDresses;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement viewList;



    @FindBy(xpath = "//a[contains(@href,'/color-blue') or @title='Blue']")
    WebElement blueColor;
  /*  @FindBy(xpath = "//input[@class=\"color-option  \" and @type=\"button\" and @style='background: #5D9CEC;']")
    WebElement blueColor;*/

    @FindBy(xpath = "//span[@class='available-now']")
    WebElement inStock;

    @FindBy(xpath = "(//a[@class='quick-view'])[1]")
    WebElement quickView;

    @FindBy(xpath = "//button[@class='btn btn-default btn-facebook']")
    WebElement shareFb;

    @FindBy(xpath = "(//*[text()='Facebook'])[1]")
    WebElement verifyFb;

    @FindBy(xpath = "//a[@title='Close']")
    WebElement closePopup;

    @FindBy(xpath = "(//a[@class='product-name' and @itemprop='url'])[1]")
    WebElement productSelection;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantities;

    @FindBy(xpath = "//a[@name='Blue']")
    WebElement blueColorSelected;

    @FindBy(xpath = "//a[@id='wishlist_button']")
    WebElement addToWishList;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;


    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    WebElement summaryProceedToCheckout;

    @FindBy(xpath = "//button[@name='processAddress']")
    WebElement addressProceedToCheckout;

    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement shippingProceedToCheckout;


    @FindBy(xpath = "//span[@id='total_price']")
    WebElement totalPrice;

    @FindBy(xpath = " //ul[@class='address first_item item box']")
    WebElement VerifyDeliveryAddress;

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement checkoutConfirmation;

    @FindBy(xpath = "//a[@class='account']")
    WebElement viewMyCustomerAccount;

    @FindBy(xpath = "//span[contains(text(),'My wishlists')]")
    WebElement myWishList;

    @FindBy(xpath = "(//table[@class='table table-bordered']//tr)[2]")
    WebElement verifyAddedProductinWhishList;


    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getDresses() {
        return dresses;
    }

    public WebElement getSummerDresses() {
        return summerDresses;
    }

    public WebElement getViewLists() {
        return viewList;
    }

    public WebElement getBlueColor() {
        return blueColor;
    }

    public WebElement getInStock() {
        return inStock;
    }

    public WebElement getQuickView() {
        return quickView;
    }

    public WebElement getShareFb() {
        return shareFb;
    }

    public WebElement getVerifyFb() {
        return verifyFb;
    }

    public WebElement getClosePopup() {
        return closePopup;
    }

    public WebElement getProductSelection() {
        return productSelection;
    }

    public WebElement getQuantities() {
        return quantities;
    }


    public WebElement getBlueColorSelected() {
        return blueColorSelected;
    }

    public WebElement getAddToWishList() {
        return addToWishList;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

    public WebElement getSummaryProceedToCheckout() {
        return summaryProceedToCheckout;
    }

    public WebElement getAddressProceedToCheckout() {
        return addressProceedToCheckout;
    }

    public WebElement getShippingProceedToCheckout() {
        return shippingProceedToCheckout;
    }



    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getVerifyDeliveryAddress() {
        return VerifyDeliveryAddress;
    }

    public WebElement getCheckoutConfirmation() {
        return checkoutConfirmation;
    }

    public WebElement getViewMyCustomerAccount() {
        return viewMyCustomerAccount;
    }

    public WebElement getMyWishList() {
        return myWishList;
    }

    public WebElement getVerifyAddedProductinWhishList() {
        return verifyAddedProductinWhishList;
    }



















}
