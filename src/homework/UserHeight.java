package homework;

import java.util.Scanner;

public class UserHeight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your height in inches.");
        int height=scan.nextInt();
        if (height<60){
            System.out.println("Short");
        } else if (height>60 && height<72) {
            System.out.println("medium");

        }else {
            System.out.println("tall");
        }
        scan.close();
    }
}
