package ss12_java_collections_framework.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("orange", 2);
        hashMap.put("banana", 3);
        hashMap.put("pear", 4);

// Khởi tạo một đối tượng TreeMap bằng cách sao chép từ HashMap
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);

// In ra các phần tử của TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
    }
