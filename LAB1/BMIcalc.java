import java.util.Scanner;

public class BMIcalc {

    public static void printIntroduction()
    {

        System.out.println("Welcome to BMI calculator!");
        System.out.println("Insert your data here to get your BMI!");

    }

    public static double getBMI(Scanner scanner)
    {

        System.out.println("Please enter your height in cm: ");
        double height = scanner.nextDouble();
        height = (height*0.3937);
        System.out.println("Please enter your weight in kg: ");
        double weight = scanner.nextDouble();
        weight = (weight*2.2046);

        return bmiFor(height,weight);


    }


    public static double bmiFor(double height, double weight)
    {
       return weight*703/(height*height);
    }

    public static String getStatus(double BMI)
    {
        String status;

        if(BMI<18.5) status = "underweight!";
        else if (BMI<25 && BMI>18.5) status = "normal weight!";
        else if (BMI<30 && BMI>25) status ="overweight!";
        else if (BMI>30) status = "obese";
        else status = "Error";

        return status;
    }

    public static void ReportResults(double BMI, String status)
    {
        System.out.println("Your BMI is " + Math.round(BMI));

    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        printIntroduction();
        double BMI = getBMI(scanner);
        String status = getStatus(BMI);
        System.out.println(status);
        ReportResults(BMI,status);


    }


}