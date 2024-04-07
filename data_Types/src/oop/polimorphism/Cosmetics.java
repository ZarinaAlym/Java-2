package oop.polimorphism;

public class Cosmetics {
    public static void main(String[] args) {
        Cosmetics manyo= new Cosmetics(true);
        Cosmetics nivea= new Cosmetics("nivea",false);
        Cosmetics loreal=new Cosmetics("loreal",true,2000);
        Cosmetics lancome= new Cosmetics();
        lancome.price=1000;
        System.out.println(manyo);
        System.out.println(loreal.price);

    }
    public String marka;
    private boolean jirnyi;
    public double price;

    public Cosmetics(String marka, boolean jirnyi) {
        this.marka = marka;
        this.jirnyi = jirnyi;
    }

    public Cosmetics(String marka, boolean jirnyi, double price) {
        this.marka = marka;
        this.jirnyi = jirnyi;
        if (price>=2000){
            this.price=price-(price*0.1);
        }
    }
    public Cosmetics(){

    }

    public Cosmetics(boolean jirnyi) {
        this.jirnyi = jirnyi;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "marka='" + marka + '\'' +
                ", jirnyi=" + jirnyi +
                ", price=" + price +
                '}';
    }
}

