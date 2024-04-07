package encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car lexuz= new Car("lexus", "Gx470", "avtopilot");
        System.out.println(lexuz);
        System.out.println(lexuz.mark);
        System.out.println(lexuz.model);
        System.out.println(lexuz.getProgram());
        lexuz.setProgram("avtopilot2");
        System.out.println(lexuz.getProgram());
    }
}
