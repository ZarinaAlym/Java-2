package encapsulation;

public class Student {
    public String name;
    public int quantity;
    public String fakultet;
    public boolean free;
    private int number;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", fakultet='" + fakultet + '\'' +
                ", free=" + free +
                ", number=" + number +
                '}';
    }

    public Student(String name, int quantity, String fakultet, boolean free, int number) {
        this.name = name;
        this.quantity = quantity;
        this.fakultet = fakultet;
        this.free = free;
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
}
