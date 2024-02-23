
package codingbat;

public class String1 {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("Mira"));

    }

      public static String helloName(String name) {
        return "Hello " + name;
    }

//    helloName("Bob") → "Hello Bob!"
}