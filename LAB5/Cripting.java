import javax.sound.midi.Soundbank;

public class Cripting
{
    String[] strings;

    StringBuilder builder;

    public Cripting(String input)
    {
        System.out.println("Input: " + input);
        System.out.println("-----------------------------");

        strings = input.split("TU|tu|Tu|tU");
        builder = new StringBuilder(strings[0]);
        if(strings.length>1)
            for(int i = 0; i<strings.length-1;i++)
            {
                builder.append("?");
                builder.append(strings[i+1]);
            }
        System.out.println("Step1: " + builder);


        for(int i=0;i<strings.length;i++)
        {
            char c = builder.charAt(i);
            builder.setCharAt(i,c);
        }



        for(int j=0;j<builder.length();j++)
        {
                char c = builder.charAt(j);
            for(int i=j+1; i<builder.length();i++)
            {
                char c2 = builder.charAt(i);
            if(c2 == c)
            {
                builder.deleteCharAt(i);

            }



        }
        }

        System.out.println("Step2 " + builder);
        builder.reverse();
        System.out.println("Step3 "+builder);





        }









    }


