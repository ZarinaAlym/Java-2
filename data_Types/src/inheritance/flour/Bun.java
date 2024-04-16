package inheritance.flour;

public class Bun extends Bread{


    public Bun(String name, int size, String sostav) {
        super(name, size, sostav);
    }

    public Bun(String name, int size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Bun{" +
                "name='" + name + '\'' +
                ", size=" + size +
                "sostav='" + getSostav() + '\'' +
                '}';
    }
}
