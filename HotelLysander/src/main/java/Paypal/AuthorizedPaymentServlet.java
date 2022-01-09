package Paypal;

import com.paypal.base.rest.PayPalRESTException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "AuthorizedPaymentServlet", value = "/AuthorizedPaymentServlet")
public class AuthorizedPaymentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String paymentAmount = request.getParameter("paymentAmount");


        OrderDetails orderDetail = new OrderDetails(paymentAmount);

        try {
            PaymentServices paymentServices = new PaymentServices();
            String approvalLink = null;
            try {
                approvalLink = paymentServices.authorizePayment(orderDetail);
            } catch (PayPalRESTException e) {
                e.printStackTrace();
            }

            response.sendRedirect(approvalLink);

        } catch (Exception ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("Error.html").forward(request, response);
        }
    }

}

