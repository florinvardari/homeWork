package ObjectsAnd2DArrays;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog();
        husky.name="Alfie";
        husky.breed="Alaskan malamute";
        husky.age=10;
        husky.weight=95;
        husky.color="Grey";
        husky.bark();
        husky.eat();
        husky.sleep();

        Dog bulldog=new Dog();
        bulldog.name="Teddy";
        bulldog.age=4;
        bulldog.weight=88;
        bulldog.color="White";
        bulldog.bark();
        bulldog.sleep();

        Dog labrador=new Dog();
        labrador.name="Boby";
        labrador.color="Brown";
        labrador.age=7;
        labrador.weight=75;
        labrador.sleep();
        labrador.bark();
    }
}
