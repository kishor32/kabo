import com.kabo.core.behavior.StepDefinition;
import com.kabo.core.report.Report;
import org.jbehave.core.annotations.Given;

public class xyzz  implements StepDefinition{


    @Given("a system state")
     public void ste(){

        Report.write("ewewe","ewewe", true, this.positive());
    }
}
