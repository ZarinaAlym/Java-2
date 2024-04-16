package inheritance.practice;

public class Passenger {
    // Is A--. Dad--> Son--> Association

    public String name;
    private int age;

    public Passenger(String namt, int age) {
        this.name = namt;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
