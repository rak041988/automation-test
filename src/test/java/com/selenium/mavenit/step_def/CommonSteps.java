package com.selenium.mavenit.step_def;

import com.selenium.mavenit.page_object.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class CommonSteps {

    private HomePage homPage = new HomePage();

    @Given("^I am homepage$")
    public void i_am_homepage() {
        String actual = homPage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String searchTerm) {
        homPage.doSearch(searchTerm);
    }
    xkjdfhksjdhf
    dskfjhsdkjf
            \sdkfhksdjf

    
    sdkfhjkjhhfs


}
