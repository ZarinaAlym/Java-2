package constructors;

import inheritance.Son;

public class GrandSon extends Son {
    public GrandSon(String name, int age, String nose, String hair) {
        super(name, age, nose, hair);

    }

    @Override
    public String talant() {
        return super.talant();
    }

    @Override
    public String toString() {
        return "GrandSon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
