import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;

public class User implements Validator {



    private String nickName;



    private String password;

    public String getNickName()
    {
        return nickName;

    }

    public String getPassword() {
        return password;
    }


    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }




    public User(String nickName, String password) throws NotEmailException
    {
        boolean Valid = checking(nickName);

        if(Valid)
        {
            setNickName(nickName);
            setPassword(password);


        }
        else
        {
            throw new NotEmailException();
        }




    }


    @Override
    public boolean checking(String nickname)
    {
        Matcher m = VALID_EMAIL_ADDRESS_REGEX.matcher(nickname);
        return m.find();
    }

    public static boolean inFile(File f,String nickName,String password) throws IOException
    {
        FileReader r = null;
        BufferedReader br = null;

        try
        {
            r = new FileReader(f);
            br = new BufferedReader(r);

            String line = br.readLine();
            String[] data = line.split("\n");

            for(int i = 0 ; i< data.length; i++)
            {
                if(data[i].equals(nickName + ',' + password))
                {
                    return true;

                }


            }

        }
        catch (IOException e){
            System.out.println("Error in reading file: " +f.getName());
        }
        finally {
            r.close();
            br.close();
        }
        return false;
    }

}
