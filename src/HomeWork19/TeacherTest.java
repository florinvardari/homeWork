package HomeWork19;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="John";
        teacher.teacherId=1564345;
        teacher.salary=1000;
        teacher.teaching();
        teacher.testing();
        teacher.inClass();
        teacher.grade();

        MathTeacher mt=new MathTeacher();
        mt.name="Lisa";
        mt.teacherId=125613;
        mt.salary=1000;
        mt.teaching();
        mt.inClass();
        mt.mathKnowledge="very good";
        mt.equation();

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.name="Mark";
        ct.teacherId=985613;
        ct.salary=1000;
        ct.teaching();
        ct.inClass();
        ct.chemKnowledge="Good on bio chemistry";
        ct.bioChemistry();

        PianoTeacher pt=new PianoTeacher();
        pt.name="Valery";
        pt.teacherId=932613;
        pt.salary=1000;
        pt.teaching();
        pt.inClass();
        pt.nrOfInstrumentsPlay=4;
        pt.playing();


    }
}
