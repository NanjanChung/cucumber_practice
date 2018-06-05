
package hellocucumber.stepdef;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.transforms.moneyConverter;
import hellocucumber.util.Money;

public class niceBankStep
{

    class Account
    {
        private Money balance;

        public void deposit (Money amount)
        {
            balance = amount;
        }

        public Money getBalance ()
        {
            return balance;
        }

    }

    @Given("^I have deposit (\\$\\d+\\.\\d+) in my account$")
    public void i_have_deposit_$_in_my_account (@Transform(moneyConverter.class) Money amount)
        throws Exception
    {
        Account myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance -", amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$ (int arg1)
        throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed (int arg1)
        throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}