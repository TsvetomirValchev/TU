public class BookNotInLibraryException extends Exception{

    public String getMessage(){
        return "There is no such book in the Library";
    }
}
