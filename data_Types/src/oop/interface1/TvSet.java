package oop.interface1;

public class TvSet implements Movable{

    @Override
    public void moveRight() {
        System.out.println("na pravo");

    }

    @Override
    public void moveLeft() {
        System.out.println("nalevo");


    }
    public void swichOn(){
        System.out.println("vkluchaem TV");
    }
    public void swichOff(){
        System.out.println("vykluchaem TV");
    }

}
