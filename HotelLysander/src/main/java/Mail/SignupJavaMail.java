package Mail;

import javax.mail.internet.AddressException;

public class SignupJavaMail {

    public static void main(String args[]) throws AddressException, Exception
    {
        UserEmail mailObj=new UserEmail();
        String user_mail=mailObj.getGuest_Email();
        SignupMailUtil.sendMail(user_mail);
    }
}
