package ObjectsAnd2DArrays;

public class Task3 {
    public static void main(String[] args) {
        String [][]grocery={{"Potato","Tomato","Onions","Peppers"},
                {"Grapes","Oranges","Apple","Bananas"},
                {"Cheese","Milk","Butter","Yogurt"},
                {"Snickers","Hershey Kisses","M&M"}
        };
        for (int i = 0; i < grocery.length ; i++) {
            for (int j = 0; j < grocery[i].length ; j++) {
                System.out.print(grocery[i][j]+", ");
            }
            System.out.println();
        }

        System.out.println("++++++++++++++++++++");

        for (String[] arr : grocery){
            for (String list: arr){
                System.out.print(list+", ");
            }
            System.out.println();
        }
    }
}
