package Project1;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr={{12,25,36},
                {55,89,36},
                {13,6,71}
        };
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=arr[i][j]+sum;
            }
        }
        System.out.println(sum);
    }
}
