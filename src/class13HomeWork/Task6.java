package class13HomeWork;

public class Task6 {
    public static void main(String[] args) {
        // 6) How would you swap  2 strings without a temporary variable?

        String name="Florin";
        String lastName="Vardari";

        System.out.println("Before swapping the string name is "+name+" and string lastName is "+lastName);

        name=name+lastName;
        lastName=name.substring(0,name.length()-lastName.length());
        name=name.substring(lastName.length());

        System.out.println("After swapping the string name is "+name+" and string lastName is "+lastName);

    }
}
