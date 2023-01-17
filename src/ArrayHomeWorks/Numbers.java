package ArrayHomeWorks;

public class Numbers {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 22;
        num[1] = 45;
        num[2] = 60;
        num[3] = 15;
        num[4] = 32;

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
          sum=sum+num[i];
        }
        System.out.println(sum);
    }

}


