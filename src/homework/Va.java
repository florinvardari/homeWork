package homework;
import java.util.Scanner;
public class Va {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = scan.next();

        System.out.println("Please enter your age");
        int age = scan.nextInt();
        String a="M";
        String b="F";

        if (age>25 && gender.equals(a)) {
            System.out.println("Man");
        }else if (age<25 && gender.equals(a)){
            System.out.println("Boy");
        } else if (age<25 && gender.equals(b)) {
            System.out.println("Girl");
        }else{
            System.out.println("Woman");
        }
        scan.close();
    }
}










