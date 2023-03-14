package HomeWork33;

public class Task3 {
    /**
     *   3) Create a method to check age eligibility that will throw a runtime exception.
     *         Method should throw an exception age is less than 16.
     */
    public static  void eligibility(int age){
        if (age<=16){
            throw new RuntimeException("You must be at least 16 years old");
        }
        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        int age=15;
try {
    eligibility(age);
}catch (RuntimeException e){
    System.out.println("You have to wait "+(16-age)+" year");
}

    }
}
