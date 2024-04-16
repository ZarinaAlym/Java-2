package inheritance.practice;

public class CarMain {
    public static void main(String[] args) {
        Passenger nuraika =new Passenger("Nuraika",35);
        Car bmv= new Car("BMV","X7","Grey", 2024,nuraika);
        System.out.println(nuraika);
        System.out.println(bmv);

    }
    }

