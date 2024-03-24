/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int[] a, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    // To swap the numbers if they are in the wrong order
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.println("Array before sorting:");
        printArray(arr);

        bubbleSort(arr, n);

        System.out.println("\nArray after sorting:");
        printArray(arr);
    }

    // To print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Time complexity is O(N^2)
}
