import java.util.Scanner;

public class LoginParol {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("login");
        String username = scanner.next();
        if (username.equals("Zamira")) {
            System.out.println("Enter your password:");
        } else {
            System.out.println("не правильный логин");
        }int p = scanner.nextInt();
            if (p == 1234) {
                System.out.println("vy uspeshno voshli b account");
            }else {
                System.out.println("не правильный пароль");
            }




        }




    }


