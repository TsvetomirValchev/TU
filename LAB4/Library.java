import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> books = new ArrayList<>();

    public Library() {

    }

    public static void addBook(Scanner scn) throws IncompleteDataException, WrongISBNException, AlreadyExistingISBNException{


        Book book = new Book("null", "null", "null", 0, "0000000000");

        System.out.print("\nEnter the book's title: ");
        book.setTitle(scn.nextLine());
        System.out.print("\nEnter the book's author: ");
        book.setAuthor(scn.nextLine());
        System.out.print("\nEnter the book's publisher: ");
        book.setPublisher(scn.nextLine());
        System.out.print("\nEnter the book's year of publishing: ");
        book.setPublishingYear(Integer.parseInt(scn.nextLine()));
        System.out.print("\nEnter the book's ISBN(has to be exactly 10 symbols): ");
        book.setISBN(scn.nextLine());

        if(books.size()>0) {
            for(Book i : books) {
                if(i.getISBN()==book.ISBN) {
                    throw new AlreadyExistingISBNException();
                }
            }
        }

        if(book.getTitle() == null || book.getAuthor()==null || book.getPublisher()==null || book.getPublishingYear()==0||book.getISBN()==null)
            throw new IncompleteDataException();
        else if(book.getISBN().length()!=10) {
            throw new WrongISBNException();
        }
        else {
            books.add(book);
        }
    }

    public static void searchBookByISBN(String ISBN) throws BookNotInLibraryException{

        boolean isInLibrary = false;

        for(Book i : books) {
            if(Objects.equals(i.getISBN(), ISBN)) {
                System.out.println(i.toString());
                isInLibrary = true;
            }
        }
        if(!isInLibrary) {
            throw new BookNotInLibraryException();
        }
    }
    public static void deleteBookByISBN(String ISBN) throws BookNotInLibraryException{

        boolean isInLibrary = false;

        for(Book i : books) {
            if (Objects.equals(i.getISBN(), ISBN)) {
                isInLibrary = true;
                break;
            }
        }
        if(!isInLibrary) {
            throw new BookNotInLibraryException();
        }
        else {
            books.removeIf(i -> Objects.equals(i.getISBN(), ISBN));
            System.out.println("Book successfully removed");
        }
    }
}
