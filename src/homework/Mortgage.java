package homework;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the mortgage rate?");
        double rate = scan.nextDouble();

        if (rate > 4.5) {
            System.out.println("I cant buy the house with this rate " + rate);
        } else {
            System.out.println("That's good rate to buy a house.");
        }
        ;
        if (rate < 4.5) {
            System.out.println("What is the price of the house?");
            int price = scan.nextInt();

            if (price > 200000) {
                System.out.println("I will get a loan to buy the house");
            } else {
                System.out.println("I will pay in cash the house");
            }
        }
        scan.close();

    }
}
