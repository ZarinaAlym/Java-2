package oop.abstraction;

public abstract class Animals {
    public  String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public abstract void voice();



    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public void run(){
        System.out.println("run,run.....");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
