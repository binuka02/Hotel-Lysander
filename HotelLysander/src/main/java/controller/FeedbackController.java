package controller;

import Mail.MailUtil;
import Model.dbConFeedback;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static Mail.JavaMail.main;
import static java.lang.System.out;

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
            MailUtil mailUtil = new MailUtil();
            boolean rslt=con.getFeedback(name,email_Adress,subject,message);
            boolean feedback=mailUtil.getFeedback(name,email_Adress,subject,message);

            main(null);

            if(rslt==true){
                out.println("Your Feedback has Successfully Submitted!!!");
//                out.println("Feedback has received!");
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
        try {
            MailUtil.sendMail("hotellysanderinfo@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
