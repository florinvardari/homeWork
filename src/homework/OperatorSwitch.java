package homework;

import java.util.Scanner;

public class OperatorSwitch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two numbers and a operator.");
        int a, b;
        char c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.next().charAt(0);
        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong operator.");
        }
        scan.close();


    }
}
