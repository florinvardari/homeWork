package homework;

import java.util.Scanner;

public class WorkYears {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the numbers of years that you worked");
        int years=scan.nextInt();
        System.out.println("Please enter your annual salary.");
        int salary=scan.nextInt();
        if (years >=5 && salary > 50000) {
            System.out.println("Congratulations you are getting a 5000$ bonus.");
        } else if (years >=5 && salary < 50000){
            System.out.println("Congratulations you are getting a 3000$ bonus.");
        }else{
            System.out.println("Sorry you are not eligible fo bonus yet.");
        }


        }
    }


