package homework;

import javax.swing.*;
import java.util.Scanner;

public class Diploma {
    public static void main(String[] args) {
        Scanner scan= new  Scanner(System.in);
        System.out.println("Is it true that you have diploma? Answer true or false?");
        boolean diploma=scan.nextBoolean();

        if(!diploma){
            System.out.println("Get a degree");
        }else {
            System.out.println("Congratulations ");
        }
         if(diploma){
             System.out.println("What is your gpa score?");
         }
        int gpa=scan.nextInt();
        if(gpa>=3.5){
            System.out.println("You are eligible for scholarship");
        }else {
            System.out.println("You should have studied harder");
        }
        scan.close();
    }
}
