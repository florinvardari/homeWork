package HomeWork19;

public class Teacher {
    String name;
    int teacherId;
    double salary;
    void teaching(){
        System.out.println("Teacher teaching the class");
    }
    void testing(){
        System.out.println("Teacher testing the class");
    }
    void inClass(){
        System.out.println("Teacher waking inside the class");
    }
    void  grade(){
        System.out.println("Teacher announcing the grades");
    }
}
class MathTeacher extends Teacher{
    String mathKnowledge;
    void equation(){
        System.out.println("Teacher teaching us the equations");
    }
}
class ChemistryTeacher extends Teacher{
    String chemKnowledge;
    void bioChemistry(){
        System.out.println("Teacher teaching us the Bio Chemistry today");
    }

}
class PianoTeacher extends Teacher{
    int nrOfInstrumentsPlay;
    void playing(){
        System.out.println("teacher playing us piano today");
    }
}
