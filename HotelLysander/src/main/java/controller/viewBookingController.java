package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.bookInLysanderModel;
import Model.dbConModel;

@WebServlet(name = "viewBookingController", value = "/viewBookingController")
public class viewBookingController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();

        out.println("<a href='ViewBookings.jsp'></a>");
        out.println("<h1 style=color:'#555555'>Bookings</h1>");
//        String guest = (String) request.getAttribute("guest_Fname");
        String guest="binukx";
        List<bookInLysanderModel> list = null;
        try {
            list = dbConModel.viewBooking(guest);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        out.print("<table border='1' width='100%' bgcolor='yellow'");
        out.print("<tr><th>Check In Date</th><th>Check Out Date</th><th>Adult Count</th><th>Kids Count</th><th>Delete</th></tr>");
        for (bookInLysanderModel o : list) {
            out.print("<tr><td>" + o.getCheckInDate() + "</td><td>" + o.getCheckOutDate() + "</td><td>" + o.getAdultsCount() + "</td><td>" + o.getKidsCount() + "</td><td><a href='deleteBookingController?id="+o.getFname()+"'>Delete</a></td></tr>");
        }
        out.print("</table>");

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
