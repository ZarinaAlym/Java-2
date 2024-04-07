package firmaAddidas;

public class AddidasDad {
    public String name;
    protected int age;
    String type;
    private String season;

    public AddidasDad(String name, int age, String type, String season) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.season = season;
    }

    public AddidasDad(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String design() {
        return "sport";
    }

    @Override
    public String toString() {
        return "AddidasDad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", season='" + season + '\'' +
                '}';
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
