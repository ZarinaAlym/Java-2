package inheritance.flour;

public class Bread {
    public  String name;
    protected int size;
    private String sostav;

    public Bread(String name, int size, String sostav) {
        this.name = name;
        this.size = size;
        this.sostav = sostav;
    }

    public Bread(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getSostav() {
        return sostav;
    }

    public void setSostav(String sostav) {
        this.sostav = sostav;
    }
    public String taste(){
        return "delicion";
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", sostav='" + sostav + '\'' +
                '}';
    }
}
