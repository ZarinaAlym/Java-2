package oop.interface1;

public class Main {
    public static void main(String[] args) {
        Movable movable = new TvSet();
        movable.moveLeft();
        movable.moveRight();

        TvSet tvSet= new TvSet();
        tvSet.swichOn();
        tvSet.swichOff();
        tvSet.moveLeft();
        tvSet.moveRight();

        Movable movableDoor = new Door();
        movableDoor.moveRight();
        movableDoor.moveLeft();

    }
}
