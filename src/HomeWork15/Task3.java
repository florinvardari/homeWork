package HomeWork15;

public class Task3 {
    // 3) Create a method that will print whether given String is palindrome or not.


    String palindrome(String str){
        String rev = "";

        for (int i = str.length()-1; i>=0; i--) {
            rev+= str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            return "the given string is palindrome";
        } else {
            return   "the given string is not palindrome";
        }

    }

    public static void main(String[] args) {
        Task3 words = new Task3();
        System.out.println(words.palindrome("POP"));

    }
}



