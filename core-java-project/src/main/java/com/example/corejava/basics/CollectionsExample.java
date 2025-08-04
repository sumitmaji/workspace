package com.example.corejava.basics;

import java.util.*;

/**
 * Demonstrates Java Collections Framework
 */
public class CollectionsExample {
    public static void demonstrate() {
        System.out.println("Collections Example:");
        // List
        List<String> list = new ArrayList<>();
        list.add("Apple"); list.add("Banana"); list.add("Orange");
        System.out.println("  List: " + list);
        // Set
        Set<String> set = new HashSet<>(list);
        set.add("Apple"); // duplicate ignored
        System.out.println("  Set: " + set);
        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1); map.put("B", 2); map.put("C", 3);
        System.out.println("  Map: " + map);
        // Iteration
        System.out.print("  List iteration: ");
        for (String fruit : list) System.out.print(fruit + " ");
        System.out.println();
        // Sorting
        Collections.sort(list);
        System.out.println("  Sorted List: " + list);
    }
}
