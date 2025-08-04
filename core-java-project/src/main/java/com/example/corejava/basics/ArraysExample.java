package com.example.corejava.basics;

import java.util.Arrays;

/**
 * Demonstrates arrays in Java
 */
public class ArraysExample {
    
    public static void demonstrate() {
        System.out.println("Arrays:");
        
        // Single-dimensional arrays
        demonstrateSingleDimensionalArrays();
        
        // Multi-dimensional arrays
        demonstrateMultiDimensionalArrays();
        
        // Array operations
        demonstrateArrayOperations();
    }
    
    private static void demonstrateSingleDimensionalArrays() {
        System.out.println("\n  Single-Dimensional Arrays:");
        
        // Declaration and initialization
        int[] numbers1 = new int[5];  // Declaration with size
        int[] numbers2 = {1, 2, 3, 4, 5};  // Declaration with values
        int[] numbers3 = new int[]{10, 20, 30, 40, 50};  // Another way
        
        // Assigning values
        numbers1[0] = 100;
        numbers1[1] = 200;
        numbers1[2] = 300;
        numbers1[3] = 400;
        numbers1[4] = 500;
        
        System.out.println("    numbers1: " + Arrays.toString(numbers1));
        System.out.println("    numbers2: " + Arrays.toString(numbers2));
        System.out.println("    numbers3: " + Arrays.toString(numbers3));
        System.out.println("    Array length: " + numbers1.length);
        
        // String array
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("    fruits: " + Arrays.toString(fruits));
    }
    
    private static void demonstrateMultiDimensionalArrays() {
        System.out.println("\n  Multi-Dimensional Arrays:");
        
        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("    2D Array (matrix):");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("      " + Arrays.toString(matrix[i]));
        }
        
        // Jagged array
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("    Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("      " + Arrays.toString(jaggedArray[i]));
        }
    }
    
    private static void demonstrateArrayOperations() {
        System.out.println("\n  Array Operations:");
        
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("    Original: " + Arrays.toString(numbers));
        
        // Sorting
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        System.out.println("    Sorted: " + Arrays.toString(sortedNumbers));
        
        // Searching
        int searchValue = 25;
        int index = Arrays.binarySearch(sortedNumbers, searchValue);
        System.out.println("    Index of " + searchValue + " in sorted array: " + index);
        
        // Fill
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("    Filled with 42: " + Arrays.toString(filledArray));
        
        // Copy
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println("    First 3 elements copied: " + Arrays.toString(copiedArray));
        
        // Compare
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("    Arrays equal: " + areEqual);
        
        // Sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("    Sum: " + sum + ", Average: " + average);
    }
}
