package StringBuilder;

public class SB3 {
    public static void main(String[] args) {
        //==   links
        //.eguels()  valus
        // string - изменяемый    StringBuilder не изменяемый
        // pool

        String str1= "Naryn";
        String str2= "Naryn";
        boolean rest1=str1==str2;
        boolean rest2= str1.equals(str2);
        System.out.println(rest1);
        System.out.println(rest2);
        System.out.println("____");

        System.out.println(str1.hashCode());//75037780
      // HEAP
        StringBuilder sb1= new StringBuilder("Bishkek");
        StringBuilder sb2= new StringBuilder("Bishkek");
        StringBuilder sb3=new StringBuilder("Naryn");
        boolean res3=sb1==sb2;// false
       boolean res4=sb1.equals(sb2); //false
        System.out.println(res3);
        System.out.println(res4);









    }
}
