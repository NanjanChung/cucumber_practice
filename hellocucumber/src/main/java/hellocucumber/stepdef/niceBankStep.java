
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

	KnowsMyAccount helper;
    
    public niceBankStep() {
    	helper = new KnowsMyAccount();
    }
	
	
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
    
    class CashSlot{
    	
    	private int contents;
    	
    	public int getContents() {
    		return contents;
    	}
    	public void dispense(int dollars) {
    		contents = dollars;
    	}
    }

    class Teller
    {
    	private CashSlot cashSlot;
    	
    	public Teller(CashSlot cashSlot) {
    		this.cashSlot = cashSlot;
    	}
    	
        public void withDrawFrom(Account account, int dollars) {
        	cashSlot.dispense(dollars);
        }
    }
    
   
    class KnowsMyAccount {
    	
    	private Account myAccount;
    	private CashSlot cashSlot;
    	private Teller teller;
    	
	    public Account getMyAccount() {
	    	if (myAccount == null) {
	    		myAccount= new Account();
	    	}
	    	return myAccount;
	    }
	    
	    public CashSlot getCashSlot() {
	    	if (cashSlot == null) {
	    		cashSlot = new CashSlot();
	    	}
	    	return cashSlot;
	    }
	    
	    public Teller getTeller() {
	    	if (teller == null) {
	    		teller = new Teller(cashSlot);
	    	}
	    	return teller;
	    }
	    
    }


    
    @Given("^I have deposit (\\$\\d+\\.\\d+) in my account$")
    public void i_have_deposit_$_in_my_account (@Transform(moneyConverter.class) Money amount)
        throws Exception
    {

        
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }

    @When("^I withdraw \\$(\\d+)$")
    public void i_withDraw_$ (int dollars)
        throws Exception
    {
        helper.getTeller().withDrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed (int dollars)
        throws Exception
    {
        Assert.assertEquals("Incorrect amount dispensed - ", dollars, helper.getCashSlot().getContents());
    }

}