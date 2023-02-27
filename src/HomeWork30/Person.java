package HomeWork30;

import java.util.*;

public class Person {
    /**
     2) Create a Person class with following private fields: name, lastName, age, salary.
     Variables should be initialized through constructor.
     Inside the class also create a method to print user details.
     In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
     */
    private String name;
    private String lasName;
    private int age;
    private double salary;

    public Person(String name, String lasName, int age, double salary) {
        this.name = name;
        this.lasName = lasName;
        this.age = age;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println(name+" "+lasName+" "+age+" "+salary+"$");
    }


    public static void main(String[] args) {

        Map<Integer, Person> person = new TreeMap<>();
        person.put(123, new Person("Jack", "Daniel", 25, 35000));
        person.put(153, new Person("Mark", "Zuck", 25, 40000));
        person.put(853, new Person("Joe", "Bim", 25, 38000));


        for (int x : person.keySet()) {
            System.out.println("Person " + x);
            person.get(x).printInfo();
            System.out.println();

        }


    }
}
