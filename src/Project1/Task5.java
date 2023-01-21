package Project1;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr={{12,25,36,44,63,85},
                {55,88,36,89,85},
                {13,6,72,45}
        };
        int sumeven=0;
        int sumodd=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    sumeven=arr[i][j]+sumeven;
                } else if (arr[i][j]%2!=0) {
                    sumodd=arr[i][j]+sumodd;
                }
            }
        }
        System.out.println("Total of even numbers are:"+sumeven);
        System.out.println("Total of odd numbers are:"+sumodd);
    }
}
