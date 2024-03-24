/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x) {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    //Time Complexity is O(Log n)
    //Space complexity is O(1) (Constant)
}
