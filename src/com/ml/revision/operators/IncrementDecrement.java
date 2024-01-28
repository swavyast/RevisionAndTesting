package com.ml.revision.operators;

public class IncrementDecrement {

	private static void testingIncrementDecrement() {
		int value = 99;
		--value; // 98
		System.out.println(value); // 98
		++value; // 99
		System.out.println(value); // 99
		value--; // 99
		System.out.println(value); // 98
		value++; // 98
		System.out.println(value); // 99
		++value; // 100
		System.out.println(value); // 100
		System.out.println(value--);// 100
		System.out.println(value); // 99
		System.out.println(++value);// 100
		System.out.println(--value);// 99
		System.out.println(value++);// 99
		System.out.println(--value);// 99
	}

	public static void main(String[] args) {

		int num = 10;
		int sum = ++num; // 11
		System.out.println(sum);
		sum = num++; // 11
		System.out.println(sum);
		System.out.println(num); // 12
		int bigSum = sum++;
		System.out.println(bigSum); // 11
		System.out.println(sum); // 12
		++bigSum;
		System.out.println(bigSum); // 12

		testingIncrementDecrement();
	}

}
