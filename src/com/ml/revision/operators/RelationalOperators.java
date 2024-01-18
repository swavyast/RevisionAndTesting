package com.ml.revision.operators;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println(a==b);	//false
		System.out.println(a>b);	//false
		System.out.println(a<b);	//true
		System.out.println(a>=b);	//false
		System.out.println(a<=b);	//true
		System.out.println(a!=b);	//true
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}else {
			System.out.println("value of b that is "+b+", is greater than the value of a that is, "+a);
		}
		
		if(a>b||b<a||b==30||b++>a) {
			System.out.println(b); //30
		}
		if(a>b||b<a||b++>a||b==30) {
			System.out.println(b); //31
		}
	}

}
