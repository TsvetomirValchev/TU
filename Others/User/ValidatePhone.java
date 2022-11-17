import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone  {


    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException
    {

        if(phoneNumber.length()!=10)
        {
            throw new WrongPhoneNumberException();

        }
        else if (!phoneNumber.startsWith("+359"))
        {
            throw new WrongPhoneNumberException();
        }
        else return true;
    }
}
