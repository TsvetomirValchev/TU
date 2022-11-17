import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
   private final Pattern pattern;
   private Matcher matcher;

   static final String Username_Pattern = "^[a-z\\d_-]{3,15}$";

   public UsernameValidator()
   {
      pattern = Pattern.compile(Username_Pattern);

   }


   boolean validateUsername(final String CheckedUN)
   {
      matcher = pattern.matcher(CheckedUN);
      return matcher.matches();
   }






}
