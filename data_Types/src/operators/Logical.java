package operators;

public class Logical {
    public static void main(String[] args) {


                // true         true
        boolean a= 24 > 10 && 30==30; // true
        System.out.println(a);

                //false     &&     true
        boolean a1 = 25 < 10 && 1==1; // false
        System.out.println(a1);

                // true   &&   false
        boolean a2 = 1==1 && 20<10;//false
        System.out.println(a2);

                //false  && false
        boolean a3 = 1>10 && 2>10;
        System.out.println(a3);// false

        System.out.println("________________________");
                // true     ||    true
        boolean b= 24 > 10 || 30==30; // true
        System.out.println(b);

                //false     ||    true
        boolean b1 = 25 < 10 || 1==1; // true
        System.out.println(b1);

                // true   ||  false
        boolean b2 = 1==1 || 20<10;//true
        System.out.println(b2);

                //false  ||  false
        boolean b3 = 1>10 || 2>10;
        System.out.println(b3);// false

    }
}
