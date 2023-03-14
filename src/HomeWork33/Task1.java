package HomeWork33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /**1) How would handle InputMismatchException? Input Mismatch
     *  Exception when user enters mismatch value then programmer expected.

     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

    try {
    int numm=scan.nextInt();
      }catch (InputMismatchException e){
        System.out.println("Please enter an non decimal number");
    }


    }
}
