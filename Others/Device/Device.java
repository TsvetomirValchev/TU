import java.sql.SQLOutput;

public class Device {
    private double U;
    private String CPU;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setU(double u) {
        this.U = u;
    }

    public String getCPU() {
        return CPU;
    }

    public double getU() {
        return U;
    }

    public Device(double u,String CPU)
    {
        setU(u);
        setCPU(CPU);
    }

    public static void main(String[] args)
    {

        Laptop laptop1 = new Laptop(400,"ryzen 5 2600", 16,1000);
        Laptop laptop2 = new Laptop(400,"ryzen 7 2700", 36,1500);
        System.out.println(laptop1.toString());
        System.out.println(laptop1.isBetter(laptop2));

    }
}