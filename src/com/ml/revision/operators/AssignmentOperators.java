package com.ml.revision.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		byte b1, b2, b3;
		a = 10;
		b = 20;
		c = 30;
		b1 = 33;
		b2 = 44;
		b3 = 55;
		//short s1 = b;
		//Type mismatch: cannot convert from int to short
		short s2 = (short) b; //explicit typecasting
		System.out.println(a+" "+b+" "+c+" "+b1+" "+b2+" "+b3);
		System.out.println(s2);
		long l1 = a; //implicit type casting
		System.out.println(l1);
	}

}
