package oop.abstraction.toy;

public class SoikoSaluu extends Toy{
    public SoikoSaluu(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public void tost() {
        System.out.println("baktyluu bolgula");
    }


}
