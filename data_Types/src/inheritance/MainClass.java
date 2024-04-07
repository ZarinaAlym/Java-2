package inheritance;

import constructors.GrandSon;

public class MainClass {
    public static void main(String[] args) {

        Dad asn= new Dad("Asan",99,"stright", "curky");
        Dad usun= new Dad("Uson",67);
        System.out.println(asn);
        System.out.println(usun);
        Son bektur = new Son("bektur",65);
        System.out.println(bektur);
        System.out.println(bektur.talant());

        System.out.println("_____________");
        GrandSon bek= new GrandSon("Bek",7,"primoi","curly");
        System.out.println(bek);
        System.out.println(bek.talant());
        System.out.println("_______________");
        Dad meken= new Son("Meken", 12,"gorbatyi","korotkyi");
        System.out.println(meken);
        System.out.println(meken.talant());
        Dad beken = new Dad("Beken",32,"gorbatyi","curly");
        System.out.println(beken);
        System.out.println(beken.talant());
    }

    public static class VW {
        public  String name;
        protected  int age;
        String kusov;
        private String enine;

        public VW(String name, int age, String kusov, String enine) {
            this.name = name;
            this.age = age;
            this.kusov = kusov;
            this.enine = enine;
        }

        public String getEnine() {
            return enine;
        }

        public void setEnine(String enine) {
            this.enine = enine;
        }

        @Override
        public String toString() {
            return "VW{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", kusov='" + kusov + '\'' +
                    ", enine='" + enine + '\'' +
                    '}';
        }
    }
}
