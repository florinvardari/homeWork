package HomeWork16;

public class Task3 {
    // 3) Create a method that will accept a String as a parameter and
    //  return a new String that consist only of vowels.
    //   Method should be available inside the class only where
    //  it was declared and executed by calling it is name.
    private String vowels(String str){
        String newStr=str.replaceAll("[^aeiou]","");
        return newStr;
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        String str="Hello World";
        System.out.println(task3.vowels(str));
    }
}



