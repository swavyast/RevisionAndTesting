package com.ml.revision.dataTypes;

public class HandlingIntegers {
	int x=2147483647;
	int y=-2147483648;
	int a=0;
	int b=-0; //same as 0
	//int ab=08; /* literal 09 is out of range */
	int bc=07;
	int xy=80;
	public static void main(String[] args) {
		HandlingIntegers hi=new HandlingIntegers();
		System.out.println(hi.x);
		System.out.println(hi.y);
		System.out.println(hi.a);
		System.out.println(hi.b);
		System.out.println(hi.bc);
		System.out.println(hi.xy);
	}
}
