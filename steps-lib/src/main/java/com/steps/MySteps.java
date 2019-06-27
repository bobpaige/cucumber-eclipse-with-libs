package com.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MySteps {

    @When("^performing a Customer inquiry with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void performingACustomerInquiryWithAnd(String arg1, String arg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^the response contains all of these:$")
    public void theResponseContainsAllOfThese(DataTable arg1) throws Throwable {
        throw new PendingException();
    }

}
