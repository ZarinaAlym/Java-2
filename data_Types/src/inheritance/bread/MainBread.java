package inheritance.bread;

public class MainBread {
    public static void main(String[] args) {
        Bread myBread= new Bread("Boorsok");
        System.out.println("May Tokoch: "+ myBread.getName());
        Ingredient myIngridient= new Ingredient(myBread);
        System.out.println(myIngridient.getBoorsok());
        System.out.println(myIngridient);
    }
}
