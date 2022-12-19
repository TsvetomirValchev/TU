
public class NoSuchBookException extends Exception {

    public String getMessage(){
        return "There is no such book in the library.";
    }
}

