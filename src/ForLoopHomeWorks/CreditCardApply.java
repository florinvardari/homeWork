package ForLoopHomeWorks;

import java.util.Scanner;

public class CreditCardApply {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        for (int i = 1; i <=10 ; i++) {
            System.out.println("Please apply for credit card");
            String card=scan.next();
            if (card.equalsIgnoreCase("yes"))
                break;
        }
    }
}
