package if_else;

import java.util.Scanner;

public class HomeTast1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите возраст ребенка");
        int age = scan.nextInt();
        if (age >= 0 && age < 2) {
            System.out.println("ясельная групаа");
        } else if (age >= 2 && age < 4) {
            System.out.println("младшая группа");
        } else if (age >= 5 && age < 6) {
            System.out.println("Старшая группа");
        } else if (age >= 6 && age <= 7) {
            System.out.println("подготовительная группа");

        }
    }
}