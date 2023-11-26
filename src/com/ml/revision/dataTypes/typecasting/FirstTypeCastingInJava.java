package com.ml.revision.dataTypes.typecasting;

public class FirstTypeCastingInJava {

    public static void main(String[] args) {
	/*
	 * smaller data types can be directly type-casted into larger data types without doing anything in particular.
	 * this kind of type-casting is known as implicit type-casting.
	 * */
	byte x=97;
	short y=x;
	int a=y;
	long b=a;
	//long(64 bit/8byte) has smaller range than float(32bit/4byte).
	float c=b;
	double d=c;
	System.out.println("\n\nbyte representation : "+x);
	System.out.println("\n\nshort representation : "+y);
	System.out.println("\n\nint representation : "+a);
	System.out.println("\n\nlong representation : "+b);
	System.out.println("\n\nfloat representation : "+c);
	System.out.println("\n\ndouble representation : "+d);
    }

}
