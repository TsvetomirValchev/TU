public class WrongPhoneNumberException extends Exception
{

    public String getMessage() {
        return "Please enter a valid phone number (starts with +359, only numbers and exactly 10 symbols)" ;
    }
}
