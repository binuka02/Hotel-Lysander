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

public class SignupMailUtil {

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


    public static String guest_Email;

    public boolean getGuestEmail(String guest_Email)
    {
        this.guest_Email=guest_Email;
        return false;
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) throws AddressException, MessagingException {
        try{

//            UserEmail mailObj=new UserEmail();
//            recepient = mailObj.getGuest_Email();
//            SignupMailUtil.sendMail(user_mail);


            Message message =  new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(guest_Email));
            message.setSubject("Signup Thanks");
            String htmlCode =
                    "<body style=\"background-color: #FFFFFF; margin: 0; padding: 0; -webkit-text-size-adjust: none; text-size-adjust: none;\">\n" +
                    "<table class=\"nl-container\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #FFFFFF;\">\n" +
                    "<tbody>\n" +
                    "<tr>\n" +
                    "<td>\n" +
                    "<table class=\"row row-1\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
                    "<tbody>\n" +
                    "<tr>\n" +
                    "<td>\n" +
                    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000000; width: 520px;\" width=\"520\">\n" +
                    "<tbody>\n" +
                    "<tr>\n" +
                    "<td class=\"column\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 5px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
                    "<table class=\"text_block\" width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
                    "<tr>\n" +
                    "<td>\n" +
                    "<div style=\"font-family: serif\">\n" +
                    "<div style=\"font-size: 12px; font-family: 'Merriwheater', 'Georgia', serif; mso-line-height-alt: 24px; color: #393d47; line-height: 2;\">\n" +
                    "<p style=\"margin: 0; font-size: 12px; text-align: center; mso-line-height-alt: 48px; letter-spacing: 1px;\"><span style=\"font-size:24px;color:#313028;\"><strong>Thank you for choosing us!</strong></span></p>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "<table class=\"text_block\" width=\"100%\" border=\"0\" cellpadding=\"15\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
                    "<tr>\n" +
                    "<td>\n" +
                    "<div style=\"font-family: Verdana, sans-serif\">\n" +
                    "<div style=\"font-size: 12px; font-family: 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Geneva, Verdana, sans-serif; mso-line-height-alt: 14.399999999999999px; color: #393d47; line-height: 1.2;\">\n" +
                    "<p style=\"margin: 0; font-size: 17px; text-align: center; letter-spacing: 1px;\"><span style=\"font-size:16px;\"><em>Your account created successfully.</em></span></p>\n" +
                    "<p style=\"margin: 0; font-size: 17px; text-align: center; letter-spacing: 1px;\"><span style=\"font-size:15px;\">We are honored that you have chosen to stay with us and look forward to providing you with a memorable experience.</span></p>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "<table class=\"image_block\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
                    "<tr>\n" +
                    "<td style=\"width:100%;padding-right:0px;padding-left:0px;\">\n" +
                    "<div align=\"center\" style=\"line-height:10px\"><img class=\"big\" src=\"https://d15k2d11r6t6rl.cloudfront.net/public/users/Integrators/BeeProAgency/757238_740633/editor_images/8ffa1a55-6b1a-415f-8d0f-93a649964524.jpg\" style=\"display: block; height: auto; border: 0; width: 520px; max-width: 100%;\" width=\"520\"></div>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "<table class=\"text_block\" width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
                    "<tr>\n" +
                    "<td>\n" +
                    "<div style=\"font-family: Verdana, sans-serif\">\n" +
                    "<div style=\"font-size: 12px; font-family: 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Geneva, Verdana, sans-serif; mso-line-height-alt: 14.399999999999999px; color: #393d47; line-height: 1.2;\">\n" +
                    "<p style=\"margin: 0; font-size: 12px; text-align: center;\"><span style=\"font-size:14px;\">enjoy your stay in Lysander</span></p>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</table>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</tbody>\n" +
                    "</table>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</tbody>\n" +
                    "</table>\n" +
                    "</td>\n" +
                    "</tr>\n" +
                    "</tbody>\n" +
                    "</table><!-- End -->\n";

            message.setContent(htmlCode, "text/html");
            message.setText("Thanks for Signup");

            return message;



        }
        catch(Exception ex)
        {

        }

        return  null;



    }



}
