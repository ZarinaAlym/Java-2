package loops;

import java.util.Scanner;

public class LoopTast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite login");
        String login = scan.nextLine();

        for (int i = 0; i < login.length(); i++) {

            if (login.charAt(i) == '@') {
                System.out.println("vvedite parol");
                String parol= scan.nextLine();
                for (int y = 0; y < parol.length(); y++){
                    if (parol.charAt(y) == '$'){
                        System.out.println("vy zaregistrirovany");
                }else {
                        System.out.println("dobavte v parol znak $");
                        break;
                    }

                }



            }else {
                System.out.println("ne vernyi login");
            }
        }
    }
}


