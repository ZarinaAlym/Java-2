package if_else;

import java.util.Scanner;
public class HomeTast2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("укажите школу");
        String name = scan.nextLine();

        if (name == "школа Сапат")
        {
            System.out.println("kirgenge bolot");
        } else {
            System.out.println("Kirgenge bolboit");
        }
    }
    }


