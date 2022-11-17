import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private final Pattern pattern;
    private Matcher matcher;


    static final String Password_Pattern = "^[a-zA-z]{11,}$";

    public PasswordValidator()
    {
        pattern = Pattern.compile(Password_Pattern);
    }

    public boolean validatePassword(String CheckedPass)
    {
        matcher = pattern.matcher(CheckedPass);
        return matcher.matches();
    }

}
