package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Model.dbConModel;
import Model.bookInLysanderModel;

@WebServlet(name = "deleteBookingController", value = "/deleteBookingController")
public class deleteBookingController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //bookInLysanderModel modObj = new bookInLysanderModel();
        String delete = request.getParameter("id");
        dbConModel objdbcon = new dbConModel();

        objdbcon.deleteBooking(delete);
        request.getRequestDispatcher("HomePage.jsp");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    }