
package hellocucumber.util;

public class Checkout
{
    int total = 0;

    public void add (int count, int price)
    {
        total = total + count * price;
    }

    public int total ()
    {
        return total;
    }
}