package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features/featuresE2E.feature",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/cucumberReport.html"}
)
public class demoBlazeFlowRunner  {

}