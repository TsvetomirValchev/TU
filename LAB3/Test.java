public class Test {
    public static void main(String[] args)
    {
        StudentFKST1Sem student1 = new StudentFKST1Sem("Petur","121221001",'M',1,"KSI",28.79);
        StudentFKST2Sem student2 = new StudentFKST2Sem("Rado","121221002",'M',2,"ITI",4);
        StudentFA1Sem student3 = new StudentFA1Sem("Elena","121221003",'F',1,"SPEC",5.6);

        student1.enterBPEcourse();
        student2.enterBPEcourse();
        student3.enterBPEcourse();
        student1.enterPNPEcourse();
        student1.enterPNPEcourse();
        student1.enterPNPEcourse();

    }

    }
