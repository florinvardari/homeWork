package HomeWork30;



import java.util.*;

public class Task4 {
    /** /4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
     Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {

        Set<String> names=new LinkedHashSet<>();
        names.add("Alper");
        names.add("Florin");
        names.add("Rinor");


        for (String x:names) {
            System.out.print(x+"");
        }


    }
}
