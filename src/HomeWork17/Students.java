package HomeWork17;

public class Students {
    /*
    2)Write a java Class Students that have a constructor which
     takes students name and 3 subject grades. Inside your class also have a method to
     Calculate Average Grade. Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    int mathGrade;
    int biologyGrade;
    int historyGrade;
    Students(String sName, int sMath, int sBio, int sHis){
        name=sName;
        mathGrade=sMath;
        biologyGrade=sBio;
        historyGrade=sHis;


    }
    void printInfoS(){
        int average=(mathGrade+biologyGrade+historyGrade)/3;
        System.out.println("Student name "+name+" average  score  is "
                +average);
    }
}
