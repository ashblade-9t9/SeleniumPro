package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles",glue = "stepDefinitions",
plugin = {"pretty", "html:target/HTMLReports/report.html","json:target/JsonReports/report.json"})
public class TestRunner {
}
