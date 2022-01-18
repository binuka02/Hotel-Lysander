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




        //String paymentAmount = "20"; //request.getParameter("paymentAmount");
        String product = "ABC";
        String subtotal = "20";
        String shipping = "10";
        String tax = "15";
        String paymentAmount = "100";


        OrderDetails orderDetail = new OrderDetails(product,subtotal,shipping,tax,paymentAmount);

        try {
            PaymentServices paymentServices = new PaymentServices();
            String approvalLink = paymentServices.authorizePayment(orderDetail);
            response.sendRedirect(approvalLink);

            } catch (PayPalRESTException ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("Error.html").forward(request, response);
            }


        }
    }



