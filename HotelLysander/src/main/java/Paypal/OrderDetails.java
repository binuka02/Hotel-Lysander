package Paypal;



public class OrderDetails{


    public String product;
    public String subtotal;
    public String shipping;
    public String tax;
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

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
