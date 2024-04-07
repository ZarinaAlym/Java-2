package encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student stom1= new Student("Asanov",15,"stom",true,555555555);
        System.out.println(stom1.getNumber());
        stom1.setNumber(777);
        System.out.println(stom1.getNumber());



    }
}
