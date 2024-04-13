package com.ml.revision.streams;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {
		Map<String, String> userDetails = new HashMap<>();
		userDetails.put("user_one", "password_1");
		userDetails.put("user_two", "password_2");
		userDetails.put("user_three", "password_3");
		userDetails.put("user_four", "password_4");
		userDetails.put("user_five", "password_5");
		userDetails.put("user_six", null);
		userDetails.put(null, null);
		userDetails.put("user_eight", "password_8");
		Set<String> keySet = userDetails.keySet();
		Collection<String> values = userDetails.values();
		Set<Entry<String, String>> entrySet = userDetails.entrySet();
		keySet.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
		values.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
		entrySet.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n\n\n");
		Set<?> set = Stream.of(userDetails).filter(x->x.keySet().contains(new String("user_two"))).collect(Collectors.toSet());
		System.out.println(set);
	}

}
