package com.javaconcepts.collections.collectionspart4.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap is a non-synchronized, non-thread-safe collection.
        // It allows null keys and values.

        Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
        rollNumberVsNameMap.put(null, "TEST");
        rollNumberVsNameMap.put(0, null);
        rollNumberVsNameMap.put(1, "A");
        rollNumberVsNameMap.put(2, "B");

        // compute if present
        rollNumberVsNameMap.putIfAbsent(null, "test");
        rollNumberVsNameMap.putIfAbsent(0, "ZERO");
        rollNumberVsNameMap.putIfAbsent(3, "C");

        for (Map.Entry<Integer, String> entryMap : rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // isEmpty
        System.out.println("Is empty? " + rollNumberVsNameMap.isEmpty());

        // size
        System.out.println("Size: " + rollNumberVsNameMap.size());

        // containsKey
        System.out.println("Contains key 3? " + rollNumberVsNameMap.containsKey(3));

        // containsValue
        System.out.println("Contains value 'A'? " + rollNumberVsNameMap.containsValue("A"));

        // get(key)
        System.out.println("Value for key 1: " + rollNumberVsNameMap.get(1));

        // getOrDefault(key, defaultValue)
        System.out.println("get(9): " + rollNumberVsNameMap.getOrDefault(9, "Default Value"));

        // remove(key)
        System.out.println("remove(null): " + rollNumberVsNameMap.remove(null));

        for (Map.Entry<Integer, String> entryMap : rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // keySet()
        for (Integer key : rollNumberVsNameMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // values()
        Collection<String> values = rollNumberVsNameMap.values();
        for (String value : values) {
            System.out.println("Value: " + value);
        }
    }
}
