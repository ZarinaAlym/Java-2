package inheritance.flour;

public class Croissants extends Bun{

    public Croissants(String name, int size, String sostav) {
        super(name, size, sostav);
    }

    public Croissants(String name, int size) {
        super(name, size);
    }

    @Override
    public String taste() {
        return "sweet";
    }

    @Override
    public String toString() {
        return "Croissants{" +
                "name='" + name + '\'' +
                ", size=" + size +
                "croissats='" +getSostav() + '\'' +
                '}';
    }
}
