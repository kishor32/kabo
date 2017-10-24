

import com.kabo.core.behavior.StepDefinition;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class GivenStepDefination implements StepDefinition{


    @Given("something")
    public void something(){

        System.out.println("something");

    }

    @When("I do this")
    public void do_this(){

        System.out.println("Do this");
    }

    @Then("that should happened")
    public void assert_what_happened(){

        System.out.println("that should happened");
    }

    @Then("That should happen too.")
    public void oh_some_more_assertion(){

        System.out.println("That should happen too");
    }
}
