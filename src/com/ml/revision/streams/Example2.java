package com.ml.revision.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(15);
		numbers.add(5);
		numbers.add(115);
		numbers.add(125);
		numbers.add(155);
		numbers.add(17);
		numbers.add(105);
		numbers.add(157);
		numbers.add(12);
		
		//sum of list
		Optional<Integer> op = numbers.stream().reduce((a,b)->a+b);
		System.out.println(op.orElse(0));
		System.out.println(Arrays.stream(numbers.toArray()).map(x->Integer.parseInt(x.toString())).reduce((a,b)->a+b).orElse(0));
		//max element in list
		Integer max = numbers.stream().max(Comparable::compareTo).orElse(0);
		System.out.println(max);
		System.out.println(numbers.stream().max((x, y)->x.compareTo(y)).orElse(0));
		
		//min element in list
		System.out.println(numbers.stream().min((x, y)->x.compareTo(y)).orElse(0));
		Integer min = numbers.stream().min(Comparable::compareTo).orElse(0);
		System.out.println(min);
		
		//collect the modified list
		
		List<Integer> list = numbers.stream().distinct().filter(x->x%2!=0).collect(Collectors.toList());
		List<Integer> list1 = numbers.stream().distinct().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("\n"+list+"\n\n"+list1);
	}

}
