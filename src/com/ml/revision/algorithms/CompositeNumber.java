package com.ml.revision.algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * a natural number or a positive integer which has 'more than two factors' is termed as a composite number.
 * i.e. 15(factors : 1, 3, 5)
 * */
public class CompositeNumber {
    static ArrayList<Integer> al = new ArrayList<Integer>();
    
    public static boolean isCompositeNumber(int n) {
	
	int temp = n;
	boolean flag = false;
	
	for(int i = 1; i<=n;) {
	    if(n%i>=0) {
		if(n%i==0)
		    al.add(i);
		i++;
	    }
	    if(al.size()>2) {
		flag = true;
	    }
	}
	
	return flag;
    }

    public static void main(String[] args) {
	
	int count = 0;
	int a[] = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39,
		   40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69, 70, 72,
		   74, 75, 76, 77, 78, 80, 81, 82, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 98, 99, 100, 102, 104,
		   105, 106, 108, 110, 111, 112, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 128, 129,
		   130, 132, 133, 134, 135, 136, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 150};
	for(int i:a) {
	System.out.println(CompositeNumber.isCompositeNumber(i));
	count++;
	}
	System.out.println(Array.getLength(a));
	System.out.println(count);
	System.out.println(Array.getLength(a)==count);
//	for(int i : CompositeNumber.al) {
//	    System.out.println(i);
//	}

    }

}
