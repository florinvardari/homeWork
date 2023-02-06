package LoopHomeworks;

public class Loop5 {
    public static void main(String[] args) {
        int num=20;
        while (num>=1){
            System.out.println(num);
            num-=2;
        }
        System.out.println("****************");
        int num2=20;
        while (num2>1){
            if (num2%2==0){
                System.out.println(num2);
                num2-=2;
            }
        }
    }
}
