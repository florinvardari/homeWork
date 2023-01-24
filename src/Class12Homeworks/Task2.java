package Class12Homeworks;

public class Task2 {
    public static void main(String[] args) {
        String fo="Sunday";
        String revers="";
        char ch;
        System.out.println(fo);

        for (int i = 0; i <fo.length() ; i++) {
            ch=fo.charAt(i);
            revers=ch+revers;
        }
        System.out.println(revers);
    }
}
 
