
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number?");
        int number=scan.nextInt();

        if(number%2==0) {
            System.out.println("Value is even");
            if (number > 1000) {
                System.out.println("Even number is large.");
            } else {
                System.out.println("Even value is just right.");
            }
        }
        if (number%2==1){
            System.out.println("Number is odd");
            if (number>1000){
                System.out.println("Value is large.");
            }else {
                System.out.println("Values is just right.");
            }
        }

        }
    }
