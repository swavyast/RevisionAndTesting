package com.ml.revision.jvmworking;

public class WhyMainIsPublic {
	
	private static void oneMorePrivateStaticMethod() {
		System.out.println("This is oneMorePrivateStaticMethod.");
	}

	private static void myPrivateMethod() {
		System.out.println("This is a private method.");
		oneMorePrivateStaticMethod();
	}

	public static void main(String[] args) {
		myPrivateMethod();
	}

}
