package com.ml.revision.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println(10 & 22); // 2 ->bitwise AND performs AND operation on binary representation of the given
										// inputs.
		System.out.println(10 | 22); // 30 ->bitwise OR performs OR operation on binary representation of the given
										// inputs.
		System.out.println(20 >> 1); // 10 ->right shift performs devide by two operation
		System.out.println(20 >> 2); // 5
		System.out.println(20 >> 4); // 1
		System.out.println(-20 >> 2); // -5(11111111111111111111111111111011) -> -20 =
										// 11111111111111111111111111101100
		System.out.println(20 >>> 1); // 10 ->Unsigned right shift performs devide by two operation
		System.out.println(20 >>> 2); // 5
		System.out.println(20 >>> 4); // 1
		System.out.println(-20 >>> 2);//
		/*
		 * 20 = 00000000000000000000000000010100
		 * -20 = 11111111111111111111111111101100
		 * 11111111111111111111111111101100 >>> 2 = 00111111111111111111111111111011
		 * 00111111111111111111111111111011 = 1073741819
		 */
		System.out.println(-20 >>> 31);//1
		System.out.println(-20 >>> 32);//-20
		System.err.println("=============");
		System.out.println(-20 >>> 33);//2147483638(Integer.MAX_VALUE)
		System.err.println("=============");
		System.out.println(20 << 1); // 10 ->left shift performs multiply by two operation
		System.out.println(20 << 2); // 80
		System.out.println(20 << 4); // 320
		System.err.println("=============");
		System.out.println(-789075432 << 2); // 1138665568
		System.out.printf("%d%n", -789075432 << 2); // 1138665568
		/*
		 * -3156301728, this value is out of signed integer range that's why it's being
		 * treated as a positive integer. Possible solution can be as discussed below
		 */
		System.err.println("=============");
		System.out.printf("%d%n", ((long) -789075432) << 2); // -3156301728
	}

}
