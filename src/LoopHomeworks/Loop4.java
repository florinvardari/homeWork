package LoopHomeworks;

public class Loop4 {
    public static void main(String[] args) {

        boolean workDay=true;
        int day=1;
        while (day<=5){
            System.out.println("I need a day off");
            day++;
            if (day==6){
                System.out.println("I do not need day off any more.");
            }
        }

    }
}
