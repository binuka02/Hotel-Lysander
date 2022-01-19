
package controller;

import Model.dbConModel;
import Model.bookInLysanderModel;
import Model.bookInLysanderRateModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bookInLysanderController", urlPatterns = {"/bookInLysanderController"})
public class bookInLysanderController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        //requests from the bookInLysander.jsp
        String Fname = request.getParameter("name");
        String region = request.getParameter("region");
        String checkInDate = request.getParameter("date");
        String checkOutDate = request.getParameter("dateOut");
        String roomType = request.getParameter("roomType");
        String roomsCount = request.getParameter("roomsCount");
        String adultsCount = request.getParameter("adultsCount");
        String kidsCount = request.getParameter("kidsCount");
        String packages = request.getParameter("packages");

        //object and setters to pass the data to **bookInLysanderModel**
        bookInLysanderModel bookLysanderobj = new bookInLysanderModel();
        bookLysanderobj.setFname(Fname);
        bookLysanderobj.setRegion(region);
        bookLysanderobj.setCheckInDate(checkInDate);
        bookLysanderobj.setCheckOutDate(checkOutDate);
        bookLysanderobj.setRoomType(roomType);
        bookLysanderobj.setRoomsCount(roomsCount);
        bookLysanderobj.setAdultsCount(adultsCount);
        bookLysanderobj.setKidsCount(kidsCount);
        bookLysanderobj.setPackages(packages);


        dbConModel obj=new dbConModel();
        try {
            int count=obj.checkBooking(checkInDate,checkOutDate,roomType);

            if(count==30){
                System.out.println("Already booked your preferences try on other one");
                RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                rs.include(request, response);
            }else {
                out.print("<p>Booking Recorded!!!</p>");
                RequestDispatcher rs = request.getRequestDispatcher("SignUpSuccess.html");
                rs.include(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int status=dbConModel.addBooking(bookLysanderobj);
        if(status>0)
        {
            out.print("<p>Booking Recorded!!!</p>");
            RequestDispatcher rs = request.getRequestDispatcher("SignUpSuccess.html");
            rs.include(request, response);
        }
        else
        {
            out.println("Booking not Caputured");
            RequestDispatcher rs = request.getRequestDispatcher("Error.html");
            rs.include(request, response);
        }
        //forward to bookInLysanderRateController

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
