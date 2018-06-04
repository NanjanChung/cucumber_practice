
package hellocucumber.stepdef;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.util.Checkout;

public class CheckOutStep
{
    int bananaPrice;
    int applePrice;
    boolean firstCheck = true;
    Checkout checkout;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c (String name, int price)
        throws Exception
    {
        switch (name) {
            case "banana":
                bananaPrice = price;
                break;
            case "apple":
                applePrice = price;
                break;
            default:
        }
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout (int itemCount, String itemName)
        throws Exception
    {
        if (firstCheck) {
            checkout = new Checkout();
            firstCheck = false;
        }
        switch (itemName) {
            case "banana":
                checkout.add(itemCount, bananaPrice);
                break;
            case "apple":
                checkout.add(itemCount, applePrice);
                break;
            default:
        }

    }

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be_c (int total)
        throws Exception
    {
        assertEquals(total, checkout.total());
    }

}