package HomeWork17;

public class Book {
    /*
    6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String book;
    int year;
    String Writer;

    Book(String nBook,String nWriter,int bYear){
        book="Breath";
        Writer="Rickson Gracie";
        year=2021;
    }

    public Book(String naWriter ,int bYear ,String naBook){
        book="How To Die";
        Writer="Ancient Greek";
        year=0;

    }
    void printInfo(){
        System.out.println("Book Name: "+book+" Book Year: "+year+" Book Author: "+Writer);
    }
        }
