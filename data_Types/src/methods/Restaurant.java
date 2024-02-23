package methods;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите провести мероприятие?  1. Yes. 2.No");
        int event = scan.nextInt();
        if (event == 1) {
            System.out.println("How many guests? 1.>100 .2.<100");
          int guests = scan.nextInt();
           System.out.println("выберите тип. 1.простой 2.сред. 3.выш.");
           double type = scan.nextDouble();
         System.out.println(",,,,,,,,,,,");
           int quantity = scan.nextInt();
            if (type == 1) {
                System.out.println("please pay " + priceProct(quantity) + " KGS");
           } else if (type == 2) {
                System.out.println("please pay " + priceSred(quantity) + " KGS");
            } else if (type == 3) {
                System.out.println("please pay " + priceVyssh(quantity)+ " KGS");

            } else {
               System.out.println("please read carefully the contract and sing");
           }
        } else {System.out.println("___________");
       }

    }
    public  static double priceProct(int quantity){
        if (quantity >=100) {
            return ((salad()+pervoe()+vtoroe())*quantity)*0.15;
        } else {
            return (salad()+pervoe()+vtoroe())*quantity;
        }

    }
    public static double priceSred(int quantity) {
        if (quantity >= 100) {
            return ((salad()+pervoe()+vtoroe()+ dessert()) * quantity) * 0.15;
        } else {
            return (salad()+pervoe()+vtoroe()+ dessert()) * quantity;
        }

    }
    public static double priceVyssh(int quantity){
        if (quantity >= 100) {
            return ((salad()+pervoe()+vtoroe()+ dessert() + PhotoVideo()) * quantity) * 0.15;
        } else {
            return (salad()+pervoe()+vtoroe()+ dessert()+ PhotoVideo()) * quantity;
        }

    }


    public static int salad(){
        int Oliviersalad =300;
        return Oliviersalad;
    }
    public static int pervoe(){
        int sup=400;
        return sup;
    }
    public static int vtoroe(){
        int ryba =500;
        return ryba;
    }
    public static int dessert(){
        int cake=350;
        return cake;
    }
    public static int PhotoVideo(){
        int Photo=700;
        return Photo;
    }
}

