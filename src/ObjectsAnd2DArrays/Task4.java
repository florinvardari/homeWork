package ObjectsAnd2DArrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers={{12,25,36},
                {85,62,31},
                {45,33,98}};
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                sum=numbers[i][j]+sum;

            }
        }
        System.out.println("Total of all number are:"+sum);
    }
}
