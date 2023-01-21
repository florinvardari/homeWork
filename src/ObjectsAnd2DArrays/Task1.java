package ObjectsAnd2DArrays;

public class Task1 {
    public static void main(String[] args) {
        String [][]names={{"Florin","Luz","Judy","Mohamed"},
                {"A","B","C","D"}};

        for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j < names[i].length ; j++) {
                if (names[i][j].equals("A") || names[i][j].equals("B")){
                    System.out.println(names[0][j]);
                }
            }
        }



    }
}
