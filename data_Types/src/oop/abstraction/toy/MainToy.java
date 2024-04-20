package oop.abstraction.toy;

public class MainToy {
    public static void main(String[] args) {
        SoikoSaluu altynSoiko= new SoikoSaluu("Kyz uzatuu",100);
        System.out.println(altynSoiko);
        altynSoiko.tost();
        UilonyyToy aslBakyt= new UilonyyToy("svadba",250);
        System.out.println(aslBakyt);
        aslBakyt.tost();
    }
}
