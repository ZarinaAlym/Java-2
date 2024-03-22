package oop;

public class CarMain {
    public static void main(String[] args) {
        Cars honda = new Cars();
        honda.name = "Honda";
        honda.obem=1.7f;
        honda.color= "black";
        honda.model= "Stream";
        honda.strana="Japan";
        honda.year= 2000;
        System.out.println(honda);
        System.out.println(honda.price(honda.obem, honda.year));


    }
}
