package oop.polimorphism;

public class Man {
    public String Man;
    public String name;
    private  int age;
    public Man(){
    }
    public Man(String name){
        this.name=name;
    }
    public Man(int age){
        this.age=age;
    }
    public Man(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Man(int age,String name){
        this.name= name;
        this.age= age;
    }
    public String towork(String work){
        return work;
    }

    @Override
    public String toString() {
        return "Man{" +
                "Man='" + Man + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
