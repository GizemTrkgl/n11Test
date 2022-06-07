package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productPage {

    By product = By.cssSelector("img[data-original=\"https://n11scdn.akamaized.net/a1/140/elektronik/cep-telefonu/samsung-galaxy-m52-5g-128-gb-samsung-turkiye-garantili__1595152399671868.jpg\"]");
    By checkProductPage = By.id("askQuestion");
    By filter = By.cssSelector("span[data-unif-seovalue=\"siyah\"]");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }



    public void chooseProduct(){
        driver.findElement(product).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkProductPage(){
        driver.findElement(checkProductPage);
    }
    public void chooseFilter(){
        driver.findElement(filter).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
