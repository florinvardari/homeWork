package HomeWork22;

public class CreditCard {
 /*
    Create a class CreditCard and define variable balance and interest. Create an instance
    method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.

     */

    double balance;
    double interest;

    public CreditCard(double balanace, double interest) {
        this.balance = balanace;
        this.interest = interest;
    }

    void calculateInterest() {
        System.out.println("The interest  is " + balance * interest / 100);
    }
}
class Visa extends CreditCard {

    public Visa(double balanace, double interest) {

        super(balanace, interest);
    }
}

class AX extends CreditCard{

    public AX(double balanace, double interest) {

        super(balanace, interest);
    }
    @Override
    void calculateInterest() {
        System.out.println("The interest  with AX might be higher then others " + balance * interest / 100);
    }
}

