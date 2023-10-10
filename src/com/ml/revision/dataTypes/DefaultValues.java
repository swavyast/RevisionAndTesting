package com.ml.revision.dataTypes;

public class DefaultValues {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	public static void main(String[] args) {
		DefaultValues dv=new DefaultValues();
		System.out.println(dv.b);
		System.out.println(dv.s);
		System.out.println(dv.i);
		System.out.println(dv.l);
		System.out.println(dv.f);
		System.out.println(dv.d);
		System.out.println(dv.bool);
		System.out.println(dv.c+"<-(blank_space)"); //blank space
	}

}
