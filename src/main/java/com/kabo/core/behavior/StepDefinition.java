package com.kabo.core.behavior;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public interface StepDefinition {


    @Given("a negative scenario")
    @When("a negative scenario")
    @Then("a negative scenario")
    default boolean negative(){

        return true;
    }

    @Given("a positive scenario")
    @When("a positive scenario")
    @Then("a positive scenario")
    default boolean positive(){

        return true;
    }

}
