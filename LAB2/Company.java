public class Company {


   private String name;
   private String date;
   private String Bulstat;

   //GETTERS AND SETTER! - used for privacy and security reasons!
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }
    public void setBulstat(String Bulstat)
    {
        if(Bulstat.length() == 10)
        {
        this.Bulstat = Bulstat;
        }
        else System.out.println("Error! Bulstat is not 10 symbols!");
    }



    public String getBulstat()
    {
           return Bulstat;
    }

    public Company(String name, String date, String Bulstat)
    {
        setName(name);
        setDate(date);
        setBulstat(Bulstat);

    }

    




    public static void main(String[] args)
    {
        CompanyST company1 = new CompanyST("Blozzard", "22.04.1985", "b123456789", "Bobby", 500,2000);
        company1.displayData();
        System.out.println(company1.Winnings());



    }
}