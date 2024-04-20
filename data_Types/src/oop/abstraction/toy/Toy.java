package oop.abstraction.toy;

public abstract class  Toy {
    public String name;
    private int quantity;

    public Toy(String  name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public abstract void tost();
     public void prizy(){
         System.out.println("mashina");
     }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
