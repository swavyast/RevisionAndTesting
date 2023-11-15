package com.ml.revision.wrappers;

import java.util.ArrayList;

public class Unboxing {

    public static void main(String[] args) {

	      ArrayList<Integer> list = new ArrayList<>();

	      //autoboxing
	      list.add(5);
	      list.add(6);

	      System.out.println("ArrayList: " + list);

	      // unboxing
	      int a = list.get(0);
	      System.out.println("Value at index 0: " + a);
	   }
}
