package Class12Homeworks;

public class Task1 {
    public static void main(String[] args) {
        String str="HelloJava!?";
        int length=str.length();
        if (!str.isEmpty()) {
            if (str.length() >= 3 && str.length() % 2 != 0) {
                int middle = length / 2;
                System.out.println("the middle letter is " + str.charAt(middle));
            }
        }
    }
}
