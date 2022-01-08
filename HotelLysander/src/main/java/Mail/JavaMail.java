package Mail;

import javax.mail.internet.AddressException;

public class JavaMail {

    public static void main(String args[]) throws AddressException, Exception
    {
        MailUtil.sendMail("hotellysanderinfo@gmail.com");
    }

}
