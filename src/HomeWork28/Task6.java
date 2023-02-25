package HomeWork28;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
        /**
         6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
         Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
         Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
         Create a Card class that will have interest rate field and card type
         and a constructor that will initialize the fields.
         Create 3 objects of different card and store them into LinkedList.
         Using for loop/advanced for loop/ iterator access all methods of the class.
         */
    }
}
abstract class Insurance{
    String insuranceName;
   abstract void getQuote();
    abstract void cancelInsurance();
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

}
class Car extends Insurance{
    String carModel;
    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    void getQuote() {
        System.out.println(" The insurance "+insuranceName+" for "+carModel+" has a great offer ");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Cancel the insurance with "+insuranceName+" for "+carModel);
    }
}
class  Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" has a gret offers for "+petType+"'s");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling the insurance with "+insuranceName+" for "+petType);
    }
}
class  Health extends  Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Geting health insurance");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Canceling the health insurance");
    }
}
class Card {
    double cardRate;
    String cardType;

    public Card(double cardRate, String cardType) {
        this.cardRate = cardRate;
        this.cardType = cardType;
    }
    void interest(){
        System.out.println("Your rate is "+cardRate);
    }
    void card(){
        System.out.println("your card type is "+cardType);
    }
}
class  Testing{
    public static void main(String[] args) {
        Card visa=new Card(0.15,"Visa");
        Card master=new Card(0.14,"Master");
        Card amex=new Card(0.22,"American Express");

        LinkedList<Card> c=new LinkedList<>();
        c.add(visa);
        c.add(master);
        c.add(amex);

        for (Card x:c) {
            x.interest();
            x.card();
        }

        ArrayList<Insurance> insurance=new ArrayList<>();
        Car car=new Car("State Farm","Ford");
        insurance.add(car);

        Pet pet=new Pet("Geico","Dog");
        insurance.add(pet);

        Health health=new Health("United Health");
        insurance.add(health);

        for (Insurance x:insurance) {
            x.getQuote();
            x.cancelInsurance();

        }

    }
}
