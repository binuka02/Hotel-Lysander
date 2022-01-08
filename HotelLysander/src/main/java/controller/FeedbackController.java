package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import static Mail.JavaMail.main;
import Mail.MailUtil;
import Model.dbConFeedback;
import Model.dbConModel;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FeedbackController", value = "/FeedbackController")
public class FeedbackController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Taking the data from the form
        String name = request.getParameter("Name");
        String email_Adress = request.getParameter("Email");
        String subject = request.getParameter("Subject");
        String message = request.getParameter("Message");



        try
        {
            dbConFeedback con = new dbConFeedback();
            boolean rslt=con.getFeedback(name,email_Adress,subject,message);

            main(null);

            if(rslt==true){
                out.println("Your Feedback has Successfully Submited!!!");
                RequestDispatcher rs = request.getRequestDispatcher("FeedbackThanks.html");
                rs.include(request, response);


            }
            else
            {
                out.println("Your Feedback Submission has failed!!!");
                RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                rs.include(request, response);
            }
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }

    }
}
