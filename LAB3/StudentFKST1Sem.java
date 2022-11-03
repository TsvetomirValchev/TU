public class StudentFKST1Sem extends Student implements StudyingBPE,StudyingPNPE{

    public double BAL;

    public void setBAL(double BAL) {
        if(BAL<30 && BAL>0){
        this.BAL = BAL;}
        else{System.out.println("There is something wrong with this student's BAL");}
    }

    public StudentFKST1Sem(String name, String FN, char Gender, int YearOfUni, String spec, double BAL) {
        super(name, FN, Gender, YearOfUni, spec);
        setBAL(BAL);
    }

    @Override
    public boolean checkAddProject() {
        return false;
    }

    @Override
    public void enterBPEcourse() {
        System.out.println("This student is studying BPE");
    }

    @Override
    public void enterPNPEcourse()
    {
        System.out.println("This student is not yet studying PNPE");
    }
}
