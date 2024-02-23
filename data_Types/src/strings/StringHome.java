package strings;

import java.util.Scanner;

public class StringHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hotite zapisatsa na kurs ");
        boolean inn = scan.nextBoolean();
        if (inn = true) {
            System.out.println("vvedite inn");
            String inn1 = scan.next();
            if (inn1.substring(0, 1).equals("1") ) {
                System.out.println("Jenckiy");
            } else if (inn1.substring(0, 1).equals("2")) {
                System.out.println("Mujskoi");
            } else {
                System.out.println("drugoe");
            }
            if (inn1.substring(3, 5).equals("01")) {
                System.out.println("january");
            } else if (inn1.substring(3,5).equals("2")) ;
                System.out.println("febrely");

            }
        }

//                System.out.println(inn1.substring(3, 5) + " - may "+ inn1.substring(5, 9) + " god" );






         // 14-may 1988-g m

        }





