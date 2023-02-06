package homework;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=scan.next();

        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")){
            System.out.println("You were born in winter.");
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("You were born in Spring");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in summer.");
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born in fall.");
        }else {
            System.out.println("Wrong Month");
        }
        scan.close();

    }
}
