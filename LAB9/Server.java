import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException, NoSuchBookException {
        String ISBN;
        boolean isInLibrary = false;

        ArrayList<Book> library = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "J.K.Rowling", "1234567890");
        Book book2 = new Book("The Witcher", "A. Sapkowski", "0987654321");
        Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "2143567890");
        library.add(book1);
        library.add(book2);
        library.add(book3);

        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        System.out.println("Client connected");
        Scanner sc = new Scanner(socket.getInputStream());
        ISBN = sc.nextLine();
        PrintStream print = new PrintStream(socket.getOutputStream());


        for(Book i : library) {
            if(Objects.equals(i.getISBN(), ISBN)) {
                print.println(i);
                isInLibrary = true;
            }
        }
        if(!isInLibrary) {
            throw new NoSuchBookException();
        }
        server.close();
        sc.close();

    }
}




