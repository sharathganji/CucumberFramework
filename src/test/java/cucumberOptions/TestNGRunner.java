package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
//re-run scenario:
//@CucumberOptions(features = "@target/failed_scenarios.txt", glue = "stepDefinitions",
//        monochrome = true, dryRun = false,
//        plugin ={"html:target/cucumber.html", "json:target/cucumber.json",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "rerun:target/failed_scenarios.txt.txt"})


//actual scenario
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions",
        monochrome = true, dryRun = false, tags = "@CheckOutItem or @SearchItem",
plugin ={"html:target/cucumber.html", "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
