package homework;

import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Wich day of the week is today?");
        int day=scan.nextInt();

        switch (day){
            case 1:
                System.out.println("It is a week day");
                break;
            case 2:
                System.out.println("It is a week day");
                break;
            case 3:
                System.out.println("It is a week day");
                break;
            case 4:
                System.out.println("It is a week day");
                break;
            case 5:
                System.out.println("It is a week day");
                break;
            case 6:
                System.out.println("It is a weekend");
                break;
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
                scan.close();


        }
        scan.close();
    }
}
