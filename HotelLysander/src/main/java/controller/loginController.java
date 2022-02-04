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
        String guest_Fname = request.getParameter("guest_Fname");
        String guest_NIC = request.getParameter("guest_NIC");
        //check matching status of email and nic
        try{
            dbConModel con = new dbConModel();
            boolean match = con.checkLogin(guest_Fname,guest_NIC);
            if(match==true)
            {
                HttpSession session = request.getSession();
                session.setAttribute("guest_Fname", guest_Fname);
                request.setAttribute("guest_Fname", guest_Fname);
               
                //setting session to expiry in 30 mins
                session.setMaxInactiveInterval(60*60);

                System.out.println("You have successfully logged!!!");
                RequestDispatcher lrd = request.getRequestDispatcher("HomePage.jsp");
                lrd.include(request, response);
                //logInfo=true;
            }else
            {
                System.out.println("Email and NIC is not matching");
                RequestDispatcher lrd = request.getRequestDispatcher("LogInPage.jsp");
                lrd.include(request, response);
            }
        }catch(Exception se) {
            se.printStackTrace();
        }

    }
}
