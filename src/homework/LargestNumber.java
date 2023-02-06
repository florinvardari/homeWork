package homework;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers.");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a>b && a>c ){
            System.out.println(a+" Is largest number");
        } else if (b>a && b>c) {
            System.out.println(b+" Is the largest number");

        }else {
            System.out.println(c+" Is the largest number");
        }

    }
}
