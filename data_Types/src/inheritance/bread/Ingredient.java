package inheritance.bread;

public class Ingredient {
    private Bread boorsok;

    public Ingredient(Bread boorsok) {
        this.boorsok = boorsok;
    }

    public Bread getBoorsok() {
        return boorsok;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "boorsok=" + boorsok +
                '}';
    }
}
