package loops;

import java.util.Scanner;

public class WhileTast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite login");
        String login = scan.nextLine();
        int i =0;
        while ( i < login.length()){
            i++;
            if (login.contains("@")  ) {
                System.out.println("vvedite parol");
                String parol= scan.nextLine();
                int y = 0;
                while ( y < parol.length()){
                    y++;
                }
                  if (parol.contains("$")  ){
                        System.out.println("vy zaregistrirovany");
                    }else {
                        System.out.println("dobavte v parol znak $");
                        break;
                    }

                }else {

            } System.out.println("ne vernyi login");
            }

            }
        }
