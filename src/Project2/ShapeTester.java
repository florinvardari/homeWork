package Project2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape [] calulates={new Circle(6),new Square(8)};

        for (Shape x:calulates){
            x.calculatePerimeter();
            x.calculateArea();
        }


    }
}
