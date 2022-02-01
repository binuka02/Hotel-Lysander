package controller;

import Mail.SignupMailUtil;
import Model.dbConModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static Mail.SignupJavaMail.main;
import static java.lang.System.out;
//import javax.persistence.Id;

@WebServlet(name = "signpController", value = "/signpController")
public class signpController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        //Taking the data from the form
//        String guest_Id = request.getParameter("guest_Id");
        String guest_FName = request.getParameter("guest_FName");
        String guest_LName = request.getParameter("guest_LName");
        String guest_Email = request.getParameter("guest_Email");
        String guest_Country = request.getParameter("guest_Country");
        String guest_NIC = request.getParameter("guest_NIC");
        String guest_Phone = request.getParameter("guest_Phone");
        String guest_Username = request.getParameter("guest_Username");




        try {
            dbConModel con = new dbConModel();
            boolean match = con.regUser(guest_FName, guest_LName, guest_Email, guest_Country, guest_NIC, guest_Phone, guest_Username);

            main(null);

            if (match == true) {
                out.println("You have successfully registered!!!");
                RequestDispatcher rs = request.getRequestDispatcher("SignUpSuccess.html");
                rs.include(request, response);
            } else {
                out.println("Your registration failed");
                RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                rs.include(request, response);
            }
        } catch (Exception se) {
            se.printStackTrace();

        }
        try {
            SignupMailUtil.sendMail("UserEmail.getGuest_Email()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
