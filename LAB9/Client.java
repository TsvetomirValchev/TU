import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String ISBN = null;
        Socket s = new Socket("127.0.0.1", 1211);
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(s.getInputStream());
        PrintStream printout = new PrintStream(s.getOutputStream());
        System.out.println("Enter the ISBN of the book you are searching for: ");
        try{
            ISBN = sc.nextLine();
            printout.println(ISBN);
            String in = sc2.nextLine();
            System.out.println(in);

        }catch (NoSuchElementException e) {
            System.out.println("There is no book with this ISBN");
        }finally {
            if(ISBN != null)
                s.close();
            if(sc!=null)
                sc.close();
            if(sc2!=null)
                sc2.close();
        }
    }
}



