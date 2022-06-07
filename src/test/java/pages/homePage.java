package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class homePage {
    By home = By.cssSelector(".menuTitle.nobg");
    By search = By.id("searchData");
    By searchButton = By.cssSelector(".searchBtn");

    By checkSearchPage = By.cssSelector(".listOptionHolder.darkListOpt");
    By button = By.cssSelector(".dn-slide-buttons.horizontal .dn-slide-deny-btn");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void homePage(){
        driver.get("https://www.n11.com/");
    }
    public void checkHomePage() {
        driver.findElement(home);
    }

    public void searchProduct(String string){
        driver.findElement(search).sendKeys(string);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickSearchButton(){
        driver.findElement(button).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkSearchPage(){
        driver.findElement(checkSearchPage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    }




