package com.example.corejava.basics;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Demonstrates functional programming, lambda expressions, and streams in Java
 */
public class FunctionalProgrammingExample {
    public static void demonstrate() {
        System.out.println("Functional Programming Example:");
        // Lambda expression with functional interface
        Calculator add = (a, b) -> a + b;
        System.out.println("  Lambda add: 5 + 3 = " + add.calculate(5, 3));
        // Method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.print("  Method reference (forEach): ");
        names.forEach(System.out::print);
        System.out.println();
        // Stream API: filter, map, collect
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("  Even squares: " + evenSquares);
        // Stream reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("  Sum using reduce: " + sum);
        // Predicate and Function
        Predicate<String> isLong = s -> s.length() > 3;
        Function<String, String> toUpper = String::toUpperCase;
        List<String> filtered = names.stream().filter(isLong).map(toUpper).collect(Collectors.toList());
        System.out.println("  Filtered and uppercased: " + filtered);
    }
    // Functional interface
    interface Calculator {
        int calculate(int a, int b);
    }
}
