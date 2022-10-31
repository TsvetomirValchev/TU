public class Person {

    private String name;
    private String birthdate;

    public void setName(String name){this.name=name;}
    public void setBirthdate(String birthdate){this.birthdate=birthdate;}
    public String getName(){return name;}
    public String getBirthdate(){return birthdate;}


    public Person(String name,String birthdate)
    {
        setName(name);
        setBirthdate(birthdate);

    }












}