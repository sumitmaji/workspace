package com.example.corejava.basics;

/**
 * Demonstrates control structures in Java
 */
public class ControlStructures {
    
    public static void demonstrate() {
        System.out.println("Control Structures:");
        
        // If-else statements
        demonstrateIfElse();
        
        // Switch statement
        demonstrateSwitch();
        
        // Loops
        demonstrateLoops();
    }
    
    private static void demonstrateIfElse() {
        System.out.println("\n  If-Else Statements:");
        
        int score = 85;
        String grade;
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("    Score: " + score + ", Grade: " + grade);
        
        // Ternary operator
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("    Result: " + result);
    }
    
    private static void demonstrateSwitch() {
        System.out.println("\n  Switch Statement:");
        
        int dayOfWeek = 3;
        String dayName;
        
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        
        System.out.println("    Day " + dayOfWeek + " is " + dayName);
        
        // Enhanced switch (Java 14+)
        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };
        System.out.println("    " + dayName + " is a " + dayType);
    }
    
    private static void demonstrateLoops() {
        System.out.println("\n  Loops:");
        
        // For loop
        System.out.print("    For loop (1-5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop
        System.out.print("    While loop (countdown): ");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // Do-while loop
        System.out.print("    Do-while loop: ");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 3);
        System.out.println();
        
        // Enhanced for loop (for-each)
        System.out.print("    Enhanced for loop: ");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Break and continue
        System.out.print("    Break and continue (skip even): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;  // Skip even numbers
            if (i > 7) break;  // Stop after 7
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
