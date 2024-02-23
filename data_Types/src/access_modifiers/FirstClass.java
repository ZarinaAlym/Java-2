package access_modifiers;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println(namePublic("Public"));
        System.out.println(nameProtected("Protected"));
        System.out.println("Default");



    }

    public static String namePublic(String name){
        return "Hi "+name;
    }
    protected static String nameProtected(String name){
        return "Hi "+name;
    }
    static String nameDefault(String name){
        return "Hi "+name;
    }
    private static  String namePrivate(String name){
        return "Hi "+name;
    }
}
