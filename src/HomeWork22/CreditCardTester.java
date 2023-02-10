package HomeWork22;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard c = new CreditCard(1852, 6);
        c.calculateInterest();
        Visa v = new Visa(1800, 6.99);
        v.calculateInterest();
        AX ax = new AX(1500, 12.99);
        ax.calculateInterest();
    }
}
