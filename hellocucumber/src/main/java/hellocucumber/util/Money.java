
package hellocucumber.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Money
{
    private int dollars;
    private int cents;

    public Money (String amount)
    {
        Pattern pattern = Pattern.compile("^[^\\d]*([\\d]+)\\.([\\d][\\d])$");
        Matcher matcher = pattern.matcher(amount);

        matcher.find();

        this.dollars = Integer.parseInt(matcher.group(1));
        this.cents = Integer.parseInt(matcher.group(2));
    }

    public Money (int d, int c)
    {
        this.dollars = d;
        this.cents = c;
    }

}
