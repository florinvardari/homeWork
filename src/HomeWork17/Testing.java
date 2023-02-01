package HomeWork17;

public class Testing {

    //1) Write a java class that will have a constructor: one with parameters and second without any parameters. Create a separate
    // Test class where you will execute both of the constructors 1 by 1.
   String name;
   int age;
   String Id;

   public Testing(String sName, int sAge, String sID){
       name=sName;
       age=sAge;
       Id=sID;

   }
    public Testing(){

    }

   void printInfo(){
       System.out.println("Name "+name+" age "+age+" ID"+Id);

   }

}
