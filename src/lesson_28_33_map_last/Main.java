package lesson_28_33_map_last;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();

        map.put("key0", 123);
        map.put("key1", 8);
        map.put("key2", 9);
        map.put("key3", 8);
        map.put("key3", 10);

        Integer ki = map.get("key3");

        System.out.println(ki);

        map.remove("key2");

        for(String k : map.keySet()){
            System.out.println(k);
        }

        for(Integer i : map.values()){
            System.out.println(i);
        }

        System.out.println(map.containsKey("key0"));
        System.out.println(map.containsKey("key1000000"));
        System.out.println(map.containsValue(123));
        System.out.println(map.containsValue(0));

    }

}
