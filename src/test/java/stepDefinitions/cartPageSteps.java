package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {
    cartPage cartPage = new cartPage(DriverFactory.getDriver());



    @When("Click add to cart")
    public void clickAddToCart() {
        cartPage.addToCart();
    }

    @When("Go to cart")
    public void goToCart() {
        cartPage.goToCart();
    }

    @Then("Check product at cart")
    public void checkProductAtCart() {
        cartPage.productCheck();
    }

    @When("Delete product")
    public void deleteProduct() {
        cartPage.deleteProduct();
    }

    @Then("Check delete")
    public void checkDelete() {
        cartPage.checkEmptyCart();
    }


}
