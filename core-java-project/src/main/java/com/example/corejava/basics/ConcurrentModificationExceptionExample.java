package com.example.corejava.basics;

import java.util.*;

/**
 * Demonstrates ConcurrentModificationException in Java
 */
public class ConcurrentModificationExceptionExample {
    public static void demonstrate() {
        System.out.println("ConcurrentModificationException Example:");
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("  Original list: " + list);
        try {
            for (String item : list) {
                if (item.equals("B")) {
                    list.remove(item); // This will throw ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Exception caught: " + e);
        }
        // Correct way: use iterator's remove
        list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("B")) {
                it.remove();
            }
        }
        System.out.println("  List after safe removal: " + list);
    }
}
