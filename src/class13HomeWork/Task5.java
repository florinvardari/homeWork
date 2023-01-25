package class13HomeWork;

public class Task5 {
    public static void main(String[] args) {
        //5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String check="PFP";
        String rev="";
        for (int i = check.length()-1; i >=0 ; i--) {
            rev=rev+check.charAt(i);
        } if (check.equals(rev)){
            System.out.println("This is palindrome "+rev);
        }else {
            System.out.println("This is not palindrome");

        }
    }
}
