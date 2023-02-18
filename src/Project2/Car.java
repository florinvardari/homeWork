package Project2;

abstract public class Car {
    /*
3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
 */
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

   abstract double calculateSalePrice();

}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        double discount10=carPrice/10;
        double discount5=discount10/2;
        if (length>20){
            double final5 = carPrice - discount5;
            System.out.println("The price of "+color+" sedan with 5% discount is "+final5+"$");
            return  final5;
        }else {
            double final10 = carPrice - discount10;
            System.out.println("The price of "+color+" sedan with 10% discount is "+final10+"$");
            return  final10;
        }
    }

}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        double discount10=carPrice/10;
        double discount20=carPrice/5;
        if (weight>2000){
            double final10 = carPrice - discount10;
            System.out.println("The price of "+color+" Truck with 10% discount is "+final10+"$");
            return final10;
        }else {
            double final20 = carPrice - discount20;
            System.out.println("The price of "+color+" Truck with 20% discount is "+final20+"$");
            return final20;
        }
    }
}

