package com.ml.revision.algorithms;

import java.util.Scanner;

public class FibonacciUsingLoop {

    public static void main(String[] args) {
	float first = 0;
	float second = 1;
	float next = first + second;
	System.out.println("number of terms for the fibonacci is : ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	System.out.print(first +" "+ second);
	for(int i = 3; i<=n;++i) {
	    System.out.print(" "+new java.text.DecimalFormat("#").format(next));
	    first = second;
	    second = next;
	    next = first + second;
	}
    }

}
