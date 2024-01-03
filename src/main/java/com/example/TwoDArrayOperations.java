package com.example;

import java.util.Arrays;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print a 2D Array
        // TODO: Initialize a 2D array of integers and print its contents in a matrix
        // form.
        int myarray[][] = new int[2][10];
        System.out.println(myarray);

    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        // TODO: Implement the logic to find the maximum value in the 2D array.
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if(array[i][j]>max);
                max = array[i][j];

            }
        }
        return max;
    }

    // Placeholder return value

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    return true; 
                }
            }
        }

        // Value not found in the entire array
        return false;
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        double count = 0;
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            // Iterate through columns
            for (int j = 0; j < array[i].length; j++) {
                count += array[i][j];
                sum++;
            }
        
                // Check if the current element is equal to the specified value
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
       
    }
    double average = count / sum;
    return  average;
}
    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][i];
            }
        return sum; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        int[] flattened = Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();

        return flattened; // Placeholder return value
    }
}


