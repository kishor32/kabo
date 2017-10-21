

import com.kabo.core.behavior.TestRunner;
import com.kabo.core.report.Report;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class stub  {

    @BeforeTest
    public void  beforeTest(){

        Report.setReport("kabo.html");
    }

    @Test
    public void test1(){

        new TestRunner().runTests(500,new GivenStepDefination());
    }

    @Test
    public void test2(){

        new TestRunner().runTests(500,new xyzz());
    }
}
