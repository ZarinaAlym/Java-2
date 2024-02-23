package StringBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SB1 {
    public static void main(String[] args) {
        String name= "Zamira";

        String surname= "Sagynalieva";
        StringBuilder sb1= new StringBuilder("Bishkek");
                                      //0123456789
        sb1.insert(0,312);// 312Bishkek
        System.out.println(sb1);
        sb1.insert(6,"KG");
        System.out.println(sb1);



        // replace()                         0123456789
       StringBuilder sb2= new StringBuilder("Kyrgyzstan");
       sb2.replace(0,3,"Bish");
        System.out.println(sb2);
        //                                    0123456
        StringBuilder sb3= new StringBuilder("Germany");
        // reverse
        StringBuilder sb4= new StringBuilder("kitep");
        sb4.reverse();
        System.out.println(sb4);//petik

        StringBuilder sb5= new StringBuilder("nan");
        sb5.reverse();
        System.out.println(sb5);

        // delete()
        StringBuilder sb6= new StringBuilder("iphone");
        sb6.delete(0,2); // home
        System.out.println(sb6);
        // deleteCharAt()
        sb6.deleteCharAt(1); // home-> hme
        System.out.println(sb6);

        // toString()
        StringBuilder sb7=new StringBuilder("Beku Beku");
        System.out.println(sb7);

        int[] arr={23,45,2,34};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // append
        StringBuilder sb8=new StringBuilder("Zarina");
        StringBuilder sb9= new StringBuilder("Alymbaeva");
        sb8.append(sb9);
        System.out.println(sb8);






    }


}
