package access_modifiers.privatnyi;

import access_modifiers.SuperClass;

public class Privatnyi extends SuperClass {
    public static void main(String[] args) {

        Privatnyi priv=new Privatnyi();
        System.out.println(priv.nameProtected2("Protected"));
    }


    String namePublic1(String name) {
        return "Hi " + name;
    }

    protected static String nameProtected1(String name) {
        return "Hi " + name;
    }

    static String nameDefault1(String name) {
        return "Hi " + name;
    }

    private static String namePrivate1(String name) {
        return "Hi " + name;
    }
}