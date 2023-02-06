package ForLoopHomeWorks;

import java.util.Scanner;

public class BuyItem {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What would you like to buy");
            String item = scan.next();
            System.out.println("What is the price");
            double itemPrice = scan.nextDouble();
            double payment;
            double sum = 0;

            for (sum = 0; sum < itemPrice; sum += 0) {


                System.out.println("Please make a payment");
                payment = scan.nextDouble();
                sum = sum + payment;
                if (itemPrice > sum) {
                    System.out.println("Your balance due is " + (itemPrice - sum) + "$");
                } else if (sum > itemPrice) {
                    System.out.println("Your change is " + (sum - itemPrice) + "$");
                }

            }
            System.out.println("Thank you for shopping!");
        }
    }



