package oop;

public class LapTop {
    String mark= "MacBook";
    String color = "Grey";
    double price = 1300;
    public String code(){
        return "coding....";
    }
    public String typing(){
        return  "typing....";
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
