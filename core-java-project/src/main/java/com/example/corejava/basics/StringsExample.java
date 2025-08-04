package com.example.corejava.basics;

/**
 * Demonstrates String operations in Java
 */
public class StringsExample {
    
    public static void demonstrate() {
        System.out.println("Strings:");
        
        // String creation and basic operations
        demonstrateStringBasics();
        
        // String methods
        demonstrateStringMethods();
        
        // StringBuilder and StringBuffer
        demonstrateStringBuilder();
    }
    
    private static void demonstrateStringBasics() {
        System.out.println("\n  String Basics:");
        
        // String creation
        String str1 = "Hello";  // String literal
        String str2 = new String("Hello");  // Using constructor
        String str3 = "Hello";
        
        System.out.println("    str1: " + str1);
        System.out.println("    str2: " + str2);
        System.out.println("    str3: " + str3);
        
        // String comparison
        System.out.println("    str1 == str3: " + (str1 == str3));  // Reference comparison
        System.out.println("    str1 == str2: " + (str1 == str2));  // Reference comparison
        System.out.println("    str1.equals(str2): " + str1.equals(str2));  // Content comparison
        System.out.println("    str1.equals(str3): " + str1.equals(str3));  // Content comparison
        
        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("    Full name: " + fullName);
        
        // String formatting
        String formatted = String.format("Name: %s, Age: %d, Salary: %.2f", "Alice", 30, 50000.75);
        System.out.println("    Formatted: " + formatted);
    }
    
    private static void demonstrateStringMethods() {
        System.out.println("\n  String Methods:");
        
        String text = "  Java Programming is Fun!  ";
        System.out.println("    Original: '" + text + "'");
        System.out.println("    Length: " + text.length());
        System.out.println("    Trimmed: '" + text.trim() + "'");
        System.out.println("    Uppercase: '" + text.toUpperCase() + "'");
        System.out.println("    Lowercase: '" + text.toLowerCase() + "'");
        
        // Substring operations
        String trimmed = text.trim();
        System.out.println("    Substring(0,4): '" + trimmed.substring(0, 4) + "'");
        System.out.println("    Substring(5): '" + trimmed.substring(5) + "'");
        
        // Character operations
        System.out.println("    Character at index 0: '" + trimmed.charAt(0) + "'");
        System.out.println("    Index of 'P': " + trimmed.indexOf('P'));
        System.out.println("    Last index of 'a': " + trimmed.lastIndexOf('a'));
        
        // String searching and replacement
        System.out.println("    Contains 'Java': " + trimmed.contains("Java"));
        System.out.println("    Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("    Ends with 'Fun!': " + trimmed.endsWith("Fun!"));
        System.out.println("    Replace 'Java' with 'Python': '" + trimmed.replace("Java", "Python") + "'");
        
        // String splitting
        String sentence = "apple,banana,orange,grape";
        String[] fruits = sentence.split(",");
        System.out.println("    Split result:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("      [" + i + "]: " + fruits[i]);
        }
        
        // String joining
        String joined = String.join(" | ", fruits);
        System.out.println("    Joined: " + joined);
    }
    
    private static void demonstrateStringBuilder() {
        System.out.println("\n  StringBuilder and StringBuffer:");
        
        // StringBuilder (not thread-safe, faster)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println("    StringBuilder result: " + sb.toString());
        
        // StringBuilder with initial capacity
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Java").append(" is ").append("awesome!");
        System.out.println("    StringBuilder chaining: " + sb2.toString());
        
        // StringBuilder methods
        sb2.insert(5, "really ");
        System.out.println("    After insert: " + sb2.toString());
        
        sb2.delete(5, 12);  // Delete "really "
        System.out.println("    After delete: " + sb2.toString());
        
        sb2.reverse();
        System.out.println("    Reversed: " + sb2.toString());
        
        // StringBuffer (thread-safe, slower)
        StringBuffer sbf = new StringBuffer("StringBuffer");
        sbf.append(" example");
        System.out.println("    StringBuffer result: " + sbf.toString());
        
        // Performance comparison demonstration
        demonstrateStringPerformance();
    }
    
    private static void demonstrateStringPerformance() {
        System.out.println("\n  Performance Comparison:");
        
        int iterations = 10000;
        
        // String concatenation (inefficient)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;
        
        // StringBuilder (efficient)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        String sbResult = sb.toString();
        long sbTime = System.currentTimeMillis() - startTime;
        
        System.out.println("    String concatenation time: " + stringTime + "ms");
        System.out.println("    StringBuilder time: " + sbTime + "ms");
        System.out.println("    StringBuilder is " + (stringTime / Math.max(sbTime, 1)) + "x faster");
    }
}
