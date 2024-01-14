package com.ml.revision.algorithms;

import java.util.Scanner;

/**
 * Q1. Maximum Subarray Sum Given an array of numbers, find the maximum sum of
 * any contiguous subarray of the array. For example, given the array [34, -50,
 * 42, 14, -5, 86], the maximum sum would be 137, since we would take elements
 * 42, 14, -5, and 86. Given the array [-5, -1, -8, -9], the maximum sum would
 * be -1. Follow up: Do this in O(N) time.
 * 
 * Input Format: The first line of input contains size of array, which is
 * denoted by N and second line of input contains N space separated integers.
 * Output Format: The first and only line of output should print the maximum
 * subarray sum, as described in the description.
 */
public class MaxSumOfSubarray {
    int len = 0;

    public void myMethod() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	len = sc.nextInt();
	int i = 0;

    }

    public static void main(String[] args) {
	MaxSumOfSubarray msa = new MaxSumOfSubarray();
	msa.myMethod();
    }

}
