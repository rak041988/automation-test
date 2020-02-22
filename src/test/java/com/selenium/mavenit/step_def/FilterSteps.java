package com.selenium.mavenit.step_def;

import com.selenium.mavenit.page_object.HomePage;
import com.selenium.mavenit.page_object.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterSteps {

    private HomePage homPage = new HomePage();
    private ResultsPage resultsPage= new ResultsPage();

    @Given("^I am homepage$")
    public void i_am_homepage() {
        String actual = homPage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String searchTerm) {
        homPage.doSearch(searchTerm);
    }

    @When("^I apply filter review \"([^\"]*)\"$")
    public void i_apply_filter_review(String filter) {
        resultsPage.selectFilter(filter);
    }

    @Then("^I should be able to see refined results review \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_review(String arg1) {
    }
}
