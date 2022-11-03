public class StudentFA1Sem extends Student implements StudyingBPE, StudyingPNPE {
    public double ScorePhysics;

    public void setScorePhysics(double scorePhysics) {
        ScorePhysics = scorePhysics;
    }

    @Override
    public boolean checkAddProject() {
        return false;
    }

    StudentFA1Sem(String name, String FN, char Gender, int YearOfUni, String spec,double ScorePhysisc )
    {
        super(name, FN, Gender, YearOfUni, spec);
        setScorePhysics(ScorePhysisc);
    }

    @Override
    public void enterBPEcourse() {
        System.out.println("This student will never study BPE");
    }

    @Override
    public void enterPNPEcourse()
    {
        System.out.println("This student will never study PNPE");
    }

}
