package com.ml.revision.streams;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		System.out.println("Example1.main()");
		names.add("Himanshu Rai");
		names.add("Hemant Rai");
		names.add("Amit Rai");
		names.add(null); // filtered
		names.add("Suman Rai");
		names.add("Rohit Rai");
		names.add("Shudhanshu Rai");
		names.add("Poonam Rai");
		names.add(""); // can not be filtered using null check as it's an empty string not null value.
		names.stream().filter(x -> x != null).map(String::toUpperCase).sorted().forEach(x->System.out.print(x+"\t"));
		System.out.println();
		names.stream().filter(x -> x != null).map(String::toUpperCase).sorted().limit(4).forEach(x->System.out.print(x+"\t"));
		System.out.println();
		names.stream().filter(x -> x != null).map(String::toUpperCase).sorted().limit(4).skip(1).forEach(x->System.out.print(x+"\t"));
		System.out.println();
		Object[] n = names.stream().filter(x -> x != null).map(String::toUpperCase).sorted().limit(4).skip(1).toArray();
		System.out.println(n.length);
		String[] str = new String[3];
		int i = 0;
		for(Object o : n) {
			str[i] = o.toString();
			i++;
		}
		for(String s : str)
			System.out.println(s);
		System.out.println("*******************");
	}

}
