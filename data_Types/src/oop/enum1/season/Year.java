package oop.enum1.season;

public class Year {
    public String name;
    public int year;
    private Season season;

    public Year(String name, int year, Season season) {
        this.name = name;
        this.year = year;
        this.season = season;
    }
}
