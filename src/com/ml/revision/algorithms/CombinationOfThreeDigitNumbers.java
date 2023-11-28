package com.ml.revision.algorithms;

import java.util.Scanner;

/**
 * Write a program to print the combination of three digit numbers.
 * example: if the digits of numbers are 1, 2 and 3, print : 123, 132, 231, 213, 312 and 321.
 * */
public class CombinationOfThreeDigitNumbers {
    
    public static int length = 0;

    public static void main(String[] args) {
	System.out.println("Enter your digits : ");
	Scanner scanner = new Scanner(System.in);
	int inputArray[] = new int[3];
	for(int x=0; x<3; x++)
	inputArray[x] = scanner.nextInt();
	scanner.close();
	for(int x=0;x<3;x++) {
	    for(int y=0;y<3;y++) {
		for(int z=0; z<3;z++) {
		    if(x!=y&&y!=z&&z!=x)
		   System.out.println("Combination with first digit as : "+(x+1)+" - "+inputArray[x]+inputArray[y]+inputArray[z]+"\n"); 
		}
	    }
	}
    }

}
