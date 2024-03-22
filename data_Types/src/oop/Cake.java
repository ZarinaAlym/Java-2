package oop;

public class Cake {
    public String name;
    public String ingridients;
    public String color;
    public int weight;
    public float size;

    public String autor;

    public float price(float size){
        return 1000*size;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", ingridients='" + ingridients + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", autor='" + autor + '\'' +
                '}';
    }
}
