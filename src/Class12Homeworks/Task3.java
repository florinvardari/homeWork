package Class12Homeworks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Please enter father's name");
        String father= name.next();
        System.out.println("Please enter mom's name");
        String mom=name.next();
        System.out.println("Are you expecting boy or girl?");
        String gender=name.next();
        if (gender.equals("boy")){
            System.out.println("Suggested baby name: DANRY");
        } else if (gender.equals("girl")) {
            System.out.println("Suggested baby name: MAIEL");
        }
    }
}
