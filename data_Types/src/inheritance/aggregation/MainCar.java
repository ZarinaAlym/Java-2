package inheritance.aggregation;

public class MainCar {
    public static void main(String[] args) {
        Engine engine= new Engine("Diesel");
        Car mers= new Car("MayBach", engine);
        System.out.println("Car model: "+mers.getModel());
        System.out.println("Engine type: "+mers.getEngine().getType());
    }
}
