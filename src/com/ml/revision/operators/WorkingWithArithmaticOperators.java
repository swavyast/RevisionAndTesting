package com.ml.revision.operators;

public class WorkingWithArithmaticOperators {

	public static void main(String[] args) {
		int a = 10;
		byte b = 20;
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		String s1 = "15";
		String s2 = "602";
		//System.out.println(s2/s1);
		//The operator / is undefined for the argument type(s) java.lang.String, java.lang.String
		System.out.println(Integer.parseInt(s2)/Integer.parseInt(s1)); //40
		char c1 = '8';
		char c2 = '2';
		System.out.println(c1/c2); //1
		System.out.println(c1%c2); //6
		System.out.println(c1+c2); //106
		System.out.println(c1-c2); //6
		System.out.println(c2-c1); //-6
		System.out.println(c1); //8
		System.out.println("(int)c1+(int)c2 : "+(int)c1+(int)c2);  //5650
		System.out.println(Character.getNumericValue(c1)+Character.getNumericValue(c2)); //10
		System.out.println(Character.getNumericValue(c1)-Character.getNumericValue(c2)); //6
		System.out.println(Character.getNumericValue(c1)*Character.getNumericValue(c2)); //16
		System.out.println(Character.getNumericValue(c1)/Character.getNumericValue(c2)); //4
		System.out.println(Character.getNumericValue(c1)%Character.getNumericValue(c2)); //0
	}

}
