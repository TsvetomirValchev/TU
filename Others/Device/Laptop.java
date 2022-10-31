public class Laptop extends Device
{


    private double RAM;
    private double Storage;

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public void setStorage(double storage) {
        Storage = storage;
    }

    public double getRAM() {
        return RAM;
    }

    public double getStorage() {
        return Storage;
    }

    @Override
    public String toString()
    {
        return getU()+" "+getCPU()+" "+ getStorage()+ " " +getRAM();
    }

    public Laptop(double U, String CPU, double RAM, double Storage)
    {

        super(U,CPU);
        setRAM(RAM);
        setStorage(Storage);

    }


    public boolean isBetter(Laptop laptop)
    {

        if(this.getRAM()<laptop.getRAM() &&  this.getStorage()<laptop.getStorage() )
        {return false;}
        else
        {return true;}
    }

}

