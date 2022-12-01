public class NotEmailException extends Exception
{
    public String getMessage()
    {
        return "Username is not an email! ";
    }

}
