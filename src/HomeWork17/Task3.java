package HomeWork17;

public class Task3 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    String name;
    int age;
    double weight;

    private Task3(String sName, int sAge, double sWeight){
        name=sName;
        age=sAge;
        weight=sWeight;
    }
    public Task3(String sName,  double sWeight,int sAge){
        name=sName;
        age=sAge;
        weight=sWeight;
    }
    protected Task3( int sAge, double sWeight,String sName){
        name=sName;
        age=sAge;
        weight=sWeight;
    }
    Task3( int sAge,String sName, double sWeight){
        name=sName;
        age=sAge;
        weight=sWeight;
    }

    void printEverything(){
        System.out.println("Name "+name+" age is "+age+" weight is "+weight+"lb");
    }

    public static void main(String[] args) {
        Task3 Florin=new Task3("Florin",32, 190.0);
        Florin.printEverything();
    }


}
