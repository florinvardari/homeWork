package HomeWork33;

public class Task4 {
    /**
     * 4) Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username
     * is less than 5 characters.
     */
    public static void checkUserName(String userName){
        if (userName.length()<5){
            throw new RuntimeException("The username should contain at least 5 letters");
        }
        System.out.println("Welcome");
    }

    public static void main(String[] args) {

        try {
            checkUserName("flo");
        }catch (RuntimeException e) {
            System.out.println("Please enter at least 5 letters");
        }
    }
}
