package Project2;

public class MarksTester {
    public static void main(String[] args) {
        Marks [] result={new A(95,88,89),
                new B(93,92,89,82)};

        for (Marks x:result){
            x.getPercentage();
        }
    }
}
