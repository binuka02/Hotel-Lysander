package Paypal;

import com.paypal.base.rest.PayPalRESTException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ReviewPaypalServlet", value = "/ReviewPaypalServlet")
public class ReviewPaypalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        private static final long serialVersionUID = 1L;

    public ReviewPaymentServlet() {
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String paymentId = request.getParameter("paymentId");
            String payerId = request.getParameter("PayerID");

            try {
                PaymentServices paymentServices = new PaymentServices();
                Payment payment = paymentServices.getPaymentDetails(paymentId);

                PayerInfo payerInfo = payment.getPayer().getPayerInfo();
                Transaction transaction = payment.getTransactions().get(0);


                request.setAttribute("payer", payerInfo);
                request.setAttribute("transaction", transaction);

                String url = "review.jsp?paymentId=" + paymentId + "&PayerID=" + payerId;

                request.getRequestDispatcher(url).forward(request, response);

            } catch (PayPalRESTException ex) {
                request.setAttribute("errorMessage", ex.getMessage());
                ex.printStackTrace();
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }

    }
