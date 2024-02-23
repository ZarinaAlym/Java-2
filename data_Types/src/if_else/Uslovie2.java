package if_else;

import java.util.Scanner;

public class Uslovie2 {
    public static void main(String[] args) {

        // if else statement -ladder
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 0 && age < 16 ){
            System.out.println("internathion pasport alsa bolot");

        }else if (age >=16 && age <=120){
            System.out.println("ID passport");
        } else {
            System.out.println("No passport");
        }

    }
}
