package HomeWork17;

public class Student5 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String name;
    String address;

    Student5(String sName, String sAddress) {
        name = sName;
        address = sAddress;
    }

    void displayInfo() {
        System.out.println("Student's name " + name + " address is " + address);
    }


}