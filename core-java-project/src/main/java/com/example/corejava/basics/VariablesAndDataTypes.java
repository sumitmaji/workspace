package com.example.corejava.basics;

/**
 * Demonstrates various data types and variables in Java
 */
public class VariablesAndDataTypes {
    
    public static void demonstrate() {
        System.out.println("Variables and Data Types:");
        
        // Primitive data types
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        char charVar = 'A';
        boolean booleanVar = true;
        
        // Reference data type
        String stringVar = "Hello, Java!";
        
        // Display values
        System.out.println("  Byte: " + byteVar);
        System.out.println("  Short: " + shortVar);
        System.out.println("  Int: " + intVar);
        System.out.println("  Long: " + longVar);
        System.out.println("  Float: " + floatVar);
        System.out.println("  Double: " + doubleVar);
        System.out.println("  Char: " + charVar);
        System.out.println("  Boolean: " + booleanVar);
        System.out.println("  String: " + stringVar);
        
        // Constants
        final double PI = 3.14159;
        System.out.println("  Constant PI: " + PI);
        
        // Type conversion
        demonstrateTypeConversion();
    }
    
    private static void demonstrateTypeConversion() {
        System.out.println("\n  Type Conversion Examples:");
        
        // Implicit conversion (widening)
        int intValue = 100;
        long longValue = intValue;  // int to long
        double doubleValue = longValue;  // long to double
        System.out.println("    Implicit: int(" + intValue + ") -> long(" + longValue + ") -> double(" + doubleValue + ")");
        
        // Explicit conversion (narrowing)
        double d = 100.04;
        int i = (int) d;  // explicit casting
        System.out.println("    Explicit: double(" + d + ") -> int(" + i + ")");
        
        // String conversion
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("    String to int: \"" + numStr + "\" -> " + num);
        
        String result = String.valueOf(num);
        System.out.println("    int to String: " + num + " -> \"" + result + "\"");
    }
}
