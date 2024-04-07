package inheritance.apple;

public class AppleMain {
    public static void main(String[] args) {
        MacBook macpro= new MacBook("MacBookPro",2024,"Gray","Sonoma");
        MacBook macair= new MacBook("MacAir",2023);
        System.out.println(macpro);
        System.out.println(macair);
        System.out.println(macair.battery());
        AppleWatch pro= new AppleWatch("pro",2023,"gold","IOS");
        AppleWatch pro1= new AppleWatch ("pro1",2024,"white","IOS1");
        System.out.println(pro);
        System.out.println(pro1.battery());
    }
}
