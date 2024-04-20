package oop.abstraction;

public class Pet extends  Animals{
    public Pet(String name,int age){
        super(name,age);
    }

    @Override
    public void voice() {
        System.out.println("miauuu");
    }

}
