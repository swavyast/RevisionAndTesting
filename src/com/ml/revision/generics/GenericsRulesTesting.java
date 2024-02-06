package com.ml.revision.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class GenericsRulesTesting {

	public static void main(String[] args) {
//		List<Animal> li = new ArrayList<Dog>();
//		Type mismatch: cannot convert from ArrayList<Dog> to List<Animal>
		Set<Animal> set = new HashSet<Animal>();	//ok
//		Map<I1, Integer> map = new HashMap<Child, Integer>();
//		Type mismatch: cannot convert from HashMap<Child,Integer> to Map<I1,Integer>
		Queue<I1> queue = new ConcurrentLinkedQueue<I1>(null);	//ok
		List<I1> list = new ArrayList<I1>();
	}

}

class Animal{}
class Dog extends Animal{}
interface I1{}
class Child implements I1{}