package net.htwater.think.D11.D11_02;

import java.util.*;

/**
 * Created by 96955 on 2019/4/4.
 */
public class PrintingContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + "  ");
        }

    }

    static void printMap(Map<String, String> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getValue() + "  ");
        }
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
