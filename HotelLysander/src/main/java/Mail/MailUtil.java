package Mail;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author Binuka SIlva
 */
public class MailUtil {

    public static void sendMail(String recepient) throws Exception
    {


        System.out.println("Preparing to send email");
        Properties properties = new Properties();

        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");



        String myAccountEmail = "hotellysanderinfo@gmail.com";
        String password = "123456@nsbm";

        Session session = Session.getInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recepient);

        Transport.send(message);
        System.out.println("Message sent Successfully");
    }
    public static String name;
    public static String email_Adress;
    public static String subject;
    public static String message1;

    public boolean getFeedback(String name, String email_Adress, String subject, String message1)
    {
        this.name=name;
        this.email_Adress=email_Adress;
        this.subject=subject;
        this.message1=message1;
        return false;
    }


    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) throws AddressException, MessagingException {
        try{


            Message message =  new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Customer Feedbacks");
            String htmlCode = "<h2>CUSTOMER FEEDBACKS</h2><br><table><tr><td><b>Name</td> :</b><td> "+name+"</td></tr><tr><td><b>Email Address</td> :</b><td> "+email_Adress+"</td></tr><tr><td><b>Subject</td> :</b><td> "+subject+"</td></tr><tr><td><b>Message</td> :</b><td> "+message1+"</td></tr></table>";
            message.setContent(htmlCode, "text/html");


            return message;



        }
        catch(Exception ex)
        {

        }

        return  null;



    }



}
