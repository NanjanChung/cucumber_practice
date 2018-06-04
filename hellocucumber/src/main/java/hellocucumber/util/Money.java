
package hellocucumber.util;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Money(String amount){
    
    private int dollars;
    private int cents;
       
    Pattern pattern = Pattern.compile("^[^\\d]*([\\d]+)\\.([\\d][\\d])$");
    Matcher matcher = pattern.matcher(amount);
    matcher.find();
    this.dollars = Integer.parseInt(matcher(group1));
    this.cents = Integer.parseInt(matcher(group2));
    
}
