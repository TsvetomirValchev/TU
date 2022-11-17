public class WrongUserExcpetion extends Exception {

    public String getMessage()
    {
        return "Please enter a valid Username(between 3 and 15 symbols, use a-z lowercase, numbers 0-9, - and _)";
    }
}
