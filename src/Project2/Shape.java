package Project2;

public interface Shape {
    /*  1. Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
    */

    double radius=6;

    double fi=3.14;
    double side =5;
    void calculateArea();
    void  calculatePerimeter();

}
class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("The area of this circle is "+(radius*radius)*fi);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this circle is "+(2*fi)*radius);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("The area of Square is "+(side*side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this square is "+(side*4));
    }
}

