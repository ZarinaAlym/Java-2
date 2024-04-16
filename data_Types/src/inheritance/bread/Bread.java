package inheritance.bread;

public class Bread {
    private String name;

    public Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                '}';
    }
}
