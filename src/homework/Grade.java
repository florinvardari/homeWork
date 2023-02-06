package homework;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your quiz, mid term and final score.");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int average = (a+b+c)/3;

        if (average>=90){
            System.out.println("Grade=A");
        }else if (average>=70 && average<90){
            System.out.println("Grade=B");
        }else if (average>=50 && average<70){
            System.out.println("Grade=C");
        }else {
            System.out.println("Grade=F");
        }
        scan.close();
    }
}
