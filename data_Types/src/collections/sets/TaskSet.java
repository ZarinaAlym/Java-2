package collections.sets;

import java.util.*;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Asan");
        name.add("Igor");
        name.add("Aigul");
        name.add("Aruuke");
        name.add("Bayaman");
        name.add("Alixan");
        System.out.println(name);

        HashSet<String> name1 = new HashSet<>(name);
        System.out.println(name1);

        Set<String> name2 = new TreeSet<>(name);
        System.out.println(name2);
        System.out.println("__________________________");

        Set<String> name3 = new HashSet<>();
        name3.add("Alina");
        name3.add("Alisha");
        name3.add("Diana");
        name3.add("Raniya");
        name3.add("Kamila");
        name3.add("Burulay");
        System.out.println("spisor imen");

//        for (String names: name3) {
//            if (name3.length() ==5) {
//                name3.add(names);
//                System.out.println(names);
//


                String name4= "Washington";
                System.out.println(name4.length());
                System.out.println(name4.hashCode());
                System.out.println(name4.charAt(1));
                System.out.println(name4.toUpperCase());
                System.out.println(name4.concat(name4));
                System.out.println(name4.substring(0,5));
                System.out.println(name4.indexOf(0,2));

                System.out.println("_______________");

        StringBuilder city= new StringBuilder("Tashkent");
        city.replace(0,3,"Tash");
        System.out.println(city);

        


    }


        }

