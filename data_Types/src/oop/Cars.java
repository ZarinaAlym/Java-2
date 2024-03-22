package oop;

public class Cars {
    public String name;
    public String model;
    public String color;
    public int year;
    public String strana;
    public float obem;
    public float price(float obem, int year){
        if(year<2000 || obem>2){
            return obem*5000;
        }
        return obem*10000;



    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", strana='" + strana + '\'' +
                ", obem=" + obem +
                '}';
    }
}
