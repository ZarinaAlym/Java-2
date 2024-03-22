package oop;

public class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name="Moinok";
        rex.age=2;
        rex.Breed="obcharka";
        rex.color="Grey";

        System.out.println(rex);
        System.out.println(rex.eat());
        System.out.println(rex.run());
        System.out.println(rex.bark());

        Dog aktosh = new Dog();
        aktosh.name= "Aktosh";
        aktosh.age= 3;
        aktosh.Breed="mashke";
        aktosh.color="belyi";
        System.out.println(aktosh);



    }
     public  static Dog  myDog(Dog obj){
        return obj;
     }
    }

