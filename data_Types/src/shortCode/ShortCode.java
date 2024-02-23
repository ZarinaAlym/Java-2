package shortCode;

public class ShortCode {
    public static void main(String[] args) {
        if (55 > 1) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

            // условие?      true: false
        String bool=(55>1)? "yes": "no";
        System.out.println(bool);


        boolean result = ("Hi".equals("Hi"))? true: false;
        System.out.println(result);
    }
}
