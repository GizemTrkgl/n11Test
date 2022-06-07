package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {
    By cartButton = By.cssSelector(".btn.btnGrey.addBasketUnify");
    By cart = By.cssSelector(".icon.iconBasket");
    By cartProduct = By.cssSelector(".prodDescription");

    By delete = By.cssSelector(".removeProd.svgIcon.svgIcon_trash");
    By emptyCart = By.cssSelector(".cartEmptyText");
    By button = By.cssSelector(".btnHolder .btn.btnBlack");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void addToCart() {
        driver.findElement(cartButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void goToCart() {
        driver.findElement(cart).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void productCheck() {
        driver.findElement(cartProduct);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteProduct() {
        driver.findElement(button).click();
        driver.findElement(delete).click();

    }
    public void checkEmptyCart() {
        driver.findElement(emptyCart);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
