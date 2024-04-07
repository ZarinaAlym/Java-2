package inheritance.apple;

public class MacBook {
    public String name;
    protected  int age;
    String color;
    private String OS;

    public MacBook(String name, int age, String color, String OS) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.OS = OS;
    }

    public MacBook(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
    public String battery(){
        return "week";
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}

