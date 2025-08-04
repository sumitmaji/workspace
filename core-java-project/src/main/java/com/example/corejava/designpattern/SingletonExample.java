package com.example.corejava.designpattern;

/**
 * Demonstrates the Singleton Design Pattern in Java
 */
public class SingletonExample {
    public static void demonstrate() {
        System.out.println("Singleton Pattern Example:");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("  instance1 hash: " + instance1.hashCode());
        System.out.println("  instance2 hash: " + instance2.hashCode());
        System.out.println("  Both instances are the same: " + (instance1 == instance2));
    }
}

// Thread-safe, lazy-loaded Singleton implementation
class Singleton {
    private static volatile Singleton instance;
    private Singleton() { /* private constructor */ }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
