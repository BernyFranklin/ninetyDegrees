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
        // Declare List for processing
        System.out.println( "Hello World!" );
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
}
