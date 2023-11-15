package com.ml.revision.wrappers;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<>();

	//autoboxing
	list.add(5);	//5 is primitive type
	list.add(6);	//6 is primitive type
	
	/**
	 * But, as we know data structures like ArrayList, LinkedList and Vector store object types only
	 * compiler is going to convert these primitive types to their corresponding wrapper classes.
	 *  */

	System.out.println("ArrayList: " + list);
    }

}
