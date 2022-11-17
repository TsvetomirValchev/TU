public class WrongPasswordException extends  Exception {
    public String getMessage()
    {
        return "Please enter a valid Password(at least 11 symbols, use a-z both Lowercase and Uppercase )";
    }
}
