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

public class BookingMailUtil {

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


    public static String booking_Email;

    public boolean getBookingEmail(String booking_Email)
    {
        this.booking_Email=booking_Email;
        return false;
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) throws AddressException, MessagingException {
        try{

            Message message =  new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(booking_Email));
            message.setSubject("Booking Created!");
            String htmlCode ="You have successfully created your Booking!<br>Your booking has been confirmed.<br>Now you can do the payment via paypal.";
            message.setContent(htmlCode, "text/html");

            return message;
        }
        catch(Exception ex)
        {

        }

        return  null;



    }

}
