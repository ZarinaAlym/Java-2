package src.wrappers;

public class WrapperClasses {
    // Primitivnye              No -primitive
    // Boolean          Boolean
    // char             char
    //int               int
    //byte              byte
    // double           double
    //long              long
    //short
    //float

    //

    public static void main(String[] args) {
        int num = 55;
        System.out.println(num);

        Integer num2 =22;
        System.out.println(num2);
        System.out.println(num2.hashCode());

        Character ch ='d';
        System.out.println(ch.equals(64));

        // Autoboxing

        int num3= 44;
        Integer autoboxed = num3;
        System.out.println(autoboxed);

        // unboxing


    }
}
