package homework;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scan.next();
        switch (country.toLowerCase()){
            case  "usa":
                System.out.println("You speak English");
                break;
            case  "italy":
                System.out.println("You speak Italian");
                break;
            case  "france":
                System.out.println("You speak French");
                break;
            case  "China":
                System.out.println("You speak Chinese");
                break;
            case  "spain":
                System.out.println("You speak Spanish");
                break;
            default:
                System.out.println("Wrong country");

        }
        scan.close();
    }
}
