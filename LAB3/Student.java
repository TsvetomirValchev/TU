public abstract class Student {
    private String name;
    private String FN;
    private char Gender;
    private int YearOfUni;
    private String Spec;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getFN() {return FN;}
    public void setFN(String FN) {if(FN.length()!= 9){
        System.out.println("FN is not valid");
    }
    else{this.FN = FN;}
    }

    public char getGender() {return Gender;}
    public void setGender(char gender)
    {Gender = gender;}
    public int getYearOfUni() {return YearOfUni;}
    public void setYearOfUni(int yearOfUni) {YearOfUni = yearOfUni;}
    public String getSpec() {return Spec;}
    public void setSpec(String spec) {Spec = spec;}

    public Student(String name, String FN, char Gender, int YearOfUni, String spec)
    {
        setName(name);
        setFN(FN);
        setGender(Gender);
        setYearOfUni(YearOfUni);
        setSpec(spec);

    }

    public abstract boolean checkAddProject();

}
