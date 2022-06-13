package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {
    By cartButton = By.cssSelector(".btn.btnGrey.addBasketUnify");
    By cart = By.cssSelector(".icon.iconBasket");
    By cartProduct = By.cssSelector(".sellerInfo--name");
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
        wait.until(ExpectedConditions.presenceOfElementLocated(cartButton));
        driver.findElement(cartButton).click();
    }
    public void goToCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cart));
        driver.findElement(cart).click();
    }

    public void productCheck() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cartProduct));
        driver.findElement(cartProduct);

    }
    public void deleteProduct() {
        driver.findElement(button).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(delete));
        driver.findElement(delete).click();

    }
    public void checkEmptyCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(emptyCart));
        driver.findElement(emptyCart);
    }
}
