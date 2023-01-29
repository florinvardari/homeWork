package HomeWork15;

public class Task2 {
    //2) Create a method that will take a number and prints whether the number is even or odd.
    String check(int num1){

        if (num1%2==0){
            return "The number is even";
        }else {
            return "The number is odd";

        }
    }

    public static void main(String[] args) {

        Task2 task=new Task2();
        System.out.println(task.check(25));
    }
}
