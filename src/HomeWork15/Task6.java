package HomeWork15;

public class Task6 {
    /* 6)Create  class Student that will have a method getGrade.
  Your method should accept the score of a student and return a grade:
  score > 90 - A
  score >80 - B
  score >70 - C
  score > 50 - D
  anything else - F
*/
    String grade(int score){
        if (score>90){
            return "Garde is A";
        } else if (score>80) {
            return "Garde is B";
        }else if (score>70) {
            return "Garde is C";
        }else if (score>50) {
            return "Garde is D";
        }else {
            return "Grade is F";
        }
    }

    public static void main(String[] args) {
        Task6 task=new Task6();
        System.out.println(task.grade(85));
    }
}
