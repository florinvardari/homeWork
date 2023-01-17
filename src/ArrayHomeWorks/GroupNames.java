package ArrayHomeWorks;

public class GroupNames {
    public static void main(String[] args) {
        String[] names = {"Judy Kerolus", "Fariha Wali", "Florin vardari", "Luz Rodriguez", "Betelhem Denbel", "Muhammad Arslan Yousaf" };
        System.out.println(names[2]);


        //2nd way
        String[] name = {"Judy Kerolus", "Fariha Wali", "Florin vardari", "Luz Rodriguez", "Betelhem Denbel", "Muhammad Arslan Yousaf" };
        for (int i = 5; i < name.length ; i++) {
            System.out.println(name[2]);
        }

    }
}
