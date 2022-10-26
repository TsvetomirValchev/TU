public class CompanyST extends Company

{


    String Owner;
    double StartingCapital;
    double CurrentCapital;

    public String getOwner() {
        return Owner;
    }

    public void setNameST(String Owner) {
        this.Owner = Owner;
    }

    public double getStartingCapital() {
        return StartingCapital;
    }

    public void setStartingCapital(double startingCapital) {
        this.StartingCapital = startingCapital;
    }

    public double getCurrentCapital() {
        return CurrentCapital;
    }

    public void setCurrentCapital(double CurrentCapital) {
        this.CurrentCapital = CurrentCapital;
    }


    public CompanyST(String name, String date, String Bulstat,String Owner, double startingCapital, double CurrentCapital)
    {
        super(name,date,Bulstat);
        setNameST(Owner);
        setStartingCapital(startingCapital);
        setCurrentCapital(CurrentCapital);


    }
    public void displayData()
    {
        System.out.println(getName()+" "+getDate()+" "+getBulstat() + " "+ getOwner() + " "+ getStartingCapital() + " " +getCurrentCapital());



    }



    public double Winnings()
    {
       return getCurrentCapital() - getStartingCapital();
    }

}
