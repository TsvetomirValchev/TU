import java.util.ArrayList;
import java.util.Arrays;

public class URL
{
        String[] URLS1;
        String[] URLS2;

    public URL(String URL)
    {

        URLS1 = URL.split("://",2);
        URLS2 = URLS1[1].split("/",2);

    }


    public void print()
    {
        System.out.println("[protocol]: " + URLS1[0]);
        System.out.println("[server]: " + URLS2[0]);
        System.out.println("[resource]: " + URLS2[1]);

    }


}


