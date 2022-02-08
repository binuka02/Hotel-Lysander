package Mail;

import javax.mail.internet.AddressException;

import static Mail.BookingMailUtil.booking_Email;

public class BookingJavaMail {

    public static void main(String args[]) throws AddressException, Exception
    {
        BookingMailUtil.sendMail(booking_Email);
    }
}
