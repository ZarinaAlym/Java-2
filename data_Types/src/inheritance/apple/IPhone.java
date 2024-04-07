package inheritance.apple;

public class IPhone extends MacBook{
    public IPhone(String name, int age, String color, String OS) {
        super(name, age, color, OS);
    }

    public IPhone(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                "OS='" + getOS() + '\'' +
                '}';
    }
}
