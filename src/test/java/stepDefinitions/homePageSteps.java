package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());

    @Given("Gizem is on Home page")
    public void gizemIsOnHomePage() {homePage.homePage();
    }

    @When("check img")
    public void checkImg() {homePage.checkHomePage();

    }
    @Then("should see Home Page")
    public void shouldSeeHomePage() {homePage.checkHomePage();
    }
    @When("Search {string}")
    public void search(String string) {
        homePage.searchProduct(string);
    }
    @When("Click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }
    @Then("Check search page")
    public void checkSearchPage() {
        homePage.checkSearchPage();
    }

}
