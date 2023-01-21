package Project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int [] number=new int [5];
        for (int i = 0; i < number.length ; i++) {
            number[i]=scan.nextInt();
        }
        int sum=0;
        for (int i = 0; i < number.length ; i++) {
            sum=number[i]+sum;
        }
        System.out.println("The total of the numbers you entered is:"+sum);

    }
}
