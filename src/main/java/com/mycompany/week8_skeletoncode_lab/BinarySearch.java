/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 9;
        int low = 0;
        int high = sortedArray.length - 1;

        int index = runBinarySearchIteratively(sortedArray, key, low, high);

        if (index != Integer.MAX_VALUE) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
//The Time Complexity is O(Log n)
//Space Complexity is O(1) (Constant)