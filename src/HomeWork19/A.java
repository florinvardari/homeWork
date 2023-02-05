package HomeWork19;

public class A {
    String name;
    int age;
}
class B extends A{
    String address;
    String gender;
    void info(){
        System.out.println(name+" is our member and the age is "+age);
    }
}
class C extends B{
    double weight;
    int memberId;
    void member(){
        System.out.println(memberId+" memberID weighs "+weight+"lb");
    }



    public static void main(String[] args) {

        A member=new A();
        member.name="Luca";
        member.age=25;
        System.out.println("------------");
        B member1=new B();
        member1.name="Mike";
        member1.age=30;
        member1.address="123 main St";
        member1.gender="male";
        member1.info();
        System.out.println("---------------");
        C member2=new C();
        member2.name="Ahmed";
        member2.age=33;
        member2.address="123 Road";
        member2.gender="male";
        member2.memberId=159825456;
        member2.weight=180;
        member2.info();
        member2.member();


    }
    }

