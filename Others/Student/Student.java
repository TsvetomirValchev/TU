import java.util.Scanner;

public class Student extends Person
{
    private String fac_num;
    private double scorePIK;
    private double scoreTE;
    private double scorePPE;

    //SETTERS
    public void setFac_num(String fac_num) {this.fac_num = fac_num;}
    public void setScorePIK(double scorePIK){this.scorePIK=scorePIK;}
    public void setScoreTE(double scoreTE){this.scoreTE=scoreTE;}
    public void setScorePPE(double scorePPE){this.scorePPE=scorePPE;}
    //GETTERS
    public double getScorePIK(){return scorePIK;}
    public double getScoreTE(){return scoreTE;}
    public double getScorePPE(){return scorePPE;}

    public Student(String name,String birthdate,String fac_num,double scorePIK,double scoreTE, double scorePPE)
    {
        super(name,birthdate);
        setFac_num(fac_num);
        setScorePIK(scorePIK);
        setScoreTE(scoreTE);
        setScorePPE(scorePPE);

    }

    public void examinePPE() {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nCurrent score in PPE: "+getScorePPE()+" Enter new score: ");
        setScorePPE(scan.nextDouble());
        System.out.println("Score changed. New score: "+getScorePPE());
        scan.close();
    }
    public void examinePIK() {
        Scanner scan2 = new Scanner(System.in);
        System.out.print("\nCurrent score in PIK: "+getScorePIK()+" Enter new score: ");
        setScorePIK(scan2.nextDouble());
        System.out.println("Score changed. New score: "+getScorePIK());
        scan2.close();
    }

    public void examineTE() {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Current score in TE: "+getScoreTE()+" Enter new score: ");
        setScoreTE(scan1.nextDouble());
        System.out.println("Score changed. New score: "+getScoreTE());
        scan1.close();
    }


}
