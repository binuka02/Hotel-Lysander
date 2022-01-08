package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import Model.dbConModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginController", value = "/loginController")
public class loginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //apply form inputs in to a getter
        String guest_Email = request.getParameter("guest_Email");
        String guest_NIC = request.getParameter("guest_NIC");

        //check matching status of email and nic
        try{
            dbConModel con = new dbConModel();
            boolean match = con.checkLogin(guest_Email,guest_NIC);
            if(match==true)
            {
                out.println("You have successfully logged!!!");
                RequestDispatcher lrd = request.getRequestDispatcher("HomePage.jsp");
                lrd.include(request, response);
                //logInfo=true;
            }else
            {
                out.println("Email and NIC is not matching");
                RequestDispatcher lrd = request.getRequestDispatcher("LogInPage.html");
                lrd.include(request, response);
            }
        }catch(Exception se) {
            se.printStackTrace();
        }

    }
}
