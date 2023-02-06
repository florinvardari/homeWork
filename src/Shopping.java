import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double total=0;
            for (int i = 0; i <100000 ; i++) {
                System.out.println("What would you like to buy");
                String item = scan.next();
                if (item.equalsIgnoreCase("done")){
                    System.out.println("Your total is "+total+"$");
                    break;
                }
                System.out.println("What is the price");
                double itemPrice = scan.nextDouble();
                total=total+itemPrice;
            }
            double payment;
            double sum = 0;
            for (sum = 0; sum < total; sum += 0) {
                System.out.println("Please make a payment");
                payment = scan.nextDouble();
                sum = sum + payment;
                if (total > sum) {
                    System.out.println("Your balance due is " + (total- sum) + "$");
                } else if (sum > total) {
                    System.out.println("Your change is " + (sum - total) + "$");
                }
            }
            System.out.println("Thank you for shopping!");
        }

    }







