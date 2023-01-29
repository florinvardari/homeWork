package HomeWork15;

public class Task1 {
    //  1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
    int larger(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Task1 task=new Task1();
        System.out.println(task.larger(10,22));
    }
}
