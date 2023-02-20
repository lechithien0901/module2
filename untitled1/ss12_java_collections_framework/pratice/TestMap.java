package ss12_java_collections_framework.pratice;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Display entries in Hashmap");
        System.out.println( hashMap+"\n");
        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.println(treeMap);
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println(linkedHashMap.get("Lewis"));
        linkedHashMap.get("Smith");
        System.out.println(linkedHashMap);
        TreeMap<String, Integer> customOrderTreeMap = new TreeMap<>(Comparator.comparing(String::length).thenComparing(String::compareTo));
        customOrderTreeMap.put("apple", 1);
        customOrderTreeMap.put("banana", 2);
        customOrderTreeMap.put("cat", 3);
        customOrderTreeMap.put("dog", 4);

    }
}
