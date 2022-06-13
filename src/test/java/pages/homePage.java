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
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(home));
        driver.findElement(home);
    }

    public void searchProduct(String string){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(search));
        driver.findElement(search).sendKeys(string);
    }
    public void clickSearchButton(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(button));
        driver.findElement(button).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(searchButton));
        driver.findElement(searchButton).click();
    }
    public void checkSearchPage(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkSearchPage));
        driver.findElement(checkSearchPage);

    }


    }




