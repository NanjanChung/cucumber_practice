
package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs
{
    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c (String arg1, int arg2)
        throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout (int arg1, String arg2)
        throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be_c (int arg1)
        throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}