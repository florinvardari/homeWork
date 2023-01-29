package HomeWork15;

public class Task5 {
      // 5) Write a method to return whether given number is prime or not?
      // What is a prime number in math?
      Boolean number(int num) {
          boolean prime = true;
          if (num > 1) {
              for (int i = 2; i <= num / 2; i++) {
                  if (num % i == 0) {
                      return false;
                  }
              }
          }
          return prime;
        }


    public static void main(String[] args) {

        Task5 task=new Task5();
        System.out.println(task.number(9));
    }
}
