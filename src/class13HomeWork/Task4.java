package class13HomeWork;

public class Task4 {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String input = "This is sentence i want to reverse";
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        String output = sb.toString().trim();
        System.out.println(output);
    }
}
