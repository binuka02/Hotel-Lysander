package Paypal;

/**
 *
 * @author Binuka SIlva
 */

public class OrderDetails{


    public String product;
    public float paymentAmount;


    public OrderDetails(String product, String paymentAmount)
    {
        super();
        this.product = product;
        this.paymentAmount = Float.parseFloat(paymentAmount);
    }

    public String getPaymentAmount()
    {
        return String.format("%.2f",paymentAmount);
    }


    public String getProduct()
    {
        return product;
    }

}
