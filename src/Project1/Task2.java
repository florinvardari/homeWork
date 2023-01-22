package Project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] countries = {"USA", "Kazakhstan", "UK", "Germany", "Japan"};
        String[] capitals = {"Washington", "Astana", "London", "Berlin", "Tokyo"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i] + " ");


        }

        System.out.println("**");


        Scanner sc = new Scanner(System.in);
        String[] countries1 = {"USA", "Kazakhstan", "UK", "Germany", "Japan"};
        String[] capitals1 = {"Washington", "Astana", "London", "Berlin", "Tokyo"};

        int i = 0;
        while (i < countries.length) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
            i++;

        }


    }
}
