package com.example.corejava;

import com.example.corejava.basics.*;
import com.example.corejava.collections.*;
import com.example.corejava.oop.*;
import com.example.corejava.exceptions.*;
import com.example.corejava.io.*;

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
        
        // Object-Oriented Programming Examples
        runOOPExamples();
        
        // Collections Examples
        runCollectionsExamples();
        
        // Exception Handling Examples
        runExceptionExamples();
        
        // File I/O Examples
        runIOExamples();
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
    
    private static void runOOPExamples() {
        System.out.println("2. Object-Oriented Programming:");
        System.out.println("-".repeat(30));
        
        // Classes and Objects
        ClassesAndObjects.demonstrate();
        
        // Inheritance
        InheritanceExample.demonstrate();
        
        // Polymorphism
        PolymorphismExample.demonstrate();
        
        // Abstract Classes and Interfaces
        AbstractionExample.demonstrate();
        
        System.out.println();
    }
    
    private static void runCollectionsExamples() {
        System.out.println("3. Collections Framework:");
        System.out.println("-".repeat(30));
        
        CollectionsExample.demonstrate();
        
        System.out.println();
    }
    
    private static void runExceptionExamples() {
        System.out.println("4. Exception Handling:");
        System.out.println("-".repeat(30));
        
        ExceptionHandlingExample.demonstrate();
        
        System.out.println();
    }
    
    private static void runIOExamples() {
        System.out.println("5. File I/O Operations:");
        System.out.println("-".repeat(30));
        
        FileIOExample.demonstrate();
        
        System.out.println();
    }
}
