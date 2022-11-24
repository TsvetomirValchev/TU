public class AlreadyExistingISBNException extends Exception{

    public String getMessage(){
        return "A book with this ISBN already exists in the Library";
    }
}
