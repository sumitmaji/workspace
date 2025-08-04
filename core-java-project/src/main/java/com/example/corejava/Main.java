package com.example.corejava;

import com.example.corejava.basics.*;

/**
 * Main class demonstrating various core Java concepts
 * 
 * @author Your Name
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Core Java Examples ===");
        System.out.println();
        
        // Basic Java Examples
        runBasicExamples();
    }
    
    private static void runBasicExamples() {
        System.out.println("1. Basic Java Examples:");
        System.out.println("-".repeat(30));
        
        // Variables and Data Types
        VariablesAndDataTypes.demonstrate();
        
        // Control Structures
        ControlStructures.demonstrate();
        
        // Arrays
        ArraysExample.demonstrate();
        
        // Strings
        StringsExample.demonstrate();
        
        System.out.println();
    }
    
}
