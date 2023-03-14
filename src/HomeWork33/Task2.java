package HomeWork33;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /**2) Create a static method that will return a List of Exceptions.
     Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
     Call your method inside main and print name and details of all Exception objects.
     *
     */
    public static List<Exception>  exceptionList() {
        List<Exception> exceptions = new ArrayList<>();
        try {
            int num1 = 10;
            int num2 = 0;
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            String str = null;
            str.equals("test");
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            String[] arr = {"Dog", "Cat", "Chicken"};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            String s = "dog";
            s.charAt(4);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            exceptions.add(e);
        }
        return exceptions;
    }


    public static void main(String[] args) {
        List<Exception> list=exceptionList();

        for (Exception x:list) {
            System.out.println("Exceptions "+x.getClass().getName());
        }
    }
}
