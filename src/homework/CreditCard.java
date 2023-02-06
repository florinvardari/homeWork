package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = scan.next();
        if (card.equals("no")) {
            System.out.println("Would you like apply for a credit card?");
        } else {
            System.out.println("What is your balance?");
            int balance = scan.nextInt();

            if (balance > 1000) {
                System.out.println("Please pay off your balance immediately");
            } else {
                System.out.println("You can keep spending");
            }
        }
        scan.close();
    }
}
