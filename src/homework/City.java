package homework;


import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your city ");
        System.out.println("and the temperature.");
        String city=scan.next();
        int temp=scan.nextInt();

        System.out.println("the temperature is "+((temp-32)*0.5556)+"C and the city is "+city);
    }
}
