package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map1 {
    public static void main(String[] args) {

        // Map --> No Index (X)  key, value
        Map<String,Integer> mobiOperator= new HashMap<>();
        mobiOperator.put("MegaCom",555);
        mobiOperator.put("O!",700);
        mobiOperator.put("Beeline",772);
        mobiOperator.put("Beeline", 771);

        System.out.println(mobiOperator);//{Beeline=772, O!=700, MegaCom=555}



        // predictable order
        LinkedHashMap<Boolean,String>linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(false,"no");
        linkedHashMap.put(true,"yes");
        System.out.println(linkedHashMap);

        TreeMap<Integer,String> studens = new TreeMap<>();
        studens.put(3, "Zarina");
        studens.put(1, "Sanzhar");
        studens.put(2, "Zamishka");
        System.out.println(studens);//{1=Sanzhar, 2=Zamishka, 3=Zarina}





    }
}
