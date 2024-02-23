package methods;

import java.util.Scanner;

public class FlyJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have any type of disease from the list? 1. Yes. 2.No");
        int health = scan.nextInt();
        if (health == 2) {
            System.out.println("Did you sing the contract? 1.Yes.2.No");
            int cotract = scan.nextInt();
            System.out.println("Pleace choose type of jumping. 1.classic 2.GoPro 3.Drone");
            int type = scan.nextInt();
            System.out.println("How many times do you want to jump");
            int quantity = scan.nextInt();
            if (type == 1) {
                System.out.println("please pay " + priceClassic(quantity, startJumpPrice(), nextjumpPrice())+ " KGS");
            } else if (type == 2) {
                System.out.println("please pay " + priceGoPro(quantity, startJumpPrice(), nextjumpPrice()) + " KGS");
            } else if (type == 2) {
                System.out.println("please pay " + priceDrone(quantity, startJumpPrice(), nextjumpPrice()) + " KGS");

            } else {
                System.out.println("please read carefully the contract and sing, if agree ang then come back!");
            }
        } else {
                System.out.println("You are to jump, sorry!It is very risky for your health!");
            }



        }

    public static int priceClassic (int quantity, int firstJump, int nextJump) {
        if (quantity == 0) {
            return 0;
        } else if (quantity == 1) {
            return firstJump;
        } else {
            return eachjumpQuatityPrice() + (nextJump * quantity);
        }

    }
        public static int priceDrone (int quantity,int firstJump, int nextJump) {
            if (quantity == 0) {
                return 0;
            } else if (quantity == 1) {
                return firstJump;
            } else {
                return eachjumpQuatityPrice() + (nextJump + dronePhotoShootingPrice() * quantity);
            }
        }
        public static int priceGoPro(int quantity, int firstJump, int nextJump) {
            if (quantity == 0) {
            } else if (quantity == 1) {
                return firstJump;
            } else {
                return eachjumpQuatityPrice() + ((nextJump + goProPhotoShootingPrice() * quantity));
            }
            return quantity;
        }

    public static int eachjumpQuatityPrice(){
    int plusOneJump=1000;
    return plusOneJump;
    }
    public static int startJumpPrice(){
        int startPrice=2000;
        return startPrice;
    }
    public static int nextjumpPrice(){
        int nextPrice=1000;
        return nextPrice;
    }
    public static int goProPhotoShootingPrice(){
        int goPro= 200;
        return goPro;
    }
    public static int dronePhotoShootingPrice(){
        int drone=400;
        return drone;
    }
}

