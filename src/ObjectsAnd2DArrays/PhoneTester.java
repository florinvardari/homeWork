package ObjectsAnd2DArrays;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.brand="Iphone";
        iphone.color="Green";
        iphone.model=13;
        iphone.ring();
        iphone.song();
        iphone.video();

        Phone pixel=new Phone();
        pixel.brand="Pixel";
        pixel.color="White";
        pixel.model=6;
        pixel.video();
        pixel.ring();


        Phone samsung=new Phone();
        samsung.brand="Samsung";
        samsung.screenSize=6.2;
        samsung.model=20;
        samsung.color="Black";
        samsung.ring();
        samsung.song();
        samsung.video();


    }
}
