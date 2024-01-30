package com.ml.revision.oops.constructors;

/**
 * A program to test if a class can be instantiated without default constructor
 * or not. It also verifies, if super and this keywords can be used together or
 * not.
 */
class Test implements Cloneable {
	int test;

	public Object clone() {
		Test t = null;
		try {
			t = (Test) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return t;
	}

	Test(int x) {
		super();
		this.test = x;
		System.out.println(super.getClass());
		System.out.println("Default Constructor in Test Class");
	}
	// final Test() {} Illegal modifier for the constructor in type Test; only
	// public, protected & private are permitted.
	// static Test() {} Illegal modifier for the constructor in type Test; only
	// public, protected & private are permitted.
	// abstract Test() {} Illegal modifier for the constructor in type Test; only
	// public, protected & private are permitted.
}

public class Constructors {

	public static void main(String[] args) {
		Test t1 = new Test(10); // Default Constructor in Test Class
		System.out.println(t1.test);
		Test t2 = null;
	}
}
