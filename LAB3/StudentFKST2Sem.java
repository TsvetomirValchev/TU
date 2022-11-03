public class StudentFKST2Sem extends Student implements StudyingPNPE, StudyingBPE
{

    public double BPEscore;


   @Override
    public boolean checkAddProject() {
        return true;
    }

    public StudentFKST2Sem(String name, String FN, char Gender, int YearOfUni, String spec,double BPEscore )
    {
        super(name, FN, Gender, YearOfUni, spec);
        setBPEscore(BPEscore);


    }

    public void setBPEscore(double BPEscore) {
       this.BPEscore = BPEscore;
    }

    @Override
    public void enterBPEcourse() {
        System.out.println("This student has already learned everything BPE has to offer");
    }

    @Override
    public void enterPNPEcourse()
    {
        System.out.println("This student studying PNPE");
    }



}
