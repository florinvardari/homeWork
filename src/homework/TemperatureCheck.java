package homework;

import java.sql.SQLOutput;

public class TemperatureCheck {
    public static void main(String[] args) {
        int temp=38;
        if (temp<32) {
            System.out.println("Water will freeze with temperature  "+temp);
        }else{
            System.out.println("Water will not freeze with temperature "+temp);
        }


        }
}
