
package hellocucumber.transforms;

import cucumber.api.Transformer;
import hellocucumber.util.Money;

public class moneyConverter extends Transformer<Money>
{
    public Money transform (String amount)
    {
        String[] numbers = amount.substring(1).split("\\.");

        int dollars = Integer.parseInt(numbers[0]);
        int cents = Integer.parseInt(numbers[1]);

        return new Money(dollars, cents);
    }
}
