package com.ninetydegrees;

import java.util.LinkedList;

/**
 * Given an N by N matrix, rotate it by 90 degrees clockwise
 * For example, given the following matrix
 * [[1, 2, 3]
 *  [4, 5, 6]
 *  [7, 8, 9]]
 * You should return
 * [[7, 4, 1]
 *  [8, 5, 2]
 *  [9, 6, 3]]
 * 
 *      original index      90 index
 * 1    0,0                 0,2
 * 2    0,1                 1,2
 * 3    0,2                 2,2
 * 4    1,0                 0,1
 * 5    1,1                 1,1
 * 6    1,2                 2,1
 * 7    2,0                 0,0
 * 8    2,1                 1,0
 * 9    2,2                 2,0
 *
 */
public class App 
{
    //Main
    public static void main( String[] args )
    {
        // Initialize array
        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        // Print orginal array
        System.out.printf("\nOriginal array:");
        printArray(arr);
        // Declare List for processing
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Send to function
        list = arrToList(arr);
        arr = newArray(list, arr);

        // Test Print
        
    }

    // Take array and put into list
    private static LinkedList<Integer> arrToList(Integer[][] arr) {
        // Declare list 
        LinkedList<Integer> numList = new LinkedList<Integer>();
        // Iterate through each dimension in array
        for (int i = 0; i < arr.length; i++) {
            // Iterate through each element for each dimension
            for (int j = 0; j <arr[i].length; j++) {
                // Add elem to list
                numList.add(arr[i][j]);
            }
        }
        // Return List
        return numList;
    }

    // Take number list and create new array
    private static Integer[][] newArray(LinkedList<Integer> list, Integer[][] oldArr){
        // Create new array with old dimensions
        Integer[][] newArr = new Integer[oldArr.length][oldArr.length];
        // Iterate through list and add elements
        for (int i = oldArr.length - 1 ; i >= 0; i--){
            // Add elements from list to array of arrays
            for (int j = 0; j < oldArr.length; j++) {
                newArr[j][i] = list.getFirst();
                // Remove element from list
                list.removeFirst();
            }
        }
        // Return new array
        return newArr;
    }

    // Print a graphical array
    private static void printArray(Integer[][] arr) {
        // Iterate through array to print it
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    System.out.printf("\n");
                }
                System.out.printf("%d\t", arr[i][j]);
            }
        }
    }
}
