package oop;

public class Dog {
    //Instance variable
    public String name;
    public int age;
    public String Breed ;
    public String color ;

    public String eat() {
        return "eat-eat";
    }

    public String run() {
        return "run";
    }
    public String bark(){
        return "gav-gav";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Breed='" + Breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

