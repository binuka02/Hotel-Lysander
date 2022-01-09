package Paypal;

import com.paypal.api.payments.Details;

public class OrderDetails extends Details {

    public String paymentAmount;

    public OrderDetails(String paymentAccount)
    {
        super();
        this.paymentAmount = paymentAccount;
    }

    public String getPaymentAmount()
    {
        return paymentAmount;
    }


}
