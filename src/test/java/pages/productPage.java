package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productPage {

    By product = By.cssSelector("a[href=\"https://www.n11.com/urun/samsung-galaxy-m12-duos-128-gb-samsung-turkiye-garantili-2002230?magaza=shop11\"]");
    By checkProductPage = By.cssSelector(".product-alarm");
    By filter = By.cssSelector("#unfDetailForm > div.unf-p-sku-slct > ul:nth-child(2) > li:nth-child(1)");
    By close = By.id("shareWinTooltipClose");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void chooseProduct(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(product));
        driver.findElement(product).click();
    }
    public void checkProductPage(){
        driver.findElement(checkProductPage);
    }
    public void chooseFilter(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(close));
        driver.findElement(close).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(filter));
        driver.findElement(filter).click();


    }
}
