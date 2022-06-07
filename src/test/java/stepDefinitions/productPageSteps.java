package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {
    productPage productPage = new productPage(DriverFactory.getDriver());


    @When("Choose {int}. product")
    public void chooseProduct(int arg0) {
        productPage.chooseProduct();
    }
    @Then("Check Product Page")
    public void checkProductPage() {
        productPage.checkProductPage();
    }
    @When("Choose filter")
    public void chooseFilter() {
        productPage.chooseFilter();
    }


}
