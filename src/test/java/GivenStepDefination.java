

import com.kabo.core.behavior.StepDefinition;
import com.kabo.core.report.Report;
import org.jbehave.core.annotations.Given;


public class GivenStepDefination implements StepDefinition{


    @Given("something set")
    public void test12(){

        System.out.println("dbshdbsjd");
        Report.write("test", "des", true, this.positive());
    }

}
