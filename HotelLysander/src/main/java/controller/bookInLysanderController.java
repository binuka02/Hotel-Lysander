
package controller;

import Mail.BookingMailUtil;
import Mail.SignupJavaMail;
import Model.bookInLysanderModel;
import Model.dbConModel;
import Bill.BillCalc;

import javax.mail.internet.AddressException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import static Mail.BookingJavaMail.main;
import static java.lang.System.out;

@WebServlet(name = "bookInLysanderController", urlPatterns = {"/bookInLysanderController"})
public class bookInLysanderController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //requests from the bookInLysander.jsp
        String Fname = request.getParameter("name");
        String booking_Email = request.getParameter("booking_Email");
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

        dbConModel obj = new dbConModel();

        int count = 10;
        try {
            BookingMailUtil bookingMailUtil = new BookingMailUtil();
            boolean bookingmail = bookingMailUtil.getBookingEmail(booking_Email);

            count = obj.checkBooking(checkInDate, checkOutDate, roomType);
            System.out.println(count + " Count no");
            main(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (count >= 5) {
            System.out.println("Already booked your preferences try on other one");
            RequestDispatcher rs = request.getRequestDispatcher("BookingCollaspe.html");
            rs.include(request, response);
        } else {
            BillCalc bill = new BillCalc();
            int fee = 10000;
            fee = bill.finalcharge(bookLysanderobj);
            if (fee == 1000) {
                System.out.println("Already booked your preferences try on other one");
                RequestDispatcher rs = request.getRequestDispatcher("BookingCollaspe.html");
                rs.include(request, response);
            } else {
                fee = (int) (fee * 0.2);
                System.out.println("fee from bill calculation " + fee);

                int status = dbConModel.addBooking(bookLysanderobj);
                if (status > 0) {
                    System.out.print("<p>Booking Recorded!!!</p>");
                    request.setAttribute("fee", fee);
                    request.getRequestDispatcher("bookInLysanderRate.jsp").forward(request, response);
                } else {
                    System.out.println("Booking not Caputured");
                    RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                    rs.include(request, response);
                }
            }


        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
