package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set1 {
    public static void main(String[] args) {
        // HashSet        LinkedHashSet      TreeSet
        // Set no index

        HashSet<Integer> set1 =new HashSet<>();
        set1.add(0);
        set1.add(5);
        set1.add(33);
        set1.add(33);
        set1.add(445555);
        set1.add(31);
        set1.add(333);

        LinkedHashSet<Integer> set2 =new LinkedHashSet<>();
        set2.add(2);
        set2.add(21);
        set2.add(0);
        set2.add(666);
        set2.add(256);
        set2.add(44);
        set2.add(25);
        System.out.println(set2);

        TreeSet<Integer> set3= new TreeSet<>();
        set3.add(44);
        set3.add(44);
        set3.add(0);
        set3.add(45);
        set3.add(2);
        set3.add(555);
        System.out.println(set3);









    }
}
