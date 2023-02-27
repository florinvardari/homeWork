package HomeWork30;

import java.util.*;

class Task1 {
    /**
     * 1) Create a map of Best Buy store. Place
     * item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
     * Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {

        Map<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(7854986,"TV");
        bestBuy.put(7855451,"Keyboard");
        bestBuy.put(7856562,"Samsung Dishwasher");
        bestBuy.put(7852662,"GE Dryer");
        bestBuy.put(7841123,"Lenovo PC");



        var entrySet=bestBuy.entrySet();
        for (var x:entrySet) {
            System.out.println(x.getKey()+" = "+x.getValue());
        }





    }
}
