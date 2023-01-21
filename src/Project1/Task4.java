package Project1;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr={{12,25,36,44,63,85},
                {55,88,36,89,85},
                {13,6,72,45}
        };

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
