package Project2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape [] calulates={new Circle(),new Square()};

        for (Shape x:calulates){
            x.calculatePerimeter();
            x.calculateArea();
        }


    }
}
