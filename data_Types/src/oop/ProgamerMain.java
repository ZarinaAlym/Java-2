package oop;

public class ProgamerMain {
    public static void main(String[] args) {
        Programer Sanzhar = new Programer();
        Sanzhar.name="Sanzhar";
        Sanzhar.age= 37;
        Sanzhar.edu= "KTU";
        Sanzhar.experience= 10;
        Sanzhar.hobby= "Running";
        Sanzhar.jobtitle="Sn Tester";
        Sanzhar.nationality= "Kyrgyz";
        System.out.println(Sanzhar);
        System.out.println(Sanzhar.relax());
        System.out.println(Sanzhar.coding());
    }
}
