package com.example.corejava.basics;

/**
 * Demonstrates Exception Handling in Java
 */
public class ExceptionHandlingExample {
    public static void demonstrate() {
        System.out.println("Exception Handling Example:");
        try {
            int result = divide(10, 0);
            System.out.println("  Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("  Caught exception: " + e.getMessage());
        } finally {
            System.out.println("  Finally block executed");
        }
        // Custom exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("  Custom exception: " + e.getMessage());
        }
    }
    static int divide(int a, int b) { return a / b; }
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be 18 or older");
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}
