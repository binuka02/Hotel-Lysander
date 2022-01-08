package Paypal;

import com.paypal.api.payments.Details;

public class OrderDetails extends Details {

    public String paymentAmount;

    public OrderDetails(String paymentAccount)
    {
        super();
        this.paymentAmount = paymentAccount;
    }

    public static String getPaymentAmount()
    {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount)
    {
        this.paymentAmount = paymentAmount;
    }
}
