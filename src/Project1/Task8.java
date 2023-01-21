package Project1;

public class Task8 {
    public static void main(String[] args) {
         int n=10;
         int  firstTerm=0;
         int secondTerm=1;
        System.out.println("10 numbers of Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
