package methods;

public class Method2 {
    public static void main(String[] args) {
        // модификаторы доступа || Access modifiers свой класс   сабкласс своя папка другой
        // 1.public---> доступны по всем проекта        \/          \/         \/        \/
        // 2. protected-->                              \/          \/         \/         --
        // 3. default -->                               \/          \/         --
        // 4. private-->                                \/           --
        // опциональное || optional
        // 1.static
        // 2. final
        // 3. abstract
        final String name ="Nuradis";// постоянный constant
       String name1=name.toUpperCase();// игнорируется
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        int num=2;
       // final num = 3;
        final int inn=1171988000;
        final  int id  = 66;

        final StringBuilder sb1= new StringBuilder("Hello");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());
        sb1.append("nn");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());
        System.out.println(kolichestvo(100));
        Method2 new_name= new Method2();
        System.out.println(new_name.hello("Zarina"));
        sendMessage("privet");



        // static method

    }

public  static int summa(int sum,int sum1){
        return sum+sum1;
}
public static int kolichestvo(int num){
        return num*100;
}

// non static method
    public String hello(String name){
        return "Hi " +name;
    }
// non-return method
    public static void sendMessage(String message){
        System.out.println("Message delivered");

    }
}

