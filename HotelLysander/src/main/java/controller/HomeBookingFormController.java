package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeBookingFormController", urlPatterns = {"/HomeBookingFormController"})
public class HomeBookingFormController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String cIn=request.getParameter("checkInDate");
        String cOut=request.getParameter("checkOutDate");
        String adCount=request.getParameter("adultsCount");
        String kdCount=request.getParameter("childrensCount");

        request.setAttribute("checkInDate",cIn);
        request.setAttribute("checkOutDate",cOut);
        request.setAttribute("adultsCount",adCount);
        request.setAttribute("childrensCount",kdCount);

        
        RequestDispatcher Brd=request.getRequestDispatcher("bookInLysander.jsp");
        Brd.include(request,response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
