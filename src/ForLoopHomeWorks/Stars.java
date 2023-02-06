package ForLoopHomeWorks;

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 1; j++) {
                if (i == 2 || i==3 || i == 5 || i==6 ) {
                    System.out.println();
                } else if (i == 8 || i == 10) {
                    System.out.println("**");
                } else {
                    System.out.println("*");
                }

            }
        }
    }
}