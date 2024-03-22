package oop;

public class ZamaCake {
    public static void main(String[] args) {
        Cake medovik= new Cake();
        medovik.autor = "Zamacake";
        medovik.color="Braun";
        medovik.ingridients ="sahar,med,muka, soda,tus";
        medovik.name = "Medovik";
        medovik.size= 1.5f;
        medovik.weight=35;
        System.out.println(medovik.price(medovik.size));
        System.out.println(medovik);


    }
}
