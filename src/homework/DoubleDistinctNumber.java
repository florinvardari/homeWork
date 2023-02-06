package homework;

import java.util.Scanner;

public class DoubleDistinctNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 decimal numbers.");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a>b && a>c){
            System.out.println("The largest number is "+a);
        } else if (b>a && b>c) {
            System.out.println("The largest number is "+b);
        }else {
            System.out.println("The largest number is "+c);
        }
        scan.close();
    }
}
