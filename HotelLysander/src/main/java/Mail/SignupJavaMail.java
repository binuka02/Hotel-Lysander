package Mail;

import javax.mail.internet.AddressException;

import static Mail.SignupMailUtil.guest_Email;

public class SignupJavaMail {

    public static void main(String args[]) throws AddressException, Exception
    {
        SignupMailUtil.sendMail(guest_Email);
    }
}
