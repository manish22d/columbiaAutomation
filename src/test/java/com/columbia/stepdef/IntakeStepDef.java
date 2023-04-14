package com.columbia.stepdef;

import com.columbia.services.BookServices;
import com.columbia.utils.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class IntakeStepDef {
    @Autowired
    ScenarioContext context;

    @Autowired
    BookServices bookServices;

    @Given("user search for claim id {string}")
    public void userSearchForClaimId(String claimId) {
        System.out.println(claimId);
    }

    @When("user updates claim with updated data")
    public void userUpdatesClaimWithUpdatedData(List<Map<String, String>> claimData) {
        System.out.println(claimData);
    }

    @Then("verify update successful banner displayed")
    public void verifyUpdateSuccessfulBannerDisplayed() {
        System.out.println("hello");
    }
}
