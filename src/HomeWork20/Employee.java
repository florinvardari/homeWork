package HomeWork20;

public class Employee {
    //2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!
    String employeeName;
    int employeeId;
    int workHours;
        Employee(String employeeName, int workHours){
            this.employeeName=employeeName;
            this.workHours=workHours;
        }
    void printInfo(){
        System.out.println(employeeName+"'s work hours per week are "+workHours);}
    }
    class PartTime extends Employee{
    String morningShiftOnly;

        PartTime(String employeeName,int workHours , String morningShift) {
            super(employeeName, workHours);
            this.morningShiftOnly =morningShift;
        }
        void partTimeInfo(){
            System.out.println("part time employee's work only "+ workHours +" hours");
        }

    }
    class FullTime extends PartTime{
    String shift;

        FullTime(String employeeName, int workHours, String morningShift, String shift) {
            super(employeeName, workHours, morningShift);
            this.shift =shift;
        }
        void fullTimeInfo(){
                System.out.println("Full time employees can  work "+ shift +" shift");
            }
        public void displayInfo(){
            if (workHours>=35 ){
                fullTimeInfo();
            }else {
                partTimeInfo();
            }
        }
        }
class Tester extends FullTime{
    String agree;

    Tester(String employeeName, int workHours, String morningShift, String shift,String agree) {
        super(employeeName, workHours, morningShift, shift);
        this.agree=agree;
    }
   public void hired(){
        System.out.println("Congrats you are part of the team");
    }


}
