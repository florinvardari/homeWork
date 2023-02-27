package HomeWork30;

import java.util.*;

public class Task5 {
    /**
     * 5)Create a collection of integers in which you can keep duplicates.
     * Write a logic to find sum of all integers
     * Prince
     */
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(135);
        numbers.add(345);
        numbers.add(234);
        numbers.add(15);
        numbers.add(46);
        numbers.add(324);

        int sum=0;

        for (Integer x:numbers) {
            sum+=x;
        }

        System.out.println("The sum of all numbers from ArrayList is ="+sum);

    }

}
