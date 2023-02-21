package HomeWork28;

import HomeWork19.A;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /*
        5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <=500 ; i++) {
            numbers.add(i);
        }
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i)%5==0){
                numbers.remove(i);
            }
            for (int x:numbers) {
                System.out.print(x+" ");
            }
        }
    }
}
