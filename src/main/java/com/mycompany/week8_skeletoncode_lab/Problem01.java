/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  

        long sum = 0;

        // Check each number from 2 to n for primality
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i; // Add prime numbers to the sum
            }
        }
        return sum;
    }
    //Run n times
    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
    //Run n times
    //Space complexity is O(N)
    //The time complexity is O(N^2)

    public static void main(String[] args) {
        int n = 20; // Test with n = 10
        long sum = getSumOfPrimes(n);
        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
    }
}
