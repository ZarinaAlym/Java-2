package loops;

public class Loop1 {
    public static void main(String[] args) {
                //0
                //1
                //2
                //3
                //4
                //5
                //6 выходит из цикла
        for(int i = 0;i<=5;i++) {
          System.out.print(i+" ");


        }
        for (int i= 10; i >= 0;i--) {
            System.out.print(i + " ");
        }
            String color = "Black";
            for (int i = 0; i < color.length(); i++){
                System.out.println(color.charAt(i));
            }
            for (int k=1; k<=10;k++){
                System.out.println(k+" * 2 = "+k*2);
            }


    }
}
