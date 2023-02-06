package homework;

import java.util.Scanner;

public class Dmv {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();

        if(age>18){
            System.out.println("You are eligible to apply for driver license.");
        }else{
            System.out.println("Plaese get a learner permit first.");
        }
        scan.close();
    }
}
