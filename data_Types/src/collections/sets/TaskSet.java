package collections.sets;

import java.util.*;

public class TaskSet {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Asan");
        name.add("Igor");
        name.add("Aigul");
        name.add("Aruuke");
        name.add("Bayaman");
        name.add("Alixan");
        System.out.println(name);

        HashSet<String> name1=new HashSet<>(name);
        System.out.println(name1);

        Set<String> name2=new TreeSet<>(name);
        System.out.println(name2);


    }
}
