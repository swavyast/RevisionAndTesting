package com.ml.revision.collections;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

public class ArraylistCollection {

    public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<Integer>();
	
	//Syntax error, insert "Dimensions" to complete ReferenceType
	//ArrayList<int> list2=new Arraylist<int>();
	list1.add(23);
	
	//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
	//list1.add("Hi");
	list1.add(2);
	list1.add(233);
	list1.add(90);
	
	//Incorrect number of arguments for type ArrayList<E>; it cannot be parameterized with arguments <>
	//ArrayList<> list3=new ArrayList<>();
	
	//ArrayList Without Type Parameter
	ArrayList list4=new ArrayList();
	list4.add("Kohli's");
	list4.add(1, "ODI Centuries : ");
	list4.add(50);
	
	//Collections.sort(list4);
	Collections.sort(list1);
	
	out.println(list1);
	out.println(list4);
	
    }

}
