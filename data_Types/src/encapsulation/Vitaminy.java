package encapsulation;

public class Vitaminy {
public String name;
public String sostav;
public int quantity;
public int weight;
public String firma;
private int price;

public Vitaminy(String name,String sostav,float size,int quantity,int weight,String firma,int price){
    this.name=name;
    this.firma=firma;
    this.quantity=quantity;
    this.sostav=sostav;
    this.weight=weight;
    this.price=price;
}

    @Override
    public String toString() {
        return "Vitaminy{" +
                "name='" + name + '\'' +
                ", sostav='" + sostav + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", firma='" + firma + '\'' +
                ", price=" + price +
                '}';
    }

    public Vitaminy(String name, String sostav, int quantity, int weight, String firma, int price) {
        this.name = name;
        this.sostav = sostav;
        this.quantity = quantity;
        this.weight = weight;
        this.firma = firma;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
