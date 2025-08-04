package com.example.corejava.basics;

import java.util.concurrent.*;

/**
 * Demonstrates usage of ConcurrentHashMap in Java
 */
public class ConcurrentHashMapExample {
    public static void demonstrate() {
        System.out.println("ConcurrentHashMap Example:");
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("  Initial map: " + map);

        // Concurrent update using threads
        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "T" + i;
                map.put(key, i * 10);
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("  Thread interrupted");
        }
        System.out.println("  Map after concurrent writes: " + map);

        // Iteration
        System.out.print("  Iterating: ");
        map.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();
    }
}
