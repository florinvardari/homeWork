package ArrayHomeWorks;

import java.util.IllegalFormatCodePointException;

public class Grade {
    public static void main(String[] args) {
        char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(grade[1]);

        // 2nd way

        char[] grades = new char[5];

        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';
        grades[4] = 'E';

        for (int i = 4; i < grades.length; i++) {
            System.out.println(grades[1]);


        }
    }
}
