public class WrongISBNException extends Exception{

    public String getMessage(){
        return "Incorrect ISBN format. It has to be EXACTLY 10 symbols";
    }
}
