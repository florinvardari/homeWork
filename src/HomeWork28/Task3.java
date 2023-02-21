package HomeWork28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
        3)Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("apple");
        words.add("samsung");
        words.add("google");
        words.add("xiaomi");

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    }
}
