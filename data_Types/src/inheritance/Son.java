package inheritance;

public class Son extends Dad{

    public Son(String name, int age, String nose, String hair) {
        super(name, age, nose, hair);
    }

    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public String talant() {
        return "designer";
    }


    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nose='" + nose + '\'' +
                '}';
    }
}
