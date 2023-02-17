package Project2;

abstract public class Marks {
    /*
2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
 */
    double math;
    double history;
    double biology;
    double english;

    abstract double getPercentage();
}
class A extends Marks{
    public A(double math, double history, double biology) {
        this.math = math;
        this.history = history;
        this.biology = biology;
    }

    @Override
    double getPercentage() {
        double average=(math+history+biology)/3;
        System.out.println("The average score for student A is: "+average);
        return average;
    }
}
class B extends  Marks{
    public B(double math, double history, double biology, double english) {
        this.math = math;
        this.history = history;
        this.biology = biology;
        this.english = english;
    }
    @Override
    double getPercentage() {
        double average=(math+history+biology+english)/4;
        System.out.println("The average score for student B is: "+average);
        return average;
    }
}


