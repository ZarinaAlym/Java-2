package oop;

public class Programer {

    public  String name;

    public int experience;
    public String jobtitle;
    public String edu;
    public String hobby;
    public  int age;
    public String nationality;

    public String coding(){
        return "coding Java";
    }
    public String relax(){
        return "swiming";

    }


    @Override
    public String toString() {
        return "Programer{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", jobtitle='" + jobtitle + '\'' +
                ", edu='" + edu + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
