package homework;

import java.util.Scanner;

public class GradeExplanation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade.");

        char grade =scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("You Entered grade A-Excellent.");
                break;
            case 'B':
                System.out.println("You Entered grade B-Good.");
                break;
            case 'C':
                System.out.println("You Entered grade C-Average." );
                break;
            case 'D':
                System.out.println("You Entered grade D-Bad." );
                break;
            default:
                System.out.println("Not Acceptable.");
        }
        scan.close();


    }
}
