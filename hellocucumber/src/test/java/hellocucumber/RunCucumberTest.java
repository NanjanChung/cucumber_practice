
package hellocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = { "classpath:hellocucumber" }, glue = {
        "hellocucumber.stepdef" }, tags = "not @ignore")
public class RunCucumberTest
{
}