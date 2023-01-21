package ObjectsAnd2DArrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers={{12,25,36,21},
                {85,62,31,16},
                {45,33,98,99}};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
              if (numbers[i][j]%2==0){
                  System.out.print(numbers[i][j]+", ");
              }
            }
            System.out.println();
        }

    }
}
