package homework;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is amount of loan you need?");
        double loan= scan.nextDouble();

        if(loan<=200.000){
            System.out.println("Congratulations your loan request was approved.");
        }else {
            System.out.println("Sorry your loan request was denied.");
        }

        scan.close();
    }
}
