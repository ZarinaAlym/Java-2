package inheritance.apple;

public class AppleWatch extends IPhone{
    public AppleWatch(String name, int age, String color, String OS) {
        super(name, age, color, OS);
    }

    @Override
    public String battery() {
        return "1 day";
    }

    @Override
    public String toString() {
        return "AppleWatch{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                "AppleWatch='" + getOS() + '\'' +
                '}';
    }
}
