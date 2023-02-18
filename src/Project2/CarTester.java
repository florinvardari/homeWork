package Project2;

public class CarTester {
    public static void main(String[] args) {


        Car [] prices={new Sedan(28000,"white",11),
                new Truck(62000,"grey",1000)};
        for (Car x:prices){
            x.calculateSalePrice();
        }


    }
}
