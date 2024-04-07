package encapsulation;

public class Car {
public String mark;
public String model;
private String program;

    public Car(String mark, String model, String program) {
        this.mark = mark;
        this.model = model;
        this.program = program;


    }
        // getter metod
    public String getProgram() {
        return program;
    }
        // setter metod
    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
