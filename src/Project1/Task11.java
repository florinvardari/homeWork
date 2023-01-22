package Project1;

public class Task11 {
    public static void main(String[] args) {
        String []duplicate={"Florin","Alper","Judy","Luz","Mohamed","Florin"};
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i+1; j < duplicate.length ; j++) {
                if (duplicate[i].equals(duplicate[j]) && i!=j){
                    System.out.println(duplicate[j]);

                }
            }
        }
    }
}
