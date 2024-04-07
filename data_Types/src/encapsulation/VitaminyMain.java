package encapsulation;

public class VitaminyMain {
    public static void main(String[] args) {
        Vitaminy d3=new Vitaminy("d3","d3,Ca",05f,60,100,"Iherb",800);
        System.out.println(d3.getPrice());
        d3.setPrice(1000);
        System.out.println(d3.getPrice());
    }
}
