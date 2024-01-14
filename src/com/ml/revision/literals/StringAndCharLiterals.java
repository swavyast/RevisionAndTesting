package com.ml.revision.literals;

public class StringAndCharLiterals {

	public static void main(String[] args) {
		//String s1 = """;
		String s1 = "\"";
		char c1 = '\'';
		System.out.println(s1);
		System.out.println(c1);
		System.out.println("\"");
		System.out.println('\'');
		System.out.println("My \"String\" ");
		System.out.println('m');
		//System.out.println('m'+'y'+'\t'+'"'+'S'+'t'+'r'+'i'+'n'+'g'+'"'); //938
		char c[] = {'m','y',' ','"','S','t','r','i','n','g', '"'};
		for(char c2 : c)
			System.out.print(c2);
		String s2 = "\nmy name is Ami\t Shukla a\nd my \brother's name is Sumit";
		//my name is Ami   Shukla a
		//d myrother's name is Sumit
		System.out.println(s2);
	}

}
