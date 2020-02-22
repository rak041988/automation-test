package com.selenium.mavenit.step_def;

import com.selenium.mavenit.page_object.HomePage;
import com.selenium.mavenit.page_object.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterSteps {

    private ResultsPage resultsPage = new ResultsPage();


    @When("^I apply filter review \"([^\"]*)\"$")
    public void i_apply_filter_review(String filter) {
        resultsPage.selectFilter(filter);
    }

    @Then("^I should be able to see product rating \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_review(double expected) {
        List<Double> actual = resultsPage.getProductRating();
        assertThat(actual, everyItem(is(greaterThanOrEqualTo(expected))));
    }
}
