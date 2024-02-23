package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println("____________");

        int a1=11;
        int b1=2;
        System.out.println(a1 / b1);
        System.out.println(a1 % b1);

        System.out.println("_________");
        // инкремент  ++ (+1) | // дикремент -- (-1)
        int a2=0;
        System.out.println(a2++); // 0
        System.out.println(a2++); //1
        System.out.println(a2++); //2
        System.out.println(a2++); //3
        System.out.println(a2++);
        System.out.println("________");

        // prefix ++a --a | //postfix a++ a--
        int a3=0; // prefix
        System.out.println(++a3); //1
        System.out.println(++a3); //2
        System.out.println(++a3); //3
        System.out.println(++a3); //4
        System.out.println(++a3); //5
        System.out.println("________");

        int a4=10;
        System.out.println(a4--); //10
        System.out.println(a4--); //9
        System.out.println(a4--); //8
        System.out.println(a4--); //7
        System.out.println(a4--); //6





    }

}
