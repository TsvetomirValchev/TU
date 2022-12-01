import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NotEmailException {
        Scanner sc = new Scanner(System.in);
        String input;
        while(true) {


            System.out.print("""

                    Enter an action
                    Q to quit,
                    R to register a new user,
                    S to search for a user that exists in the file: """);

            input = sc.nextLine();
            if(input.equalsIgnoreCase("q"))
            {
                break;
            }
            else if(input.equalsIgnoreCase("r")){
                System.out.println("Enter nickname: ");
                String NN = sc.nextLine();
                System.out.println("Enter password: ");
                String pass = sc.nextLine();
                System.out.println("Enter file name: ");
                File f = new File(sc.nextLine());

                User user = new User(NN, pass);

                if (user != null) {

                    addUser(f, user);
                }

            }
            else if(input.equalsIgnoreCase("S")){


                    System.out.println("Enter username for searching.");
                    String searchedUsername = sc.nextLine();
                    System.out.println("Enter password for searching.");
                    String searchedPassword = sc.nextLine();
                    System.out.println("Enter file name: ");
                    File f = new File(sc.nextLine());

                    boolean exists = User.inFile(f, searchedUsername, searchedPassword);
                    if (exists) {
                        System.out.println("exists.");
                    } else {
                        System.out.println("doesn’t exist.");
                    }


            }
            else
            {
                System.out.println("Invalid input.");
            }
        }

        }






    private static void addUser(File f,User u) throws IOException {

        FileWriter fw = new FileWriter(f, true);

        fw.write(u.getNickName()+ ",");
        fw.write(u.getPassword()+"\n");
        fw.flush();




    }
}