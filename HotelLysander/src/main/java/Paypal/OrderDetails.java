package Paypal;

import com.paypal.api.payments.Details;

public class OrderDetails extends Details {


    public String product;
    public String subtotal;
    public String shipping;
    public String tax;
    public String paymentAmount;


    public OrderDetails(String product, String subtotal, String shipping, String tax, String paymentAmount)
    {
        super();
        this.product = product;
        this.subtotal = subtotal;
        this.shipping = shipping;
        this.tax = tax;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentAmount()
    {
        return paymentAmount;
    }

    public String getSubtotal()
    {
        return subtotal;
    }

    public String getShipping()
    {
        return shipping;
    }

    public String getTax()
    {
        return tax;
    }

    public String getProduct()
    {
        return product;
    }


}
