package operators;

public class Assingment {
    public static void main(String[] args) {

        // = += -= *= /= %= &= |= ^=
        // =
        int num = 10;
        System.out.println(num);

       // +=
        num += 5;
        // num= num + 5
        System.out.println(num);

        // -=
        num -=1;
        System.out.println(num);

        //*=
        num *=2;
        System.out.println(num);

        // /=
        num /= 4;
        System.out.println(num);

        // %=
        num %= 3;
        System.out.println(num);


        int a = 8;
        int b = 0;
        for (int i = 5; i < a; i++){
            b += i;  // b = b + i;      b = b - i  --> b -= i;
            // b = 0 + 5  --> 5
            // b = 5 + 6  --> 11
            // b = 11 + 7 -- > 18
            System.out.println(b);

        }



    }
}