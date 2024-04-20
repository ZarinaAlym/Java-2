package oop.abstraction;

public class WilldAnimals extends Animals {
    public WilldAnimals(String name, int age){
        super(name,age);
    }
    public void voice(){
        System.out.println("rrrr");
    }

    @Override
    public void run() {
        super.run();
    }

}
