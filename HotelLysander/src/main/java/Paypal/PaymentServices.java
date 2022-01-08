package Paypal;

import java.util.*;

import com.paypal.api.payments.*;
import com.paypal.base.rest.*;

public class PaymentServices {

    private static final String CLIENT_ID = "AQrJCaXJaJAY8CbvwgDTy7UV-wcxonZNkiIqA0zvepLbY_QwfTUgf7XuUdNR9qq5evrOvvMrkvqUUUXn";
    private static final String CLIENT_SECRET = "EJoPXZQx4cib5MHT4MVhyhgKSmzcfUDx4EwzFOqqxPMhJ9SchH32qGK8TsQyf20QId8zCIqE2Uu86Ooa";
    private static final String MODE = "sandbox";
    private String approvalLink;

    public String authorizePayment(OrderDetails orderDetail)
            throws PayPalRESTException {

        Payer payer = getPayerInformation();
        RedirectUrls redirectUrls = getRedirectURLs();
        List<Transaction> listTransaction = getTransactionInformation(orderDetail);

        Payment requestPayment = new Payment();
        requestPayment.setTransactions(listTransaction);
        requestPayment.setRedirectUrls(redirectUrls);
        requestPayment.setPayer(payer);
        requestPayment.setIntent("authorize");

        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);

        Payment approvedPayment = requestPayment.create(apiContext);

        return getApprovalLink(approvedPayment);

    }

    private Payer getPayerInformation() {
        Payer payer = new Payer();
        payer.setPaymentMethod("paypal");

        PayerInfo payerInfo = new PayerInfo();
        payerInfo.setFirstName("Hotel")
                .setLastName("Lysander")
                .setEmail("hotellysanderinfo@gmail.com");

        payer.setPayerInfo(payerInfo);

        return payer;

    }

    private RedirectUrls getRedirectURLs() {
        RedirectUrls redirectUrls = new RedirectUrls();
        redirectUrls.setCancelUrl("http://localhost/HotelLysander/bookInLysanderRate.html");
        redirectUrls.setReturnUrl("http://localhost/HotelLysander/ReviewPaypalServlet");

        return redirectUrls;
    }

    public Payment getPaymentDetails(String paymentId) throws PayPalRESTException{
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);
        return Payment.get(apiContext, paymentId);
    }

    public Payment executePayment(String paymentId, String payerId)
    {
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(payerId);

        Payment payment = new Payment().setId(paymentId);
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);

        try {
            return payment.execute(apiContext,paymentExecution);
        } catch (PayPalRESTException e) {
            e.printStackTrace();
        }
    }

    private List<Transaction> getTransactionInformation(OrderDetails orderDetail) {
        Details details = new Details();
        details.setPaymentAmount(OrderDetails.getPaymentAmount());

        Amount amount = new Amount();
        amount.setCurrency("LKR");
        amount.setTotal(OrderDetails.getPaymentAmount());
        amount.setDetails(details);

        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setDescription("Hotel Lysander");

        ItemList itemList = new ItemList();
        List<Item> items = new ArrayList<Item>();

        Item item = new Item();
        item.setCurrency("LKR")
                .setPrice(orderDetail.getPaymentAmount())
                .setQuantity("1");

        items.add(item);
        itemList.setItems(items);
        transaction.setItemList(itemList);

        List<Transaction> listTransaction = new ArrayList<Transaction>();
        listTransaction.add(transaction);

        return listTransaction;
    }

    private String getApprovalLink(Payment approvedPayment) {
        List<Links> links = approvedPayment.getLinks();

        for (Links link : links)
        {
            if (link.getRel().equalsIgnoreCase("approval_url")){
                approvalLink  = link.getHref();
            }
        }
        return approvalLink;
    }



}
