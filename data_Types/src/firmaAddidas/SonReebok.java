package firmaAddidas;

public class SonReebok extends AddidasDad{
    public SonReebok(String name, int age, String type, String season) {
        super(name, age, type, season);
    }

    @Override
    public String design() {
        return "classic";

    }

    @Override
    public String toString() {
        return "SonReebok{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                "season='" + getSeason() + '\'' +
                '}';
    }
    public SonReebok(String name, int age){
        super(name, age);
    }

}
