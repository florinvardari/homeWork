package HomeWork15;

import javax.sound.midi.Soundbank;

public class Task4 {
    //  4)Create a method that will say Hello in different language based on the country
    //     that will pass when method is executed
    String language(String translate){
        if (translate.equalsIgnoreCase("albania")){
            return "Tung";
        } else if (translate.equalsIgnoreCase("turkey")) {
            return "Selam";
        } else if (translate.equalsIgnoreCase("italy")) {
            return "Ciao";
        }else {
            return "Don't recognize the country";
        }
    }

    public static void main(String[] args) {
        Task4 task=new Task4();
        System.out.println(task.language("france"));
    }
}
