package Mail;

import javax.mail.internet.AddressException;

public class SignupJavaMail {

    public static void main(String args[]) throws AddressException, Exception
    {
        SignupMailUtil.sendMail("UserEmail.getGuest_Email()");
    }
}
