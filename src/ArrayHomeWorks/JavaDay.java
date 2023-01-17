package ArrayHomeWorks;

public class JavaDay {
    public static void main(String[] args) {
        String[] day={"Saturday","is","Java","coding","day.",};

        for (int i = 0; i < day.length ; i++) {
            System.out.print(day[i]+" ");

        }
        System.out.println();
        // 2nd way

        String[] days = {"Java", "Saturday", "day", "coding", "is"};

        System.out.println(days[1]+" "+days[4]+" "+days[0]+" "+days[3]+" "+days[2]+".");
        }

    }

