package switch1;

import java.util.Scanner;

public class SwitchHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String qvartal = scan.next();
        switch (qvartal){
            default:

                System.out.println("myndai qvartak jok");
                break;
            case"january":
            case "febuary":
            case "March":

                System.out.println("1 qvartal");
            break;
            case"April":
            case "May":
            case "June":
                System.out.println("2 qvartal");
                break;
            case "July":
            case "Avgust":
            case"September":
                System.out.println("3 qvartal");
            case"Oktober":
            case "Novomber":
            case "Dekember":
                System.out.println("4 qvartal");

        }
//
//    Scanner scan=new Scanner(System.in);
//    String qvartal = scan.next();
//    if (qvartal.equals("january")|| qvartal.equals("Febuary")|| qvartal.equals("March")){
//        System.out.println("1-qvartal");
//    } else if (qvartal.equals("April") || qvartal.equals("May") ||qvartal.equals("June")){
//        System.out.println("2-qvartal");
//    }else if (qvartal.equals("July")|| qvartal.equals("Avgust") ||qvartal.equals("september")) {
//        System.out.println("3-qvartal");
//    } else if (qvartal.equals("Oktober")|| qvartal.equals("Novomber")||qvartal.equals("Dekember"))
//        {
//            System.out.println("4-qvartal");
//        } else
//        System.out.println("myndai kvartal joc");
    }


    }

