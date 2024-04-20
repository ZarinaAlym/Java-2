package oop.abstraction;

public class MainAnimal {
    public static void main(String[] args) {
        WilldAnimals lion= new WilldAnimals("Korol lev", 5);
        System.out.println(lion);
        Pet cat= new Pet("Murka", 2);
        System.out.println(cat);
        cat.voice();
    }

}
