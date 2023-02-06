package HomeWork20;

public class EmployeeTester {
    public static void main(String[] args) {



        FullTime emp=new FullTime("Florin",25,"yes","morning");

        emp.partTimeInfo();
        emp.fullTimeInfo();
        emp.printInfo();
        emp.displayInfo();


        FullTime full=new FullTime("florin",38,"yes","any");

        full.printInfo();
        full.partTimeInfo();
        full.fullTimeInfo();
        full.displayInfo();




    }
}
