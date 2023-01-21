package ObjectsAnd2DArrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {


        String[][] countries= {{"England","France","Italy","Germany"},
                {"Mexico", "USA","Canada"},
                        {"Brazil","Argentina", "Venezuela"},
                { "China","Japan","India","Pakistan"},
                {"Egypt","Nigeria","Algeria"}};
        int sumcountries=0;
        for (int i = 0; i <countries.length ; i++) {
            for (int j = 0; j < countries[i].length ; j++) {
                System.out.print(countries[i][j]+", ");
                sumcountries++;
            }
            System.out.println();
        }
        System.out.println(sumcountries);
        System.out.println("++++++++++++++++++++++");
        int sumcountries1=0;
        for (String[] world:countries){
            for (String all : world){
                System.out.print(all+", ");

            }
            System.out.println();
        }

        for (int i = 1; i < countries.length ; i++) {
            for (int j = 0; j < countries[1].length ; j++) {

            }
            }

    }
}