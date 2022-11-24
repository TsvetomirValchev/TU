import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AlreadyExistingISBNException, IncompleteDataException, WrongISBNException, BookNotInLibraryException {

        Scanner scanner = new Scanner(System.in);

        String input;

        while(true) {

            System.out.print("\nEnter an action" +
                    "\n(Q to quit, A to add a book to the Library," +
                    "\nS to search for a book in the library," +
                    "\nD to delete a book in the Library):");

            input = scanner.nextLine();

            if(input.equalsIgnoreCase("q")) {
                break;
            }
            else if(input.equalsIgnoreCase("A")){
                Library.addBook(scanner);
            }
            else if(input.equalsIgnoreCase("S")) {
                System.out.print("\nEnter the book's ISBN: ");
                Library.searchBookByISBN(scanner.nextLine());
            }
            else if(input.equalsIgnoreCase("D")) {
                System.out.print("\nEnter the book's ISBN: ");
                Library.deleteBookByISBN(scanner.nextLine());
            }
            else {
                System.out.println("Incorrect input");
            }
        }


        System.out.println("End of program");
    }
}