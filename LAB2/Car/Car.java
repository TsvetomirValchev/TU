import java.util.Scanner;
import java.util.ArrayList;
public class Car {
    private String make;
    private String model;
    private String color;
    private double power;
    private double engine;
    private String transmission;
    private double year;

    public void setMake(String make){this.make=make;}
    public String getMake() {return make;}
    public void setModel(String model) {this.model = model;}
    public String getModel(){return model;}
    public void setColor(String color){this.color=color;}
    public String getColor(){return color;}
    public void setPower(double power) {this.power = power;}
    public double getPower() {return power;}
    public void setEngine(double engine) {this.engine = engine;}
    public double getEngine() {return engine;}
    public void setTransmission(String transmission) {
        if(transmission.equals("automatic")||transmission.equals("manual"))
        {
            this.transmission = transmission;
        }
        else System.out.println("Unknown transmission!");
    }

    public String getTransmission() {return transmission;}
    public void setYear(double year) {this.year = year;}
    public double getYear() {return year;}

    public Car(String make,String model, String color, double power, double engine, String transmission, double year)
    {
        setMake(make);
        setModel(model);
        setColor(color);
        setPower(power);
        setEngine(engine);
        setTransmission(transmission);
        setYear(year);
    }

    public Car()
    {

    }


    //Създайте метод, който по подаден масив от коли и параметър буква(char),
    // “прочиства” масива от коли и връща нов масив от коли, на които марките им започват с подадената като параметър буква.



    public int compareCars(Car other){
        if(this.getMake().equals(other.getMake()))
            if(this.getModel().equals(other.getModel()))
                if(this.getColor().equals(other.getColor()))
                    if(this.getEngine() == other.getEngine())
                        if(this.getPower() == other.getPower())
                            if(this.getTransmission().equals(other.getTransmission()))
                                if(this.getYear() == other.getYear())
                                    return 1;

        return  0;
    }


    public void copyData(Car other) {
        // Car temp = new Car();

        this.setMake(other.getMake());
        this.setModel(other.getModel());
        this.setColor(other.getColor());
        this.setPower(other.getPower());
        this.setEngine(other.getEngine());
        this.setTransmission(other.getTransmission());
        this.setYear(other.getYear());

    }


    public void printDataForCar() {
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("Horse Power: " + this.getPower());
        System.out.println("Engine: " + this.getEngine());
        System.out.println("Transmission: " + this.getTransmission());
        System.out.println("Year: " + this.getYear());
    }



}
