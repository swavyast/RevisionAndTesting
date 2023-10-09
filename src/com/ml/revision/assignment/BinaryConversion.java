package com.ml.revision.assignment;

public class BinaryConversion {
	static int number=2147483647;
	static int temp=number;
	static String binary="";
	static {
	while(number!=0) {
		binary=binary+number%2;
		number=number/2;
	}
	System.out.println(binary.length());
	char [] carr= new char[binary.length()];
	carr=binary.toCharArray();
	String result="";
	for(int i=carr.length-1; i>=0;i--) {
		result=result+carr[i];
		if(i%4==0&&i!=0) {
			result=result+",";
		}
	}
	System.out.println("Binary representation of "+temp+" is : "+result);
	}

	public static void main(String[] args) {
		

	}

}
